package rnd.webapp.mwt.client.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import rnd.webapp.mwt.client.bean.impl.Bean;

public class DynaBean extends Bean implements Serializable {

	private HashMap<String, Object> propertyMap = new HashMap(0);

	private HashMap<String, List> indexedPropertyMap = new HashMap(0);

	protected HashMap<String, Object> getPropertyMap() {
		return this.propertyMap;
	}

	protected HashMap<String, List> getIndexedPropertyMap() {
		return this.indexedPropertyMap;
	}

}
