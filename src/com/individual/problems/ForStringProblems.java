package com.individual.problems;

public class ForStringProblems {

	public static void main(String[] args) {
		// for method 1
		String myString = "Mahmood gives lesson to a fool.";

		System.out.println("String: Problem 1");
		System.out.println("The boolean problem is:" + trueOrFalse(myString));

		// FIXME
		// for method 2
		String[] myStringArray = new String[4];
		myStringArray[0] = "Cheese7";
		myStringArray[1] = "Pepperoni11";
		myStringArray[2] = "Black Olives14";
		myStringArray[3] = "Black Olives14";

		System.out.println("\nString: Problem 2");
		System.out
				.println("The Sum Of all String length of an string array is:"
						+ sumOfStringLength(myStringArray));

		// FIXME
		// for method 3
		String[] myStringArray2 = new String[6];
		myStringArray2[0] = "Mahmood8";
		myStringArray2[5] = "majdkfkffd12";
		myStringArray2[2] = "Nishi6";
		myStringArray2[3] = "Mahmod7";
		myStringArray2[4] = "Love5";
		myStringArray2[1] = "Nis4";

		System.out.println("\nString: Problem 3");
		System.out.println("The String of maximum length is:"
				+ stringOfMaximumLength(myStringArray2));

		// for method 4

		// String stringDate = "20/07/1987";

		System.out.println("\nString: Problem 4");
		System.out.println("The String Date in sentence is:"
				+ stringDate("20/07/1987"));

		System.out.println("The String Date in sentence is:"
				+ stringDate("02/01/1987"));
		
		System.out.println("The String Date in sentence is:"
				+ stringDate("1/2/1987"));
		
		System.out.println("The String Date in sentence is:"
				+ stringDate("03/05/1987"));

	}

	/**
	 * method(1) Check whether word �fool� found in inputed String
	 * 
	 * @param myString
	 *            a String where to find String 'fool'
	 * @return return true if String 'fool' is found and false otherwise
	 */
	public static boolean trueOrFalse(String myString) {

		if (myString.indexOf("fool") == -1) {
			return false;
		} else {
			return true;

		}

	}

	/**
	 * method(2) that takes a string array and return the sum of all strings
	 * length.
	 * 
	 * @param myStringArray
	 *            a String array where to find the sum of all Strings length
	 * @return the sum of all Strings length
	 */
	public static int sumOfStringLength(String[] myStringArray) {

		int sum = 0;
		for (int i = 0; i < myStringArray.length; i++) {
			sum += myStringArray[i].length();

		}

		return sum;

	}

	/**
	 * method(3) that takes a string array and return the string that has
	 * maximum length.
	 * 
	 * @param myStringArray2
	 *            a String array where to find the string of maximum length
	 * @return the string of maximum length
	 */
	public static String stringOfMaximumLength(String[] myStringArray2) {

		String maxLength = "0";
		int maxValue = myStringArray2[0].length();

		for (int i = 1; i < myStringArray2.length; i++) {

			if (myStringArray2[i].length() > maxValue) {
				maxValue = myStringArray2[i].length();
				maxLength = myStringArray2[i];

			}

		}

		return maxLength;

	}

	/**
	 * method(4) that takes a string date as date format and return the string
	 * in sentence.
	 * 
	 * 
	 * method that takes a string date like �20/07/1987� and return a string as
	 * - �You are born on 20th July 1987� and �01/01/1999� as �You are born on
	 * 1st January 1999�.
	 * 
	 * @param stringDate
	 *            a String date to convert in string sentence
	 * @return the string sentence
	 */
	public static String stringDate(String stringDate) {
		// String stringDate1 = "20/07/1987";
		String resultString = null;

		if (stringDate.contains("/")) {
			String[] dateParts = stringDate.split("/");
			String date = dateParts[0];
			String month = dateParts[1];
			String year = dateParts[2];

			StringBuffer sBuffer = new StringBuffer();
			sBuffer.append("You are born on ");
			

			String[] dateArray = { "st ", "nd ", "rd " };

			int dateInt = Integer.parseInt(date);
			
			sBuffer.append(dateInt);
			if (dateInt == 1 || dateInt == 2 || dateInt == 3) {

				sBuffer.append(dateArray[dateInt - 1]);

			} else {
				sBuffer.append("th ");
			}

			String[] monthArray = { "January ", "February ", "March ",
					"April ", "May ", "June ", "July ", "August ",
					"September ", "October ", "November ", "December " };
			int monthInt = Integer.parseInt(month);

			sBuffer.append(monthArray[monthInt - 1]);

			sBuffer.append(year);
			resultString = sBuffer.toString();

		}
		return resultString;

	}
}
