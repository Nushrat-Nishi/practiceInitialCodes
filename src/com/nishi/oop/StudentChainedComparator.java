package com.nishi.oop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentChainedComparator implements Comparator<Student> {

	private List<Comparator<Student>> listComparators;

	@SafeVarargs
	public StudentChainedComparator(Comparator<Student>... comparators) {
		this.listComparators = Arrays.asList(comparators);
	}

	public int compare(Student student1, Student student2) {
		for (Comparator<Student> comparator : listComparators) {
			int result = comparator.compare(student1, student2);
			if (result != 0) {
				return result;
			}
		}
		return 0;
	}
}