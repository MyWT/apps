package rnd.webapp.mwt.client.gwtext.mvc.page.board;

import java.io.Serializable;

import rnd.webapp.mwt.client.ARBAsyncCallback;
import rnd.webapp.mwt.client.ARBUtils;
import rnd.webapp.mwt.client.MWTHelper;
import rnd.webapp.mwt.client.application.FormHelper;
import rnd.webapp.mwt.client.application.ModuleHelper;
import rnd.webapp.mwt.client.bean.ApplicationBean;
import rnd.webapp.mwt.client.data.Row;
import rnd.webapp.mwt.client.data.RowCacheImpl;
import rnd.webapp.mwt.client.mvc.page.board.FormBoard;
import rnd.webapp.mwt.client.mvc.page.form.Form;
import rnd.webapp.mwt.client.mvc.page.form.Form.FormModel;
import rnd.webapp.mwt.client.rpc.ARCreator;
import rnd.webapp.mwt.client.rpc.ApplicationRequest;

import com.gwtext.client.widgets.Panel;

public class GWTExtFormBoard extends GWTExtBoard implements FormBoard {

	private Form form;

	public GWTExtFormBoard(String moduleName, String appBeanName) {
		super(moduleName, appBeanName, null);
		setView(new GWTExtFormBoardView());
	}

	public void setViewName(String viewName) {
		setValue(VIEW_NAME, viewName);
	}

	public Form getForm() {
		if (this.form == null) {
			this.form = createForm();
		}
		return this.form;
	}

	public BoardType getBoardType() {
		return BoardType.FORM_BOARD;
	}

	private Form createForm() {

		ModuleHelper moduleHelper = MWTHelper.getApplicationHelper().getModuleHelper(getModuleName());
		FormHelper formHelper = moduleHelper.getFormHelper(getApplicationBeanName());

		// Create Form
		Form newForm = formHelper.createForm();
		newForm.setParent(this);

		Long appBeanId = getApplicationBeanId();
		if (appBeanId == null) {
			ApplicationBean appBean = formHelper.createApplicationBean();
			((FormModel) newForm.getModel()).setApplicationBean(appBean);
		} else {

			ApplicationRequest req = ARCreator.createFindRequest(getModuleName(), getApplicationBeanName(), appBeanId);

			ARBUtils.getARB().executeRequest(req, new ARBAsyncCallback() {

				@Override
				public void onSuccess(Serializable result) {
					((FormModel) getForm().getModel()).setApplicationBean((ApplicationBean) result);
				}
			});
		}

		return newForm;
	}

	public void setApplicationBeanId(Long pkId) {
		setValue(APPLICATION_BEAN_ID, pkId);
	}

	public Long getApplicationBeanId() {
		return (Long) getValue(APPLICATION_BEAN_ID);
	}

	public class GWTExtFormBoardView implements FormBoardView {

		public Object getViewObject() {
			Panel formPanel = (Panel) getForm().getView().getViewObject();

			Long applicationBeanId = getApplicationBeanId();
			if (applicationBeanId == null) {
				formPanel.setTitle("New " + getApplicationBeanName());
			} else {
				Row row = RowCacheImpl.get().getRow(getModuleName(), getApplicationBeanName(), getViewName(), applicationBeanId);
				formPanel.setTitle(getApplicationBeanName() + " ( " + row.getDisplayName() + " )");
			}
			return formPanel;
		}

	}

}
