package rnd.webapp.mwt.client.mvc.page.form;

import java.util.List;

import rnd.webapp.mwt.client.bean.ApplicationBean;
import rnd.webapp.mwt.client.mvc.field.Field;
import rnd.webapp.mwt.client.mvc.field.Field.FieldView;
import rnd.webapp.mwt.client.mvc.page.Page;

public interface Form extends Page {

	String APPLICATION_BEAN = "applicationBean";

	void addField(Field field);

	void removeField(Field field);

	Field getField(int index);

	List<Field> getFields();

	public interface FormModel extends Model {

		void setApplicationBean(ApplicationBean applicationBean);

		ApplicationBean getApplicationBean();
	}

	public interface FormView extends PageView {

		FieldView add(FieldView childView);

		FieldView remove(FieldView childView);

	}
}
