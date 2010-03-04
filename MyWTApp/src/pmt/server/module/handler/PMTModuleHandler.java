package pmt.server.module.handler;

import pmt.server.Project;
import pmt.server.Task;
import pmt.server.module.handler.bean.ProjectHandler;
import rnd.webapp.mwt.server.application.AbstractModuleHandler;

public class PMTModuleHandler extends AbstractModuleHandler {

	@Override
	public void initModule() {
		registerApplicationBean("Project", Project.class, new ProjectHandler());
		// addApplicationBean("Project", Project.class);

		// addApplicationBeanHandler("Task", Task.class, new TaskHandler());
		registerApplicationBean("Task", Task.class);

	}

}
