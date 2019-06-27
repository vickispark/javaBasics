package com.Collection;

import java.util.LinkedHashSet;
import java.util.Set;

class SetInterface{
	public static void main(String[] args) {
	//  Creating a new Set object of type Integer
		Set<Integer> numberSet = new LinkedHashSet<>();
		 
		//  Adding elements to the set
		numberSet.add(12);
		numberSet.add(24);
		numberSet.add(12);
		 
		//  Displaying the Set
		System.out.println(numberSet);
	}
    
}