package rnd.webapp.mwt.client.utils;

public class ExceptionUtils {

	public static Object makeUnchecked(Block block) {
		try {
			return block.doBlock();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
