package rnd.webapp.mwt.client.data.impl;

import java.io.Serializable;

import rnd.webapp.mwt.client.data.ColumnMetaData;
import rnd.webapp.mwt.client.data.RowMetaData;

public class RowMetaDataImpl implements RowMetaData, Serializable {

	public RowMetaDataImpl() {
	}

	private ColumnMetaData[] columnMetaDatas;

	private int idColumnIndex;

	private int displayColumnIndex;

	public RowMetaDataImpl(ColumnMetaData[] columnMetaDatas) {
		this.columnMetaDatas = columnMetaDatas;
	}

	public int getIdColumnIndex() {
		return this.idColumnIndex;
	}

	public void setIdColumnIndex(int idColumnIndex) {
		this.idColumnIndex = idColumnIndex;
	}

	public int getDisplayColumnIndex() {
		return this.displayColumnIndex;
	}

	public void setDisplayColumnIndex(int displayColumnIndex) {
		this.displayColumnIndex = displayColumnIndex;
	}

	public int getColumnCount() {
		return this.columnMetaDatas.length;
	}

	public ColumnMetaData[] getColumnMetaDatas() {
		return this.columnMetaDatas;
	}

}
