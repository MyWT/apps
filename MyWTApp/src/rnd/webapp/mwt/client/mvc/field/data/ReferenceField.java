package rnd.webapp.mwt.client.mvc.field.data;

import rnd.expression.Expression;
import rnd.webapp.mwt.client.data.FilterInfo;
import rnd.webapp.mwt.client.mvc.field.data.text.TextField;

public interface ReferenceField extends TextField {

	String VALUE = "value";

	void setValue(Object value);

	Object getValue();

	String REFERENCE = "reference";

	void setReference(Object reference);

	Object getReference();

	String FILTER = "filter";

	FilterInfo getFilter();

	void setFilter(FilterInfo filterInfo);

	String MODULE_NAME = "moduleName";

	String getModuleName();

	String APPLICATION_BEAN_NAME = "appBeanName";

	String getApplicationBeanName();

	String VIEW_NAME = "viewName";

	String getViewName();

	Object search(String searchCriteria);

	public interface ReferenceFieldModel extends TextFieldModel {
	}

	public interface ReferenceFieldView extends TextFieldView {

		String DISPLAY_EXPRESSION = "displayExpression";

		void setDisplayExpresion(Expression expression);

		Expression getDisplayExpression();
	}
}