package com.nishi.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

	private String name;
	private int roll;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	List<Integer> getRollList(List<Student> students) {
		List<Integer> rollList = new ArrayList<Integer>();
		for (Student student : students) {
			rollList.add(student.getRoll());
		}
		return rollList;
	}

	List<String> getStudentNameList(List<Student> students) {
		List<String> studentNameList = new ArrayList<String>();
		for (Student student : students) {
			studentNameList.add(student.getName());
		}
		return studentNameList;
	}

	List<Integer> getSortedRoll(List<Integer> studentRollList) {
		Collections.sort(studentRollList);
		return studentRollList;
	}

	List<String> getSortedStudentName(List<String> studentNameList) {
		Collections.sort(studentNameList);
		return studentNameList;
	}

	List<Student> getStudentListSortedByRoll(List<Student> studentList) {

		return studentList;
	}

	/**********************************************************************/

	public int compareTo(Student student1) {
		int compareRoll = student1.getRoll();

		return roll - compareRoll;

	}

	/*****************************************************************************/
	@Override
	public String toString() {
		return "Student [Name=" + name + ", Roll=" + roll + "]";
	}

}
