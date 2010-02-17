package rnd.webapp.mwt.client.application;

import java.util.Collection;

public interface ApplicationHelper {

	void addModuleHelper(ModuleHelper moduleHelper);

	ModuleHelper getModuleHelper(String moduleName);

	Collection getModuleHelpers();

}
