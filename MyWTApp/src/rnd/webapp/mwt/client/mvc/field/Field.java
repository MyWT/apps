package rnd.webapp.mwt.client.mvc.field;

import rnd.webapp.mwt.client.mvc.MVCBean;

public interface Field extends MVCBean {
	
	String getFieldProperty();

	public interface FieldModel extends Model {
	}

	public interface FieldView extends View {
	}
}
