package rnd.webapp.mwt.client.bean;

import rnd.bean._Bean;

public interface _BoundBean extends _Bean {

	void addValueChangeListener(String propertyName, ValueChangeListener vcl);

	void removeValueChangeListener(String propertyName, ValueChangeListener vcl);

}
