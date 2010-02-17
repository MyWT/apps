package rnd.webapp.mwt.client.rpc;

import rnd.webapp.mwt.client.bean.ApplicationBean;
import rnd.webapp.mwt.client.data.FilterInfo;
import rnd.webapp.mwt.client.rpc.ApplicationRequest.Method;
import rnd.webapp.mwt.client.rpc.util.ARUtils;

public class ARCreator {

	public static ApplicationRequest createSaveRequest(String moduleName, String appBeanName, String viewName, ApplicationBean appBean) {
		ApplicationRequest request = new ApplicationRequest(moduleName, Method.Save);
		ARUtils.setAppBeanName(request, appBeanName);
		ARUtils.setViewName(request, viewName);
		ARUtils.setApplicationBean(request, appBean);
		return request;
	}

	public static ApplicationRequest createFetchRequest(String moduleName, String appBeanName, String viewName, FilterInfo filterInfo) {
		ApplicationRequest request = new ApplicationRequest(moduleName, Method.Fetch);
		ARUtils.setAppBeanName(request, appBeanName);
		ARUtils.setViewName(request, viewName);
		ARUtils.setFilter(request, filterInfo);
		return request;
	}

	public static ApplicationRequest createFindRequest(String moduleName, String appBeanName, Long appBeanId) {
		ApplicationRequest request = new ApplicationRequest(moduleName, Method.Find);
		ARUtils.setAppBeanName(request, appBeanName);
		ARUtils.setAppBeanPKId(request, appBeanId);
		return request;
	}

	public static ApplicationRequest createDeleteRequest(String moduleName, String appBeanName, Long appBeanId) {
		ApplicationRequest request = new ApplicationRequest(moduleName, Method.Delete);
		ARUtils.setAppBeanName(request, appBeanName);
		ARUtils.setAppBeanPKId(request, appBeanId);
		return request;
	}

}
