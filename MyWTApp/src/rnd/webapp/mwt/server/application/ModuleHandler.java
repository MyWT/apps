package rnd.webapp.mwt.server.application;

import rnd.op.ObjectLifeCycle;
import rnd.webapp.mwt.client.bean.ApplicationBean;
import rnd.webapp.mwt.client.rpc.ApplicationRequest;
import rnd.webapp.mwt.client.rpc.ApplicationResponse;

public interface ModuleHandler extends ObjectLifeCycle<ApplicationBean> {

	// Callback

	void initModule();

	// Intialization

	void registerApplicationBean(String appBeanName, Class appBeanType);

	void registerApplicationBean(String appBeanName, Class appBeanType, ApplicationBeanHandler applicationBeanHandler);

	// Helper

	ApplicationBeanHandler getApplicationBeanHandler(String appBeanName);

	Class getApplicationBeanType(String appBeanName);

	// Main

	void executeRequest(ApplicationRequest req, ApplicationResponse resp);

}
