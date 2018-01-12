package com.nishi.oop;

public class StudentComparable implements Comparable<Student> {
	public int compareTo(Student student1, int roll) {
		int compareRoll = student1.getRoll();
		/* For Ascending order */
		return roll - compareRoll;

	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
