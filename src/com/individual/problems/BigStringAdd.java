package com.individual.problems;

import java.util.Scanner;

public class BigStringAdd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input Your very very BIG number:");

		String num = in.nextLine();
		Integer sum = doAdd(num);
		if (sum != null) {
			System.out.println("The sum of the digits is:" + sum);
		} else {
			System.out.println("Please Give valid input.");
		}

		try {
			int sum2 = doAdd2(num);
			System.out.println("The sum of the digits is:" + sum2);
		} catch (IllegalArgumentException e) {
			System.out.println("Please Give valid input. For exception.");
			System.out.println("Input Again Your very very BIG number:");

			num = in.nextLine();
			int sum2 = doAdd2(num);
			System.out.println("The sum of the digits is:" + sum2);
		}

	}

	public static Integer doAdd(String num) {

		int sum = 0;

		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '0' || num.charAt(i) == '1'
					|| num.charAt(i) == '2' || num.charAt(i) == '3'
					|| num.charAt(i) == '4' || num.charAt(i) == '5'
					|| num.charAt(i) == '6' || num.charAt(i) == '7'
					|| num.charAt(i) == '8' || num.charAt(i) == '9') {

				sum = sum + Character.getNumericValue(num.charAt(i));
			} else {
				return null;

			}

		}

		return sum;

	}

	public static int doAdd2(String num) throws IllegalArgumentException {

		int sum = 0;

		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '0' || num.charAt(i) == '1'
					|| num.charAt(i) == '2' || num.charAt(i) == '3'
					|| num.charAt(i) == '4' || num.charAt(i) == '5'
					|| num.charAt(i) == '6' || num.charAt(i) == '7'
					|| num.charAt(i) == '8' || num.charAt(i) == '9') {

				sum = sum + Character.getNumericValue(num.charAt(i));
			} else {
				throw new IllegalArgumentException(
						"Exception for inputting character.");

			}

		}

		return sum;

	}

}
