package rnd.webapp.mwt.client.data.impl;

import java.io.Serializable;

import rnd.webapp.mwt.client.bean.DynaBean;
import rnd.webapp.mwt.client.data.ColumnMetaData;
import rnd.webapp.mwt.client.expression.Expression;
import rnd.webapp.mwt.client.utils.WrapperUtils;

public class ColumnMetaDataImpl extends DynaBean implements ColumnMetaData, Serializable {

	public ColumnMetaDataImpl() {
	}

	public void setType(int dataType) {
		setValue(DATA_TYPE, dataType);
	}

	public void setDisplayName(String displayName) {
		setValue(DISPLAY_NAME, displayName);
	}

	public void setName(String name) {
		setValue(NAME, name);
	}

	public void setDisplayWidth(int width) {
		setValue(WIDTH, width);
	}

	public void setUpdatable(boolean updatable) {
		setValue(UPDATABLE, updatable);
	}

	public void setExpression(Expression expresion) {
		setValue(EXPRESSION, expresion);
	}

	public int getType() {
		return WrapperUtils.getInteger(getValue(DATA_TYPE));
	}

	public String getDisplayName() {
		return (String) getValue(DISPLAY_NAME);
	}

	public String getName() {
		return (String) getValue(NAME);
	}

	public int getDisplayWidth() {
		return WrapperUtils.getInteger(getValue(WIDTH));
	}

	public boolean isUpdatable() {
		return WrapperUtils.getBoolean(getValue(UPDATABLE));
	}

	public Expression getExpression() {
		return (Expression) getValue(EXPRESSION);
	}

}