package rnd.webapp.mwt.client.gwtext.mvc.field.data.text;

import rnd.webapp.mwt.client.mvc.field.data.text.TextArea;

public class GWTExtTextArea extends GWTExtTextField implements TextArea {

	// public class TextArea extends com.gwtext.client.widgets.form.TextArea {
	// }

	public GWTExtTextArea(String label) {
		super(label);
	}

	@Override
	protected com.gwtext.client.widgets.form.TextField getNewTextField() {
		return new com.gwtext.client.widgets.form.TextArea();
	}

}
