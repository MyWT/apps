package rnd.webapp.mwt.client.data;

import rnd.webapp.mwt.client.expression.Expression;

public interface ColumnMetaData {

	String NAME = "name";

	String getName();

	String DATA_TYPE = "type";

	int getType();

	String EXPRESSION = "expression";

	Expression getExpression();

	String DISPLAY_NAME = "displayName";

	String getDisplayName();

	String WIDTH = "width";

	int getDisplayWidth();

	String UPDATABLE = "updatable";

	boolean isUpdatable();

}
