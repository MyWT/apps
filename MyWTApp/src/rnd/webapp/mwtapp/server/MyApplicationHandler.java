package rnd.webapp.mwtapp.server;

import pmt.server.module.handler.PMTModuleHandler;
import rnd.webapp.mwt.server.application.AbstractApplicationHandler;
import aa.server.module.AAModuleHandler;

public class MyApplicationHandler extends AbstractApplicationHandler {

	@Override
	protected void initialiseApplication() {
		registerModule("AA", new AAModuleHandler());
		registerModule("PMT", new PMTModuleHandler());
	}

}
