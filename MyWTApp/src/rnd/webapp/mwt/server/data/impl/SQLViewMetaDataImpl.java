package rnd.webapp.mwt.server.data.impl;

import rnd.webapp.mwt.server.data.SQLViewMetaData;

public class SQLViewMetaDataImpl extends ViewMetaDataImpl implements SQLViewMetaData {

	private String viewQuery;

	public void setViewQuery(String viewQuery) {
		this.viewQuery = viewQuery;
	}

	public String getViewQuery() {
		return this.viewQuery;
	}

}
