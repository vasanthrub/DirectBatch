package org.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTask {
	public static void main(String[] args) {
		Map<Integer,String> m=new TreeMap<Integer, String>();
		m.put(10, "name");
		m.put(11, "age");
		m.put(12, "addr");
		System.out.println(m);
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey());
		}
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getValue());
			
		}
			
		}
		
	}


