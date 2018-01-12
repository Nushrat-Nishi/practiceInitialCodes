package com.nishi.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentHandler {

	public static void main(String[] args) {

		/**********************************************************************************/
		System.out.println("===== SORTING BY MULTIPLE ATTRIBUTES =====");
		Student student1 = new Student();
		student1.setName("Nishi");
		student1.setRoll(1);

		Student student2 = new Student();
		student2.setName("Mahmood");
		student2.setRoll(3);

		Student student3 = new Student();
		student3.setName("Jafar");
		student3.setRoll(2);

		Student student4 = new Student();
		student4.setName("Aziza");
		student4.setRoll(5);

		Student student5 = new Student();
		student5.setName("Arif");
		student5.setRoll(4);

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);

		System.out.println("*** Before sorting:");

		for (Student emp : studentList) {
			System.out.println(emp);
		}

		Collections.sort(studentList, new StudentRollComparator());

		System.out.println("\n*** After sorting:");

		for (Student emp : studentList) {
			System.out.println(emp);
		}
		
		System.out.println("\n*************** studentList:"+studentList);
		//Collections.sort(list, new MyComparator());
		
		//**********************
		System.out.println("\n*********miwao......***");
		   Collections.sort(studentList);

		   for(Student str: studentList){
				System.out.println(str);
		   }
		System.out.println("\n*********miwao......***");

		/**********************************************************************************/

		System.out.println("\nThe Get Roll List: "
				+ student1.getRollList(studentList));

		System.out.println("\nThe Get Student Name List: "
				+ student1.getStudentNameList(studentList));

		System.out.println("\nThe Get Sorted Roll List: "
				+ student1.getSortedRoll(student1.getRollList(studentList)));

		System.out.println("\nThe Get Sorted Student Name List: "
				+ student1.getSortedStudentName(student1
						.getStudentNameList(studentList)));

	}
}
