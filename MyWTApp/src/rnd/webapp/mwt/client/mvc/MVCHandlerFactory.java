package rnd.webapp.mwt.client.mvc;

public class MVCHandlerFactory {

	private static MVCHandler sharedHandler;

	public static MVCHandler getMVCHandler() {
		return sharedHandler;
	}

	public static void setMVCHandler(MVCHandler handler) {
		sharedHandler = handler;
	}
}