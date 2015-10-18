package com.akh.collection.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapEx {
	public static void main(String[] args) {
		Map<String, Object> weak = new WeakHashMap<String, Object>();
		Map<String, Object> map = new HashMap<String, Object>();
		{
			String weakkey = new String("weakkey");
			weak.put(weakkey, new Object());
			String key = new String("key");
			map.put(key, new Object());
			weakkey = null;
			key = null;
		}
		System.gc();
	}

}