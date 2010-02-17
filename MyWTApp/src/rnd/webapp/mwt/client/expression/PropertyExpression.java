package rnd.webapp.mwt.client.expression;

public abstract class PropertyExpression extends AbstractExpression {

	protected String propertyName;

	protected PropertyExpression() {
	}

	protected PropertyExpression(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyName() {
		return propertyName;
	}
}
