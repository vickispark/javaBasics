package com.Collection;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

class Course11 {
	String courseName;

	public Course11(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return courseName;
	}

}

class ListInterface {
	public static void main(String[] args) {
		List<Course11> courseList = new LinkedList<>();
		courseList.add(new Course11("Java"));
		courseList.add(new Course11("Hibernate"));
		courseList.add(new Course11("AngularJS"));

		// Accesing the list of courses Using Iterator
		Iterator<Course11> courseIterator = courseList.iterator();
		System.out.println("Using Iterator to access the list of courses");
		while (courseIterator.hasNext()) {
			Course11 c = courseIterator.next();
			System.out.println(c); // toString() method has been overridden in the Course class
		}

		// Accesing the list of courses Using for loop
		System.out.println("Using for loop to access the list of courses");
		for (int index = 0; index < courseList.size(); index++) {
			System.out.println(courseList.get(index));
		}

		// Accesing the list of courses Using enhanced for loop (for-each)
		System.out.println("Using enhanced for loop to access the list of courses");
		for (Course11 c : courseList) { // Can be read as: for each Course c in courseList
			System.out.println(c);
		}
	}


}