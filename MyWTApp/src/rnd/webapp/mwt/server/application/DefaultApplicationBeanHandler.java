package rnd.webapp.mwt.server.application;

import rnd.webapp.mwt.server.data.ViewMetaData;
import rnd.webapp.mwt.server.data.impl.ViewMetaDataImpl;

public class DefaultApplicationBeanHandler extends AbstractABHandler {

	DefaultApplicationBeanHandler() {
	}

	private static class DefaultApplicationBeanHandlerHolder {
		static DefaultApplicationBeanHandler sharedInstance = new DefaultApplicationBeanHandler();
	}

	public static ApplicationBeanHandler getSharedInstance() {
		return DefaultApplicationBeanHandlerHolder.sharedInstance;
	}

	public ViewMetaData getViewMetaData(String viewName) {

		ViewMetaDataImpl vmd = new ViewMetaDataImpl();
		vmd.setViewQuery("Select * From " + viewName);
		vmd.setViewName(viewName);

		return vmd;
	}

}
