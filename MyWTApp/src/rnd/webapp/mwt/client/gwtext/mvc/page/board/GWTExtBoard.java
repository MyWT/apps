package rnd.webapp.mwt.client.gwtext.mvc.page.board;

import rnd.webapp.mwt.client.mvc.AbstractMVCBean;
import rnd.webapp.mwt.client.mvc.page.board.ActionBase;
import rnd.webapp.mwt.client.mvc.page.board.Board;

public abstract class GWTExtBoard extends AbstractMVCBean implements Board {

	public GWTExtBoard(String moduleName, String appBeanName, String viewName) {
		setValue(MODULE_NAME, moduleName);
		setValue(APPLICATION_BEAN_NAME, appBeanName);
		setValue(VIEW_NAME, viewName);
	}

	public String getModuleName() {
		return (String) getValue(MODULE_NAME);
	}

	public String getApplicationBeanName() {
		return (String) getValue(APPLICATION_BEAN_NAME);
	}

	public String getViewName() {
		return (String) getValue(VIEW_NAME);
	}

	public ActionBase getActionBase() {
		return (ActionBase) getParent();
	}

}
