package com.individual.problems;

public class Array {

	public static void main(String[] args) {
		/*---------------------------------------------------------*/
		int anArray[] = new int[10];

		anArray[0] = 100;
		anArray[1] = 200;
		anArray[2] = 300;

		System.out.println("Element 1 at index 0: " + anArray[0]);
		System.out.println("Element 2 at index 1: " + anArray[1]);
		System.out.println("Element 3 at index 2: " + anArray[2]);
		/*---------------------------------------------------------*/
		System.out.println("\n");
		int length = anArray.length;
		System.out.println("The length is: " + length);
		/*---------------------------------------------------------*/
		System.out.println("\n");
		int[] anArray2 = { 400, 500, 600 };
		System.out.println("Element 1 at index 0: " + anArray2[0]);
		System.out.println("Element 2 at index 1: " + anArray2[1]);
		System.out.println("Element 3 at index 2: " + anArray2[2]);
		/*---------------------------------------------------------*/
		System.out.println("\n");
		int anArray3[] = { 700, 800, 900 };
		System.out.println("Element 1 at index 0: " + anArray3[0]);
		System.out.println("Element 2 at index 1: " + anArray3[1]);
		System.out.println("Element 3 at index 2: " + anArray3[2]);
		/*---------------------------------------------------------*/
		System.out.println("\n");
		String str = new String("Hello world!");
		System.out.println("Line 1: " + str);
		/*---------------------------------------------------------*/
		int len = str.length();
		System.out.println("Line 1 length is: " + len);
		/*---------------------------------------------------------*/
		char helloArray[] = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		System.out.println("Line 2 Nishi: " + helloString);
		/*---------------------------------------------------------*/
		String nishi = "Nishi";
		char getCharOfIndex2 = nishi.charAt(0);
		System.out.println("get Char Of Name: " + getCharOfIndex2);
		/*---------------------------------------------------------*/
		System.out.println("\n");
		int[][] twoD = new int[][] { { 5, 6 }, { 3, 8 }, { 3, 8 }, { 3, 8 }};
		int nishi1= twoD.length;
		int nishi2= twoD[0].length;
		System.out.println("Multi dimension array length: " + nishi1);
		System.out.println("How many columns?: " + nishi2);
		System.out.println("\n");
		/*---------------------------------------------------------*/
		String str1 = "Hi baby!";
		String heby = str1.substring(3, 8);
		System.out.println("Sub String: " + heby);
		String u = str1.toUpperCase();
		String l = str1.toLowerCase();
		System.out.println("UpperCase: " + u);
		System.out.println("LowerCase: " + l);

		
		int indexOfHaitch = str1.indexOf("!");
		System.out.println("indexOf method: " + indexOfHaitch);

	}
}