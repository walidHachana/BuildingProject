package util;

import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Locator {

	public static final String moduleName = "ems-hachana";

	static Context context;
	static {

		try {
			context = new InitialContext();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static Map<String, Object> cache = new HashMap<String, Object>();

	public static Object lookup(String ejbName, Class viewClass) {

		Object proxy = null;

		try {

			String jndiName = String.format("%s/%s!%s", moduleName, ejbName,
					viewClass.getCanonicalName());

			if (cache.containsKey(jndiName)) {
				return cache.get(jndiName);
			}

			proxy = context.lookup(jndiName);

			cache.put(jndiName, proxy);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return proxy;
	}

}
