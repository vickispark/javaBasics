package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
// java.util.Set interface extends java.util.Collection interface.
//Which classes implement Set interface?
//java.util.HashSet, java.util.concurrent.CopyOnWriteArraySet, java.util.LinkedHashSet, java.util.TreeSet, 
//java.util.concurrent.ConcurrentSkipListSet, java.util.EnumSet classes implements java.util.Set interface.
//	HashSet, CopyOnWriteArraySet, LinkedHashSet, TreeSet, ConcurrentSkipListSet, EnumSet classes implements Set interface in java.

//Unsyncronized HashSet, LinkedHashSet, TreeSet, EnumSet
//Synchronized CopyOnWriteArraySet, ConcurrentSkipListSet
//Most of the java.util.Set implementation does not maintain insertion order.
	 //Set uses Map for their implementation. 
	// Hence, structure is map based and resizing depends on Map implementation.
public class Collection_Sets {

	public static void main(String[] args) {
		 Set<String> hashSet=new HashSet<String>(); //Set does not allow to store duplicate elements in java.
	//implements java.util.Set interface.
		 //Example > HashSet internally uses HashMap.
		 hashSet.add("javaMadeSoEasy");    //HashSet does not maintains insertion order in java.
		 hashSet.contains("2");
		 System.out.println(hashSet.size());
		 Iterator<String> iterator=hashSet.iterator();//Set does not provide anything like listIterator. It simply return Iterator in java.
		    while(iterator.hasNext()){//iterator returned by java.util.HashSet is fail-fast. 
		           System.out.println(iterator.next());
		    }
		

			 Set<String> linkedHashSet=new LinkedHashSet<String>(); //maintains insertion order in java.
			// For storing elements LinkedHashSet internally uses  LinkedHashMap.
 //implements java.util.Set interface.
			 
			 
			 //   Most of the Set implementations allow to add only one null in java.
			  //  TreeSet and ConcurrentSkipListSet does not allow to add null in java.
				 Set<String> treeSet=new TreeSet<String>();// TreeSet is sorted by natural order in java.
	          //For storing elements TreeSet internally uses TreeMap.


		
	}

}
