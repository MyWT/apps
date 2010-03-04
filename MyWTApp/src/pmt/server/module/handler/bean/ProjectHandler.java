package pmt.server.module.handler.bean;

import rnd.webapp.mwt.server.application.AbstractABHandler;
import rnd.webapp.mwt.server.data.ViewMetaData;
import rnd.webapp.mwt.server.data.impl.SQLViewMetaDataImpl;

public class ProjectHandler extends AbstractABHandler {

	public ViewMetaData getViewMetaData(String viewName) {

		if ("Phase".equals(viewName)) {
			SQLViewMetaDataImpl vmd = new SQLViewMetaDataImpl();
			vmd.setViewName(viewName);

			vmd.setViewQuery("Select PhaseId, PhaseName From Phase");
			vmd.setIdColumnIndex(0);
			vmd.setDisplayColumnIndex(1);
			vmd.setIdColumnName("PhaseId");
			vmd.setDisplayColumnName("PhaseName");
			vmd.addFilter("Project", "ProjectId = ?");

			return vmd;
		}

		return null;
	}
}
