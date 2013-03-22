package rnd.webapp.mywtapp.client;

import ad.client.module.ADModuleHelper;
import rnd.mywt.client.application.AbstractApplicationHelper;

public class MyApplicationHelper extends AbstractApplicationHelper {

	public MyApplicationHelper(String applicationName) {
		super(applicationName);
	}

	@Override
	public void initialiseApplication() {
		addModuleHelper(new ADModuleHelper());
		// addModuleHelper(new AAModuleHelper());
		// addModuleHelper(new PMTModuleHelper());
	}

}
