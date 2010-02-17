package aa.server.module;

import rnd.webapp.mwt.server.application.AbstractModuleHandler;
import rnd.webapp.mwt.server.application.ModuleHandler;
import aa.server.User;
import aa.server.module.appbean.UserHandler;

public class AAModuleHandler extends AbstractModuleHandler implements ModuleHandler {

	@Override
	public void initialiseModule() {
		addApplicationBeanHandler("User", User.class,new UserHandler());
	}

	@Override
	protected void initialiseApplication() {
	}

}
