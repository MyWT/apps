package rnd.webapp.mwt.client.gwtext.mvc;

import rnd.webapp.mwt.client.gwtext.mvc.field.GWTExtTable;
import rnd.webapp.mwt.client.gwtext.mvc.field.data.GWTExtReferenceField;
import rnd.webapp.mwt.client.gwtext.mvc.field.data.text.GWTExtTextArea;
import rnd.webapp.mwt.client.gwtext.mvc.field.data.text.GWTExtTextField;
import rnd.webapp.mwt.client.gwtext.mvc.page.GWTExtHomePage;
import rnd.webapp.mwt.client.gwtext.mvc.page.GWTExtPage;
import rnd.webapp.mwt.client.gwtext.mvc.page.board.GWTExtActionBar;
import rnd.webapp.mwt.client.gwtext.mvc.page.board.GWTExtActionBase;
import rnd.webapp.mwt.client.gwtext.mvc.page.board.GWTExtActionBoard;
import rnd.webapp.mwt.client.gwtext.mvc.page.board.GWTExtDataBoard;
import rnd.webapp.mwt.client.gwtext.mvc.page.board.GWTExtFormBoard;
import rnd.webapp.mwt.client.gwtext.mvc.page.form.GWTExtForm;
import rnd.webapp.mwt.client.mvc.MVCHandler;
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

public class GWTExtMVCHandler implements MVCHandler {

	// Form
	public Form createForm() {
		return new GWTExtForm();
	}

	// Label
	public Label createLabel(String text) {
		throw new UnsupportedOperationException("createLabel");
		// return new GWTExtLabel(text);
	}

	// Page
	public Page createPage() {
		return new GWTExtPage();
	}

	// Text Field
	public TextField createTextField(String label) {
		return new GWTExtTextField(label);
	}
	
	public TextArea createTextArea(String label) {
		return new GWTExtTextArea(label);
	}

	// Reference Field
	public ReferenceField createReferenceField(String label, String moduleName, String applicationBeanName, String viewName) {
		return new GWTExtReferenceField(label, moduleName, applicationBeanName, viewName);
	}

	// Table
	public Table createTable(int tableType) {
		return new GWTExtTable(tableType);
	}

	// Home Page
	public Page createHomePage() {
		return new GWTExtHomePage();
	}

	public Page createHomePage(ActionBoard actionBoard) {
		return new GWTExtHomePage(actionBoard);
	}

	// Action Board
	public ActionBoard createActionBoard() {
		return new GWTExtActionBoard();
	}

	public ActionBoard createActionBoard(ActionBar actionBar, ActionBase actionBase) {
		return new GWTExtActionBoard(actionBar, actionBase);
	}

	// Action Bar
	public ActionBar createActionBar() {
		return new GWTExtActionBar();
	}

	// Action Base
	public ActionBase createActionBase() {
		return new GWTExtActionBase();
	}

	// Form Board
	public FormBoard createFormBoard(String moduleName, String applicationBeanName) {
		return new GWTExtFormBoard(moduleName, applicationBeanName);
	}

	// Data Board
	public DataBoard createDataBoard(String moduleName, String applicationBeanName, String viewName) {
		return new GWTExtDataBoard(moduleName, applicationBeanName, viewName);
	}

}
