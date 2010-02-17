package rnd.webapp.mwt.client.gwtext.mvc.page.form;

import java.util.List;

import rnd.webapp.mwt.client.bean.ApplicationBean;
import rnd.webapp.mwt.client.bean.BindingManager;
import rnd.webapp.mwt.client.bean._BoundBean;
import rnd.webapp.mwt.client.bean.ValueChangeEvent;
import rnd.webapp.mwt.client.bean.ValueChangeListenerAdapter;
import rnd.webapp.mwt.client.gwtext.mvc.page.GWTExtPage;
import rnd.webapp.mwt.client.mvc.field.Field;
import rnd.webapp.mwt.client.mvc.page.form.Form;

import com.gwtext.client.widgets.Panel;
import com.gwtext.client.widgets.form.FormPanel;

public class GWTExtForm extends GWTExtPage implements Form {

	public GWTExtForm() {
		setModel(new GWTExtFormModel());
	}

	protected Panel createPanel() {
		FormPanel formPanel = new FormPanel();
		formPanel.setPaddings(15);
		return formPanel;
	}

	public void addField(Field field) {
		addChild(field);
	}

	public void removeField(Field field) {
		removeChild(field);
	}

	public Field getField(int index) {
		return (Field) getChild(index);
	}

	public List getFields() {
		return getChildren();
	}

	public class GWTExtFormModel implements FormModel {

		public GWTExtFormModel() {
			addValueChangeListener(APPLICATION_BEAN, new ValueChangeListenerAdapter() {

				public void valueChanged(ValueChangeEvent vce) {
					// Logger.startMethod("FM", "valueChanged");
					// Unbind Old App _Bean
					ApplicationBean oldAppBean = (ApplicationBean) vce.getOldValue();

					if (oldAppBean != null) {
						BindingManager.unbindForm(GWTExtForm.this, (_BoundBean) oldAppBean);
					}

					// Bind new _Bean
					ApplicationBean newAppBean = (ApplicationBean) vce.getNewValue();

					if (newAppBean != null) {

						Long appBeanId = newAppBean.getApplicationBeanId();
						// Logger.log("appBeanId", appBeanId);

						if (appBeanId != null) {
							BindingManager.initForm(GWTExtForm.this, (_BoundBean) newAppBean);
						}
						BindingManager.bindForm(GWTExtForm.this, (_BoundBean) newAppBean);
					}
					// Logger.endMethod("FM", "valueChanged");
				}

			});
		}

		public ApplicationBean getApplicationBean() {
			return (ApplicationBean) getValue(APPLICATION_BEAN);
		}

		public void setApplicationBean(ApplicationBean appBean) {
			setValue(APPLICATION_BEAN, appBean);
		}

	}
}