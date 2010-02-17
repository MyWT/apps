package rnd.webapp.mwt.server.application;

import rnd.webapp.mwt.client.rpc.ApplicationRequest;
import rnd.webapp.mwt.client.rpc.ApplicationResponse;

public interface ModuleHandler extends ApplicationHandler {

	void addApplicationBean(String appBeanName, Class appBeanType);

	void addApplicationBeanHandler(String appBeanName, Class appBeanType, ApplicationBeanHandler applicationBeanHandler);

	ApplicationBeanHandler getApplicationBeanHandler(String appBeanName);

	Class getApplicationBeanType(String appBeanName);

	void executeRequest(ApplicationRequest req, ApplicationResponse resp);

}
