package rnd.webapp.mwt.client.gwtext.mvc.field.data;

import java.util.List;

import rnd.expression.Expression;
import rnd.webapp.mwt.client.Logger;
import rnd.webapp.mwt.client.bean.ValueChangeEvent;
import rnd.webapp.mwt.client.bean.ValueChangeListenerAdapter;
import rnd.webapp.mwt.client.data.FilterInfo;
import rnd.webapp.mwt.client.data.Row;
import rnd.webapp.mwt.client.data.RowCacheImpl;
import rnd.webapp.mwt.client.gwtext.mvc.field.data.text.GWTExtTextField;
import rnd.webapp.mwt.client.mvc.MVCHandlerFactory;
import rnd.webapp.mwt.client.mvc.field.Table.RowTableModel;
import rnd.webapp.mwt.client.mvc.field.data.ReferenceField;
import rnd.webapp.mwt.client.mvc.page.board.DataBoard;
import rnd.webapp.mwt.client.mvc.page.board.FormBoard;
import rnd.webapp.mwt.client.mvc.page.board.Board.BoardType;
import rnd.webapp.mwt.client.utils.ObjectUtils;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Panel;
import com.gwtext.client.core.EventObject;
import com.gwtext.client.widgets.Button;
import com.gwtext.client.widgets.event.ButtonListenerAdapter;
import com.gwtext.client.widgets.form.Field;
import com.gwtext.client.widgets.form.FormPanel;
import com.gwtext.client.widgets.form.event.TextFieldListenerAdapter;

public class GWTExtReferenceField extends GWTExtTextField implements ReferenceField {

	private Panel referenceFieldPanel;

	public GWTExtReferenceField(String label, String moduleName, String applicationBeanName, String viewName) {
		super(label);

		setValue(MODULE_NAME, moduleName);
		setValue(APPLICATION_BEAN_NAME, applicationBeanName);
		setValue(VIEW_NAME, viewName);

		setModel(new GWTExtReferenceFieldModel());
		setView(new GWTExtReferenceFieldView());
	}

	public String getFieldProperty() {
		return VALUE;
	}

	// Model

	public class GWTExtReferenceFieldModel extends GWTExtTextFieldModel implements ReferenceFieldModel {
		//
		// private FilterResetTracker filterResetTracker = new FilterResetTracker();
		//
		// private class FilterResetTracker implements XChangeListener {
		// public void stateChanged(XChangeEvent changeEvent) {
		// Object search = search(getDisplayText());
		// if (search == null) {
		// setValue(null);
		// }
		// }
		// }
		//
		// public GWTExtReferenceFieldModel() {
		// addValueChangeListener(FILTER, new ValueChangeListenerAdapter<FilterInfo>() {
		//
		// public void valueChanged(ValueChangeEvent<FilterInfo> vce) {
		// FilterInfo oldFilterInfo = vce.getOldValue();
		// if (oldFilterInfo != null) {
		//
		// Object[] filterParamExpressionObjects = oldFilterInfo.getFilterParamExpressionObjects();
		// Expression[] filterParamExpressions = oldFilterInfo.getFilterParamExpressions();
		//
		// for (int i = 0; i < filterParamExpressions.length; i++) {
		// Expression expression = filterParamExpressions[i];
		// expression.removeXChangeListener(filterParamExpressionObjects[i], filterResetTracker);
		// }
		// }
		//
		// FilterInfo newFilterInfo = vce.getNewValue();
		// if (newFilterInfo != null) {
		//
		// Object[] filterParamExpressionObjects = newFilterInfo.getFilterParamExpressionObjects();
		// Expression[] filterParamExpressions = newFilterInfo.getFilterParamExpressions();
		//
		// for (int i = 0; i < filterParamExpressions.length; i++) {
		// Expression expression = filterParamExpressions[i];
		// expression.addXChangeListener(filterParamExpressionObjects[i], filterResetTracker);
		// }
		// }
		//
		// }
		//
		// });
		// }
	}

	private void setDisplayText() {
		String displayText = getDisplayText();
		setText(displayText);
	}

	private String getDisplayText() {
		Object reference = getReference();
		if (reference == null) { return ""; }
		String displayText = (String) ((ReferenceFieldView) getView()).getDisplayExpression().getValue(reference);
		return displayText;
	}

	// View

	public class GWTExtReferenceFieldView extends GWTExtTextFieldView implements ReferenceFieldView {

