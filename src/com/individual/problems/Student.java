package com.individual.problems;

public class Student {

	public static void main(String[] args) {
		System.out.print("The First Pattern is:\n");
		pattern1();

		System.out.print("The Second Pattern is:\n");
		pattern2();

		System.out.print("The Third Pattern is:\n");
		pattern3();

		System.out.print("The Fourth Pattern is:\n");
		pattern4();

		System.out.print("The Fifth Pattern is:\n");
		pattern5();
	}

	/*------------------First Pattern-----------------------------------------------------*/
	public static void pattern1() {

		int i = 0;
		int j = 0;

		for (i = 0; i < 5; i++) {
			System.out.print("*");

			for (j = 0; j < 4; j++) {
				System.out.print("*");

			}
			System.out.print("\n");
		}

	}

	/*-----------------Second Pattern------------------------------------------------------*/
	public static void pattern2() {

		int i = 0;
		int j = 0;
		int k = 0;

		for (k = 1; k <= 5; k++) {

			for (i = k; i > 0; i--) {
				System.out.print("*");
			}
			for (j = 5 - k; j > 0; j--) {
				System.out.print(" ");

			}
			System.out.print("\n");

		}

	}

	/*--------------------Third Pattern---------------------------------------*/
	public static void pattern3() {

		int i = 0;
		int j = 0;
		int k = 0;
		/*-----------------------------------------------------------------------*/
		for (k = 1; k <= 5; k = k + 2) {

			for (i = k; i < 4; i = i + 2) {
				System.out.print(" ");
			}

			for (j = 1; j <= k; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		/*----------------------------------------------------------------------*/
		for (k = 3; k >= 1; k = k - 2) {

			for (i = k; i < 4; i = i + 2) {
				System.out.print(" ");
			}

			for (j = 1; j <= k; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		/*-----------------------------------------------------------------------*/
	}

	/*-----------------Fourth Pattern----------------------------------------*/
	public static void pattern4() {

		int i = 0;
		int j = 0;
		int k = 0;
		/*-----------------------------------------------------------------------*/
		for (k = 1; k <= 5; k = k + 2) {

			for (i = k; i < 4; i = i + 2) {
				System.out.print(" ");
			}

			for (j = 1; j <= k; j++) {
				if (k == 5 && (j == 2 || j == 4)) {

					System.out.print(" ");

				} else {
					System.out.print("*");
				}
			}

			System.out.print("\n");
		}
		/*----------------------------------------------------------------------*/
		for (k = 3; k >= 1; k = k - 2) {

			for (i = k; i < 4; i = i + 2) {
				System.out.print(" ");
			}

			for (j = 1; j <= k; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		/*-----------------------------------------------------------------------*/
	}

	/*-----------------------Fifth Pattern-------------------------------------*/
	public static void pattern5() {

		int i = 0;
		int j = 0;		
		/*-----------------------------------------------------------------------*/
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				{
					if (((i == 1) && ((j == 1) || (j == 2)))
							|| ((i == 2) && ((j == 1) || (j == 2)))) {
						System.out.print(" ");

					} else {
						System.out.print("*");
					}
				}
			}
			System.out.print("\n");
		}
		/*-----------------------------------------------------------------------*/
	}
	/*--------------------------*****************---------------------------*/
}
