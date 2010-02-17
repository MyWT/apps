package rnd.webapp.mwt.client.mvc.page.board;

import rnd.webapp.mwt.client.data.FilterInfo;
import rnd.webapp.mwt.client.data.Row;
import rnd.webapp.mwt.client.mvc.field.Table;
import rnd.webapp.mwt.client.mvc.field.data.ReferenceField;

public interface DataBoard extends Board {

	Table getDataTable();

	void refreshDataTable();

	void addRow(Row newRow);

	void removeCurrentRow();

	void updateCurrentRow(Row updatedRow);

	void setReferenceField(ReferenceField referenceField);

	ReferenceField getReferenceField();

	String FILTER = "filter";

	FilterInfo getFilter();

	void setFilter(FilterInfo filterInfo);

	public interface DataBoardModel extends Model {

		String DATA_TABLE_INTIALIZED = "dataTableIntialized";

		boolean isDataTableIntialized();

		void setDataTableIntialized(boolean dataTableIntialized);

		String DATA_TABLE_META_DATA_INTIALIZED = "dataTableMetaDataIntialized";

		boolean isDataTableMetaDataIntialized();

		void setDataTableMetaDataIntialized(boolean dataTableMetaDataIntialized);

		String FILTER_RESET = "filterReset";

		public boolean isFilterReset();

		public void setFilterReset(boolean filterReset);

	}

	public interface DataBoardView extends View {
	}

}