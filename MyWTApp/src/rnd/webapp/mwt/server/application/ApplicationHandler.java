package rnd.webapp.mwt.server.application;

public interface ApplicationHandler {

	void addModuleHandler(String moduleName, ModuleHandler moduleHandler);

	ModuleHandler getModuleHandler(String moduleName);

}
