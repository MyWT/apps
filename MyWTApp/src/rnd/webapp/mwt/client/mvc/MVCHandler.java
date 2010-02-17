package rnd.webapp.mwt.client.mvc;

import rnd.webapp.mwt.client.mvc.field.Table;
import rnd.webapp.mwt.client.mvc.field.data.ReferenceField;
import rnd.webapp.mwt.client.mvc.field.data.text.Label;
import rnd.webapp.mwt.client.mvc.field.data.text.TextArea;
import rnd.webapp.mwt.client.mvc.field.data.text.TextField;
import rnd.webapp.mwt.client.mvc.page.Page;
import rnd.webapp.mwt.client.mvc.page.board.ActionBar;
import rnd.webapp.mwt.client.mvc.page.board.ActionBase;
import rnd.webapp.mwt.client.mvc.page.board.ActionBoard;
import rnd.webapp.mwt.client.mvc.page.board.DataBoard;
import rnd.webapp.mwt.client.mvc.page.board.FormBoard;
import rnd.webapp.mwt.client.mvc.page.form.Form;

public interface MVCHandler {

	// Page
	Page createPage();

	// Form
	Form createForm();

	// Label
	Label createLabel(String text);

	// Text Field
	TextField createTextField(String label);

	// Text Area
	TextArea createTextArea(String label);

	// Reference Field
	ReferenceField createReferenceField(String label, String moduleName, String applicationBeanName, String viewName);

	// Table
	Table createTable(int tableType);

	// Home Page
	Page createHomePage();

	Page createHomePage(ActionBoard actionBoard);

	// Action Board

	ActionBoard createActionBoard();

	ActionBoard createActionBoard(ActionBar actionBar, ActionBase actionBase);

	// Action Bar
	ActionBar createActionBar();

	// Action Base
	ActionBase createActionBase();

	// Form Board
	FormBoard createFormBoard(String moduleName, String applicationBeanName);

	// Data Board
	DataBoard createDataBoard(String moduleName, String applicationBeanName, String viewName);

}
