package rnd.webapp.mwt.client.utils;

/**
 * @description This class is for Wrapper-Primtive data type conversion with null checking
 * 
 */

public class WrapperUtils {

	private WrapperUtils() {
	}

	// Double
	public static double getDoubleValue(Object doubleValue) {
		if (doubleValue == null) { return 0.0; }
		if (doubleValue instanceof String) { return Double.parseDouble((String) doubleValue); }
		return ((Number) doubleValue).doubleValue();
	}

	public static Double getDouble(Object doubleValue) {
		if (doubleValue == null) { return new Double(0.0); }
		if (doubleValue instanceof String) { return new Double((String) doubleValue); }
		return new Double(((Number) doubleValue).doubleValue());
	}

	// Long
	public static long getLongValue(Object longValue) {
		if (longValue == null) { return 0; }
		if (longValue instanceof String) { return Long.parseLong((String) longValue); }
		return ((Number) longValue).longValue();
	}

	public static Long getLong(Object longValue) {
		if (longValue == null) { return new Long(0); }
		if (longValue instanceof String) { return new Long((String) longValue); }
		return new Long(((Number) longValue).longValue());
	}

	// Integer
	public static int getIntegerValue(Object intValue) {
		if (intValue == null) { return 0; }
		if (intValue instanceof String) { return Integer.parseInt((String) intValue); }
		return ((Number) intValue).intValue();
	}

	public static Integer getInteger(Object intValue) {
		if (intValue == null) { return new Integer(0); }
		if (intValue instanceof String) { return new Integer((String) intValue); }
		return new Integer(((Number) intValue).intValue());
	}

	// Short
	public static short getShortValue(Object shortValue) {
		if (shortValue == null) { return 0; }
		if (shortValue instanceof String) { return Short.parseShort((String) shortValue); }
		return ((Number) shortValue).shortValue();
	}

	public static Short getShort(Object shortValue) {
		if (shortValue == null) { return new Short((short) 0); }
		if (shortValue instanceof String) { return new Short((String) shortValue); }
		return new Short(((Number) shortValue).shortValue());
	}

	// Boolean
	public static boolean getBooleanValue(Object booleanValue) {
		if (booleanValue == null) { return false; }
		if (booleanValue instanceof String) { return Boolean.parseBoolean((String) booleanValue); }
		return ((Boolean) booleanValue).booleanValue();
	}

	public static Boolean getBoolean(Object booleanValue) {
		if (booleanValue == null) { return Boolean.FALSE; }
		if (booleanValue instanceof String) { return new Boolean((String) booleanValue); }
		return (Boolean) booleanValue;
	}
}
