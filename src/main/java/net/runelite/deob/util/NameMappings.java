package net.runelite.deob.util;

import java.util.HashMap;
import java.util.Map;
import net.runelite.deob.pool.Class;
import net.runelite.deob.pool.Field;
import net.runelite.deob.pool.Method;

public class NameMappings
{
	private final Map<Object, String> map = new HashMap<>();
	
	public void map(Class cf, String name)
	{
		map.put(cf, name);
	}
	
	public void map(Field field, String name)
	{
		map.put(field, name);
	}
	
	public void map(Method method, String name)
	{
		map.put(method, name);
	}
	
	public String get(Object object)
	{
		return map.get(object);
	}
}
