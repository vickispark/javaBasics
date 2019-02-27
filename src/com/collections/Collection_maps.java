package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


//) Map interface extends which interface?
//java.util.Map interface doesn’t extends java.util.Collection interface like List and Set in java.
//Which classes implement Map interface?
//java.util.HashMap, java.util.Hashtable, java.util.concurrent.ConcurrentHashMap, java.util.LinkedHashMap,
//java.util.TreeMap, java.util.concurrent.ConcurrentSkipListMap, java.util.IdentityHashMap,
//java.util.WeakHashMap, java.util.EnumMap classes implements java.util.Map interface.

//java.util.HashMap in java
//java.util.HashMap is implementation of the java.util.Map interface.
//java.util.HashMap enables us to store data in key-value pair form. Insertion order of key-value pairs is not maintained.
//In an HashMap, two keys k1 and k2 are equal if and only if (k1==null ? k2==null : k1.equals(k2))

//Synchronized:Hashtable, ConcurrentHashMap, ConcurrentSkipListMap, 
//Unxyncronized:HashMap,  LinkedHashMap,  TreeMap,  IdentityHashMap, WeakHashMap,  EnumMap
public class Collection_maps {
//	https://www.javamadesoeasy.com/2015/04/hashmap-vs-hashtable-vs-linkedhashmap.html
	public static void main(String[] args) {
		 Map<Integer,String> hashMap=new HashMap<Integer,String>(); 
		 //Map stores data in form of key-value pair it does not allow to store duplicate keys but allows duplicate values in java.
		 hashMap.put(11, "javaMadeSoEasy");
		  hashMap.put(21, "bmw");
		    hashMap.put(31, "ferrari");//HashMap does not maintains insertion order in java.
		//    Most of the java.util.Map implementation does not maintain insertion order.
      //  Thought LinkedHashMap maintains insertion order of keys in java.
 //    TreeMap is sorted by natural order of keys in java.
		 hashMap.get(2);
		 hashMap.containsKey(2);//HashMap is not synchronized, 
		 //hence its operations are faster as compared to some other synchronized implementation of map interface in java. 
		 hashMap.containsValue("javaMadeSoEasy");
		 hashMap.remove(11);//11 is the key
		 System.out.println(hashMap.size());
		 Iterator<Integer> keyIterator=hashMap.keySet().iterator();
		 while(keyIterator.hasNext()){
		   System.out.println(keyIterator.next());//iterator returned is fail fast in java. 
		 } 
		 Set<Integer> keySet=hashMap.keySet();
		 for(Integer key :keySet){
		   System.out.println(key);//Map is not index based structure at all in java.
		 }  
//		 When to use java.util.HashMap in java
//		 HashMap can be used when we want to store data in key-value pair form in java.
//		 HashMap can be used when we want to store only one null key in java.
//		 HashMap can be used when value corresponding to key might be null in java.
//		 HashMap can be used when we don’t care about insertion order in java.
//		 HashMap can be used when we are not working in multithreading environment in java.
		 //HashMap,Hashtable, LinkedHashMap and TreeMap all are fail-fast >


	}

}
