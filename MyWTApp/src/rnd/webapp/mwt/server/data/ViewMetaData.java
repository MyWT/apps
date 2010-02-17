package rnd.webapp.mwt.server.data;

public interface ViewMetaData {

	String getViewName();

	String getViewQuery();

	int getIdColumnIndex();

	int getDisplayColumnIndex();

	String getIdColumnName();

	String getDisplayColumnName();

	String getFilter(String filterName);

}
