package rnd.webapp.mwt.server.application;

import rnd.webapp.mwt.server.data.ViewMetaData;

public interface ApplicationBeanHandler {

	ViewMetaData getViewMetaData(String viewName);

}
