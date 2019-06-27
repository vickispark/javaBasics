package com.Collection;

import java.util.ArrayList;
import java.util.Collections;

class Sorting{
	public static void main(String[] args) {
		ArrayList<String> companies = new ArrayList<>();
		companies.add("IBM");
		companies.add("Google");
		companies.add("Infosys");
		 
		Collections.sort(companies);
		System.out.println(companies);
	}
}