package rnd.webapp.mwt.client.rpc.util;

import java.io.Serializable;

import rnd.webapp.mwt.client.bean.ApplicationBean;
import rnd.webapp.mwt.client.data.FilterInfo;
import rnd.webapp.mwt.client.rpc.ApplicationRequest;

public class ARUtils {

	private static final String APP_BEAN_NAME = "applicationBeanName";

	private static final String APP_BEAN_PK_ID = "applicationBeanPKId";

	private static final String APP_BEAN = "applicationBean";

	private static final String VIEW_NAME = "viewName";

	private static final String FILTER = "filterInfo";

	public static void setAppBeanName(ApplicationRequest request, String appBeanName) {
		request.setParam(APP_BEAN_NAME, appBeanName);
	}

	public static String getAppBeanName(ApplicationRequest request) {
		return (String) request.getParam(APP_BEAN_NAME);
	}

	public static void setAppBeanPKId(ApplicationRequest request, Long appBeanPKId) {
		request.setParam(APP_BEAN_PK_ID, appBeanPKId);
	}

	public static Long getAppBeanPKId(ApplicationRequest request) {
		return (Long) request.getParam(APP_BEAN_PK_ID);
	}

	public static void setApplicationBean(ApplicationRequest request, ApplicationBean appBean) {
		request.setParam(APP_BEAN, (Serializable) appBean);
	}

	public static ApplicationBean getApplicationBean(ApplicationRequest request) {
		return (ApplicationBean) request.getParam(APP_BEAN);
	}

	public static void setViewName(ApplicationRequest request, String viewName) {
		request.setParam(VIEW_NAME, viewName);
	}

	public static String getViewName(ApplicationRequest request) {
		return (String) request.getParam(VIEW_NAME);
	}

	public static void setFilter(ApplicationRequest request, FilterInfo filterInfo) {
		request.setParam(FILTER, (Serializable) filterInfo);
	}

	public static FilterInfo getFilter(ApplicationRequest request) {
		return (FilterInfo) request.getParam(FILTER);
	}

}
