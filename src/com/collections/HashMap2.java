package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(6, "Oracle");
		hashmap.put(2, "Selenium");
		hashmap.put(4, "JUnit");
		hashmap.put(5, "Cucumber");
		hashmap.put(5, "Cucumber bdd");
		hashmap.put(3, "TestNG");
		hashmap.put(7, "javaScript");
		hashmap.put(1, "java");
		
		System.out.println(hashmap);
		System.out.println("----------------------using Map.Entry---------------------------");

		for(Map.Entry<Integer, String> me :hashmap.entrySet()) {
		System.out.println("Key: "+ me.getKey()+ " value: "+ me.getValue());
		}
		System.out.println("----------------------using keyset---------------------------");
		for(Integer key :hashmap.keySet()) {
			System.out.println("Key: "+ key+ " value: "+hashmap.get(key));
			}
		System.out.println("-----------------using iterator and key set--------------------------------");
		
		Iterator<Integer> key = hashmap.keySet().iterator();
		while(key.hasNext()) {
			Integer key1 = key.next();
			System.out.println("Key: "+key1+ " value: "+hashmap.get(key1));
		}
		System.out.println("----------get size-------------");
		System.out.println("size of the hashmap = "+hashmap.size());
		System.out.println("----------get size-------------");
		//hashmap.clear();
		//System.out.println("size of the hashmap after clear() method = "+hashmap.size());
		// to sort hashmap
		TreeMap sortedhashmap = new TreeMap(hashmap);
		System.out.println(sortedhashmap);

		
		

	}

	private static String get(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

}
