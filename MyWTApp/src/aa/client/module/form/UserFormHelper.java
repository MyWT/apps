package aa.client.module.form;

import rnd.webapp.mwt.client.application.AbstractFormHelper;
import rnd.webapp.mwt.client.bean.ApplicationBean;
import rnd.webapp.mwt.client.mvc.MVCHandlerFactory;
import rnd.webapp.mwt.client.mvc.field.data.text.TextField;
import rnd.webapp.mwt.client.mvc.page.form.Form;
import aa.client.User;

public class UserFormHelper extends AbstractFormHelper {

	public String getFormName() {
		return "User";
	}

	public String getViewName() {
		return "User";
	}

	public Form createForm() {

		Form form = super.createForm();

		TextField userName_TextBox = MVCHandlerFactory.getMVCHandler().createTextField("User Name");
		userName_TextBox.setBoundTo("userName");
		form.addField(userName_TextBox);

		return form;
	}

	public ApplicationBean createApplicationBean() {
		return new User();
	}

}
