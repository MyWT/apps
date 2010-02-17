package rnd.webapp.mwt.server.bean;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import rnd.webapp.mwt.client.bean.AbstractBean;

public class JavaBean extends AbstractBean {

	private Set propertyNames;

	private Set indexedPropertyNames;

	public Set getIndexedPropertyNames() {
		if (this.indexedPropertyNames == null) {
			populatePropertyNames();
		}
		return this.indexedPropertyNames;
	}

	public Set getPropertyNames() {
		if (this.propertyNames == null) {
			populatePropertyNames();
		}
		return this.propertyNames;
	}

	protected Object getValue0(String propertyName) {
		try {
			Method m = null;
			String s = capitialize(propertyName);
			try {
				m = getClass().getMethod("get" + s, (Class[])null);
			}
			catch (NoSuchMethodException e) {
				m = getClass().getMethod("is" + s, (Class[])null);
			}
			return m.invoke(this, (Object[])null);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Object setValue0(String propertyName, Object value) {
		try {
			return getClass().getMethod("set" + capitialize(propertyName), getFieldType(propertyName)).invoke(this, value);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public final Class getFieldType(String propertyName) throws NoSuchFieldException {
		// if (Debugger.D.pushCheck("rnd.webapp.mwt.server.bean.JavaBean.getFieldType")) {
		// Debugger.D.push(this, new Object[] { "propertyName", propertyName });
		// }
		// try {
		Class javaBeanClass = getClass();
		do {
			// D.println("javaBeanClass", javaBeanClass);

			Field field;
			try {
				field = javaBeanClass.getDeclaredField(propertyName);
			}
			catch (Exception e) {
				// D.println("continue");
				continue;
			}
			return field.getType();

		} while ((javaBeanClass = javaBeanClass.getSuperclass()) != null && javaBeanClass != JavaBean.class);

		throw new NoSuchFieldException(propertyName);
		// }
		// finally {
		// Debugger.D.pop("rnd.webapp.mwt.server.bean.JavaBean.getFieldType");
		// }
	}

	@Override
	protected final List getListValue0(String propertyName) {
		return (List) getValue(propertyName);
	}

	@Override
	protected final List setListValue0(String propertyName, List newValue) {
		return (List) setValue0(propertyName, newValue);
	}

	private void populatePropertyNames() {

		this.indexedPropertyNames = new HashSet();
		this.propertyNames = new HashSet();

		Method[] methods = getClass().getDeclaredMethods();

		for (Method method : methods) {

			Class fieldType = method.getReturnType();
			String prpName = null;
			if (method.getName().startsWith("get")) {
				prpName = getPropertyName(method, 3);
				if (fieldType.isAssignableFrom(List.class)) {
					this.indexedPropertyNames.add(prpName);
				} else {
					this.propertyNames.add(prpName);
				}
			} else if (method.getName().startsWith("is")) {
				prpName = getPropertyName(method, 2);
				this.propertyNames.add(prpName);
			}
		}
	}

	private String getPropertyName(Method method, int i) {
		return decapitialize(method.getName().substring(i));
	}

	private String capitialize(String propertyName) {
		char chars[] = propertyName.toCharArray();
		chars[0] = Character.toUpperCase(chars[0]);
		return new String(chars).intern();
	}

	private String decapitialize(String propertyName) {
		char chars[] = propertyName.toCharArray();
		chars[0] = Character.toLowerCase(chars[0]);
		return new String(chars).intern();
	}

}
