package com.nishi.oop;

import java.util.Comparator;

public class StudentRollComparator implements Comparator<Student> {

	public int compare(Student studentRoll1, Student studentRoll2) {
		return studentRoll1.getRoll() - studentRoll2.getRoll();
	}


}
