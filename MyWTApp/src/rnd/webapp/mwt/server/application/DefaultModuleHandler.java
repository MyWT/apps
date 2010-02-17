package rnd.webapp.mwt.server.application;

public class DefaultModuleHandler extends AbstractModuleHandler implements ModuleHandler {

	DefaultModuleHandler() {
	}

	private static class DefaultModuleHandlerHolder {
		static DefaultModuleHandler sharedInstace = new DefaultModuleHandler();
	}

	public static ModuleHandler getSharedInstance() {
		return DefaultModuleHandlerHolder.sharedInstace;
	}

	@Override
	public void initialiseModule() {
	}
	
	@Override
	public ApplicationBeanHandler getApplicationBeanHandler(String appBeanName) {
		return DefaultApplicationBeanHandler.getSharedInstance();
	}

}
