package com.individual.problems;

public class StringScrambler {

	public static void main(String[] args) {


		StringScrambler sScrambler = new StringScrambler();
		System.out.println(sScrambler.reverseString("Mahmood is a good boy"));
		
		System.out.println(StringScrambler.reverseString1("Nishi is a good Girl"));

	}

	public String reverseString(String givenString) {

		String[] givenStringParts = givenString.split(" ");

		StringBuffer sBuffer = new StringBuffer();

		for (int i = givenStringParts.length - 1; i >= 0; i--) {
			sBuffer.append(givenStringParts[i]);
			sBuffer.append(" ");
		}

		return sBuffer.toString();
	}
	
	
	public static String reverseString1(String givenString) {

		String[] givenStringParts = givenString.split(" ");

		StringBuffer sBuffer = new StringBuffer();

		for (int i = givenStringParts.length - 1; i >= 0; i--) {
			sBuffer.append(givenStringParts[i]);
			sBuffer.append(" ");
		}

		return sBuffer.toString();
	}

}
