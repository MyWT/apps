package aa.server.module.appbean;

import rnd.webapp.mwt.server.application.AbstractABHandler;
import rnd.webapp.mwt.server.data.ViewMetaData;
import rnd.webapp.mwt.server.data.impl.ViewMetaDataImpl;

public class UserHandler extends AbstractABHandler {

	public ViewMetaData getViewMetaData(String viewName) {

		ViewMetaDataImpl vmd = new ViewMetaDataImpl();

		vmd.setViewQuery("Select UserId, UserName From User");
		vmd.setViewName(viewName);
		vmd.setIdColumnIndex(0);
		vmd.setDisplayColumnIndex(1);
		vmd.setIdColumnName("UserId");
		vmd.setDisplayColumnName("UserName");
		
		return vmd;
	}
}
