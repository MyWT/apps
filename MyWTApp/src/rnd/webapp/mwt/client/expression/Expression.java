package rnd.webapp.mwt.client.expression;

public interface Expression {

	void setValue(Object object, Object value);

	Object getValue(Object object);

	void addXChangeListener(Object object, XChangeListener xChangeListener);

	void removeXChangeListener(Object object, XChangeListener xChangeListener);
}