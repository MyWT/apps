package rnd.webapp.mwt.server.application;

public interface ApplicationHandler {

	void registerModule(String moduleName, ModuleHandler moduleHandler);

	ModuleHandler getModuleHandler(String moduleName);

}
