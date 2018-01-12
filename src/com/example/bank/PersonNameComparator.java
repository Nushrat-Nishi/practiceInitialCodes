package com.example.bank;

import com.example.bank.Person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

	public int compare(Person personName1, Person personName2) {
		return personName1.getName().compareTo(personName2.getName());
	}
}
