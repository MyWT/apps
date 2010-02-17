package rnd.webapp.mwtapp.client;

import pmt.client.module.helper.PMTModuleHelper;
import rnd.webapp.mwt.client.application.AbstractApplicationHelper;

public class MyApplicationHelper extends AbstractApplicationHelper {

	@Override
	public void initialiseApplication() {
//		addModuleHelper(new AAModuleHelper());
		addModuleHelper(new PMTModuleHelper());
	}

}
