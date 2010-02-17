package rnd.webapp.mwt.client.mvc.page.board;

import rnd.webapp.mwt.client.mvc.page.Page;

public interface ActionBoard extends Page {

	ActionBase getActionBase();

	ActionBar getActionBar();

	public interface ActionBoardView extends PageView {
	}

}
