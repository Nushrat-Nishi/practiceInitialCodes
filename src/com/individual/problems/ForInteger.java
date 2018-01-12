package com.individual.problems;

public class ForInteger {

	public static void main(String[] args) {
		// for method 1 & 2
		int[] anArray = new int[5];
		anArray[0] = 1;
		anArray[1] = 2;
		anArray[2] = 3;
		anArray[3] = 4;
		anArray[4] = 5;
		System.out.println("\nInteger: Problem 1");
		System.out.println("The returned sum is:" + sumOfIntegerArray(anArray));

		System.out.println("\nInteger: Problem 2 ");
		System.out.println("The sum Of Odd Integers is:"
				+ sumOfOddIntegers(anArray));

		// FIXME
		// for method 3
		int[][] twoD = new int[][] { { 5, 6 }, { 3, 8 }, { 3, 8 }, { 3, 8 } };

		System.out.println("\nInteger: Problem3");
		System.out.println("The sum Of Integers of two dimensional array is:"
				+ sumOfTwoDimensionalIntegerArray(twoD));

	}

	public static int sumOfIntegerArray(int[] anArray) {

		// method(1) that takes an integer array and returns sum.
		int sum = 0;
		for (int i = 0; i < anArray.length; i++) {

			sum += anArray[i];
		}
		return sum;

	}

	public static int sumOfOddIntegers(int[] anArray) {
		// method(2) that takes an integer array and returns sum of odd
		// integers.
		int sum = 0;
		for (int i = 0; i < anArray.length; i++) {
			if (anArray[i] % 2 != 0) {

				sum += anArray[i];
			}
		}

		return sum;

	}

	public static int sumOfTwoDimensionalIntegerArray(int[][] twoD) {

		// method(3) that takes a two dimensional integer array and returns sum
		// of
		// integers.
		int sum = 0;

		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[0].length; j++) {
				sum += twoD[i][j];
			}
		}

		return sum;

	}

}
