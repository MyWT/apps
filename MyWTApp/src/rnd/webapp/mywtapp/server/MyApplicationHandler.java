package rnd.webapp.mywtapp.server;

import rnd.mywt.server.application.AbstractApplicationHandler;
import ad.server.module.ADModuleHandler;

public class MyApplicationHandler extends AbstractApplicationHandler {

	public MyApplicationHandler() {
		super("myapp");
	}

	@Override
	protected void initialiseApplication() {
		registerModule("AD", new ADModuleHandler());
		// registerModule("AA", new AAModuleHandler());
		// registerModule("PMT", new PMTModuleHandler());
	}

}
