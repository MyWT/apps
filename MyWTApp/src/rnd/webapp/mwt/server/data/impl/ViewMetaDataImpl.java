package rnd.webapp.mwt.server.data.impl;

import java.util.HashMap;
import java.util.Map;

import rnd.webapp.mwt.server.data.ViewMetaData;

public class ViewMetaDataImpl implements ViewMetaData {

	private String viewQuery;

	private int idColumnIndex;

	private int displayColumnIndex;

	private String viewName;

	private String displayColumnName;

	private String idColumnName;

	private Map<String, String> filterMap;

	public void setViewQuery(String viewQuery) {
		this.viewQuery = viewQuery;
	}

	public String getViewQuery() {
		return this.viewQuery;
	}

	public void setIdColumnIndex(int idColumnIndex) {
		this.idColumnIndex = idColumnIndex;
	}

	public int getIdColumnIndex() {
		return this.idColumnIndex;
	}

	public String getViewName() {
		return this.viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	public int getDisplayColumnIndex() {
		return displayColumnIndex;
	}

	public void setDisplayColumnIndex(int displayColumnIndex) {
		this.displayColumnIndex = displayColumnIndex;
	}

	public String getDisplayColumnName() {
		return displayColumnName;
	}

	public String getIdColumnName() {
		return idColumnName;
	}

	public void setDisplayColumnName(String displayColumnName) {
		this.displayColumnName = displayColumnName;
	}

	public void setIdColumnName(String idColumnName) {
		this.idColumnName = idColumnName;
	}

	public String getFilter(String filterName) {
		if (filterMap == null) { return null; }
		return filterMap.get(filterName);
	}

	public void setFilter(String filterName, String filter) {
		getFilterMap().put(filterName, filter);
	}

	private Map<String, String> getFilterMap() {
		if (filterMap == null) {
			filterMap = new HashMap<String, String>();
		}
		return filterMap;
	}

}