		public GWTExtReferenceFieldView() {

			addValueChangeListener(REFERENCE, new ValueChangeListenerAdapter<Row>() {

				public void valueChanged(ValueChangeEvent<Row> vce) {
					Row row = vce.getNewValue();
					if (row == null) {
						setValue(null);
						setText("");
					} else {
						RowCacheImpl.get().addRow(getModuleName(), getApplicationBeanName(), getViewName(), row);
						setValue(row.getId());
						setDisplayText();
					}
				}

			});

			addValueChangeListener(VALUE, new ValueChangeListenerAdapter<Long>() {

				public void valueChanged(ValueChangeEvent<Long> vce) {
					Long rowId = vce.getNewValue();
					if (rowId == null) {
						setReference(null);
						setText("");
					} else {
						if (getReference() == null || !((Row) getReference()).getId().equals(rowId)) {
							Row row = RowCacheImpl.get().getRow(getModuleName(), getApplicationBeanName(), getViewName(), rowId);
							setReference(row);
						}
						setDisplayText();
					}

				}
			});

			getTextField().addListener(new TextFieldListenerAdapter() {
				@Override
				public void onBlur(Field field) {
					try {
						// new RuntimeException().printStackTrace();
						Logger.startMethod("", "onBlur");
						String text = getText();
						Logger.log("text", text);

						if (text == null || text.trim().length() == 0) {
							Logger.log("setting null");

							setReference(null);
							setValue(null);
						} else {

							if (getDisplayText().equals(text)) {
								Logger.log("returning");
								return;
							}

							Logger.log("searhing");
							Object searchResult = search(text);
							Logger.log("searchResult", searchResult);

							if (searchResult == null) {

								Logger.log("refocusing");
								getTextField().focus();
								Logger.log("returning");

								return;
							}
							Logger.log("setting new ref");
							setReference(searchResult);
						}
					}
					finally {
						Logger.endMethod("", "onBlur");
					}
				}
			});

		}

		public Expression getDisplayExpression() {
			return (Expression) getValue(DISPLAY_EXPRESSION);
		}

		public void setDisplayExpresion(Expression expression) {
			setValue(DISPLAY_EXPRESSION, expression);
		}

		@Override
		public Object getViewObject() {
			return getReferenceField();
		}
	}

	protected Object getReferenceField() {
		if (this.referenceFieldPanel == null) {
			this.referenceFieldPanel = createReferenceField();
		}
		return this.referenceFieldPanel;
	}

	private Panel createReferenceField() {

		HorizontalPanel newReferenceFieldPanel = new HorizontalPanel();

		FormPanel textFieldPanel = new FormPanel();
		textFieldPanel.setBorder(false);
		textFieldPanel.add(getTextField());
		newReferenceFieldPanel.add(textFieldPanel);

		Button selector = new Button("...");
		selector.addListener(new ButtonListenerAdapter() {
			@Override
			public void onClick(Button button, EventObject e) {
				try {
					showDataBoard();
				}
				catch (RuntimeException re) {
					re.printStackTrace();
				}
			}
		});
		newReferenceFieldPanel.add(selector);

		return newReferenceFieldPanel;
	}

	public Object getValue() {
		return getValue(VALUE);
	}

	public void setValue(Object value) {
		setValue(VALUE, value);
	}

	public Object getReference() {
		return getValue(REFERENCE);
	}

	public void setReference(Object reference) {
		setValue(REFERENCE, reference);
	}

	public String getModuleName() {
		return (String) getValue(MODULE_NAME);
	}

	public String getApplicationBeanName() {
		return (String) getValue(APPLICATION_BEAN_NAME);
	}

	public String getViewName() {
		return (String) getValue(VIEW_NAME);
	}

	public FilterInfo getFilter() {
		return (FilterInfo) getValue(FILTER);
	}

	public void setFilter(FilterInfo filterInfo) {
		setValue(FILTER, filterInfo);
	}

	public Object search(String searchCriteria) {
		try {
			Logger.startMethod("GWTExtReferenceField", "search");
			Logger.log("searchCriteria", searchCriteria);

			Expression displayExpression = ((ReferenceFieldView) getView()).getDisplayExpression();
			List<Row> rows = ((RowTableModel) getDataBoard().getDataTable().getModel()).getDataTable().getRows();

			for (Row row : rows) {

				Object value = displayExpression.getValue(row);
				Logger.log("value", value);

				if (ObjectUtils.areEqual(value, searchCriteria)) {
					Logger.log("returning", row);
					return row;
				}

			}
			Logger.log("returning null");
			return null;
		}
		catch (RuntimeException re) {
			re.printStackTrace();
			Logger.log("returning null");
			return null;
		}
		finally {
			Logger.endMethod("GWTExtReferenceField", "search");
		}

	}

	private DataBoard getDataBoard() {
		DataBoard dataBoard = (DataBoard) getFormBoard().getActionBase().getBoard(getModuleName(), getApplicationBeanName(), getViewName(), BoardType.DATA_BOARD);

		if (dataBoard == null) {
			dataBoard = MVCHandlerFactory.getMVCHandler().createDataBoard(getModuleName(), getApplicationBeanName(), getViewName());
			getFormBoard().getActionBase().addBoard(dataBoard);
		}

		dataBoard.setReferenceField(GWTExtReferenceField.this);
		dataBoard.setFilter(getFilter());

		return dataBoard;
	}

	private FormBoard getFormBoard() {
		return (FormBoard) getParent().getParent();
	}

	private DataBoard showDataBoard() {
		DataBoard dataBoard = getDataBoard();
		getFormBoard().getActionBase().setCurrentBoard(dataBoard);
		return dataBoard;
	}

}