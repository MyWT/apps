package rnd.webapp.mwt.client.mvc.page.board;

import rnd.webapp.mwt.client.mvc.page.form.Form;

public interface FormBoard extends Board {

	Form getForm();

	String APPLICATION_BEAN_ID = "applicationBeanId";

	void setApplicationBeanId(Long appBeanId);

	Long getApplicationBeanId();

	void setViewName(String viewName);

	public interface FormBoardView extends View {
	}
}
