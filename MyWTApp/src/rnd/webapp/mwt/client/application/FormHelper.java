package rnd.webapp.mwt.client.application;

import rnd.webapp.mwt.client.bean.ApplicationBean;
import rnd.webapp.mwt.client.mvc.page.form.Form;

public interface FormHelper {

	String getFormName();

	String getViewName();

	Form createForm();

	ApplicationBean createApplicationBean();

}
