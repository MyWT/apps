package pmt.server.module.handler;

import pmt.server.Project;
import pmt.server.Task;
import pmt.server.module.handler.bean.ProjectHandler;
import rnd.webapp.mwt.server.application.AbstractModuleHandler;

public class PMTModuleHandler extends AbstractModuleHandler {

	@Override
	public void initialiseModule() {
		addApplicationBeanHandler("Project", Project.class, new ProjectHandler());
		// addApplicationBeanHandler("Task", Task.class, new TaskHandler());
		// addApplicationBean("Project", Project.class);
		addApplicationBean("Task", Task.class);

	}

	@Override
	protected void initialiseApplication() {
	}

}
