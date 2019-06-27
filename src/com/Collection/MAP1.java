package com.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class MapInterface {
	public static void main(String[] args) {
		Set<CourseE> courseSet1 = new HashSet<>();
		courseSet1.add(new CourseE("Java"));
		courseSet1.add(new CourseE("DBMS"));

		Set<CourseE> courseSet2 = new HashSet<>();
		courseSet2.add(new CourseE("PHP"));
		courseSet2.add(new CourseE("HTML"));
		courseSet2.add(new CourseE("CSS"));

		Map<Integer, Set<CourseE>> studentCourses = new HashMap<>();
		studentCourses.put(1001, courseSet1);
		studentCourses.put(1002, courseSet2);

		// Retrieving the set of Courses by studentID using get() method
		Set<CourseE> courseSet = studentCourses.get(1001);
		System.out.println("Retrieving the set of Courses by studentID: ");
		System.out.println(courseSet);

		// Iterating over the set of keys using for-each loop
		Set<Integer> setOfKeys = studentCourses.keySet();
		System.out.println("Iterating over the set of keys using for-each loop: ");
		for (Integer i : setOfKeys) {
			System.out.println(studentCourses.get(i));
		}
		// Iterating over the collection using values() method
		System.out.println("Iterating over the collection using values() method: ");
		for (Set<CourseE> courseSett : studentCourses.values()) {
			System.out.println(courseSett);
		}
	}

}

class CourseE {
	String courseName;

	public CourseE(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return courseName;
	}

}