package rnd.webapp.mwt.client.data.impl;

import java.io.Serializable;
import java.util.List;

import rnd.webapp.mwt.client.bean.DynaBean;
import rnd.webapp.mwt.client.data.Row;
import rnd.webapp.mwt.client.data.RowMetaData;

public class RowImpl extends DynaBean implements Row, Serializable {

	public RowImpl() {
	}

	public RowImpl(RowMetaData rowMetaData) {
		setValue(ROW_META_DATA, rowMetaData);
	}

	public Long getId() {
		return (Long) getListValue(COLUMN).get(getRowMetaData().getIdColumnIndex());
	}

	public RowMetaData getRowMetaData() {
		return (RowMetaData) getValue(ROW_META_DATA);
	}

	public void setColumns(List columns) {
		List listValue = getListValue(COLUMN);
		listValue.clear();
		listValue.addAll(columns);
	}

	public List getColumns() {
		return getListValueReadOnly(COLUMN);
	}

	public String getDisplayName() {
		Object displayName = getListValue(COLUMN).get(getRowMetaData().getDisplayColumnIndex());
		return displayName == null ? "" : displayName.toString();
	}

	@Override
	public String toString() {
		return super.toString() + "[" + getDisplayName() + "]";
	}

}
