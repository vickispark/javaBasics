package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CourseIdComparator implements Comparator<Courseet> {
	@Override
	public int compare(Courseet c1, Courseet c2) {
		return c1.courseId - c2.courseId;
	}
}

class Courseet {
	String courseName;
	int courseId;

	public Courseet(int courseId, String courseName) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return courseName;
	}

}

class UserInterface {
	public static void main(String[] args) {
		ArrayList<Courseet> courseList = new ArrayList<>();
		courseList.add(new Courseet(124, "AngularJS"));
		courseList.add(new Courseet(120, "Java"));
		courseList.add(new Courseet(121, "Hibernate"));

		Collections.sort(courseList, new CourseIdComparator());
		System.out.println(courseList);
	}

}