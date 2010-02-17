package pmt.client.module.helper.form;

import pmt.client.Phase;
import pmt.client.Project;
import rnd.webapp.mwt.client.application.AbstractFormHelper;
import rnd.webapp.mwt.client.bean.ApplicationBean;
import rnd.webapp.mwt.client.data.impl.ColumnMetaDataImpl;
import rnd.webapp.mwt.client.expression.BeanPropertyExpression;
import rnd.webapp.mwt.client.mvc.field.Table;
import rnd.webapp.mwt.client.mvc.field.Table.BeanTableModel;
import rnd.webapp.mwt.client.mvc.field.Table.BeanTableModel.RowDelegate;
import rnd.webapp.mwt.client.mvc.field.data.ReferenceField;
import rnd.webapp.mwt.client.mvc.field.data.text.TextField;
import rnd.webapp.mwt.client.mvc.page.form.Form;
import rnd.webapp.mwt.client.sql.Types;

public class ProjectFormHelper extends AbstractFormHelper {

	public ApplicationBean createApplicationBean() {
		return new Project();
	}

	public Form createForm() {

		Form form = super.createForm();

		TextField name_TextBox = createTextField("Project", "projectName");
		form.addField(name_TextBox);

		ColumnMetaDataImpl[] columnMetaDatas = new ColumnMetaDataImpl[1];

		columnMetaDatas[0] = new ColumnMetaDataImpl();
		columnMetaDatas[0].setType(Types.VARCHAR);
		columnMetaDatas[0].setUpdatable(true);
		columnMetaDatas[0].setDisplayName("Phase");
		columnMetaDatas[0].setName("phaseName");
		columnMetaDatas[0].setDisplayWidth(45);
		columnMetaDatas[0].setExpression(new BeanPropertyExpression("phaseName"));

		RowDelegate rowDelegate = new RowDelegate() {
			public Object newRow() {
				return new Phase();
			}
		};

		Table phaseTable = createTable();
		phaseTable.setColumnMetaDatas(columnMetaDatas);
		((BeanTableModel) phaseTable.getModel()).setRowDelegate(rowDelegate);

		phaseTable.setBoundTo("phases");
		form.addField(phaseTable);

		ReferenceField createdById_RF = createReferenceField("Created By", "createdById", "AA", "User", "User", "UserName");
		form.addField(createdById_RF);

		return form;
	}

	public String getFormName() {
		return "Project";
	}

	public String getViewName() {
		return "Project";
	}

}
