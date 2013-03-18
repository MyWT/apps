package rnd.webapp.adapp.server;

import rnd.mywt.server.application.AbstractApplicationHandler;
import ad.server.module.handler.ADModuleHandler;

public class ADAppHandler extends AbstractApplicationHandler {

	private static final String AD = "AD";

	@Override
	protected void initialiseApplication() {
		registerModule(AD, new ADModuleHandler());
	}

}
