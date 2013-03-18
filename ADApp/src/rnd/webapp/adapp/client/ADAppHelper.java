package rnd.webapp.adapp.client;

import rnd.mywt.client.application.AbstractApplicationHelper;
import ad.client.module.ADModuleHelper;

public class ADAppHelper extends AbstractApplicationHelper {

	public ADAppHelper() {
		super("AD");
	}

	@Override
	public void initialiseApplication() {
		addModuleHelper(new ADModuleHelper());
	}

}
