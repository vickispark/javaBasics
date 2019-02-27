package com.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collection_Lists {

	public static void main(String[] args) {
		//java.util.List interface extends java.util.Collection interface.
	     //ArrayList, LinkedList, Vector, CopyOnWriteArrayList classes implements List interface in java.
		//Lists allows to store duplicate elements, maintain insertion order,allows to store many null keys 
		//unsychronized :ArrayList, LinkedList
		//Synchronized : Vector List
		//ArrayList uses array for implementation it is index based structure, hence provides random access to elements.
		//But LinkedList is not indexed based structure in java.
		List<String> list = new ArrayList<String>();	     
	     list.add("Feb");//List are Resizable-array
	     list.add("Jan");
	     list.add("July");
	     list.add("Dec");
	     list.add("Nov");	     
	     List<String> linkedList=new LinkedList<String>(); 
	     linkedList.add("ind");    
	    	//linkedList.remove();
	     linkedList.add(1, "ind");    
	   //  linkedList.addFirst("ind");    	     
	     //	    listIterator method returns listIterator to iterate over elements in List in java.
	     Iterator<String> iterator=linkedList.iterator();
	    	while(iterator.hasNext()){
	           	System.out.println(iterator.next());
	    	}
	    	for(String string:linkedList){
	          	System.out.println(string);
	   	}      
	     //Get method directly gets element on specified index. 
	 	//linkedList.get(1);
		System.out.println(linkedList.size());

	     Collections.sort(list,  new Comparator<String>() {
	         public int compare(String o1, String o2) {
	             try {
	                 SimpleDateFormat sdf = new SimpleDateFormat("MMM");
	                 return sdf.parse(o1).compareTo(sdf.parse(o2));  //sdf.parse returns date - So, Compare Date with date
	             } catch (ParseException ex) {
	                 return o1.compareTo(o2);
	             }
	         }
	     });
	     
	     System.out.println(list);
	
	
	
	
	}//main

}
