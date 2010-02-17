package rnd.webapp.mwt.client.data;

public interface RowMetaData {

	int getIdColumnIndex();

	int getDisplayColumnIndex();

	int getColumnCount();

	ColumnMetaData[] getColumnMetaDatas();

}