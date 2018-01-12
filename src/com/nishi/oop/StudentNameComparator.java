package com.nishi.oop;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
	
	public int compare(Student studentName1, Student studentName2) {
		return studentName1.getName().compareTo(studentName2.getName());
	}
}
