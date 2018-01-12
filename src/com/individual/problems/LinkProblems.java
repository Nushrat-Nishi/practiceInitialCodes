package com.individual.problems;

public class LinkProblems {

	public static void main(String[] args) {
		LinkProblems linkProblems = new LinkProblems();

		// Link given problem 1
		System.out.println("Link given problem 1 helloName  :");
		System.out.println(linkProblems.helloName("Bob"));
		System.out.println(linkProblems.helloName("Alice"));
		System.out.println(linkProblems.helloName("X"));

		// Link given problem 2
		System.out.println("Link given problem 2 makeOutWord  :");
		System.out.println(linkProblems.makeOutWord("<<>>", "Yay"));
		System.out.println(linkProblems.makeOutWord("<<>>", "WooHoo"));
		System.out.println(linkProblems.makeOutWord("[[]]", "word"));

		// Link given problem 3
		System.out.println("\nLink given problem 3 firstHalf :");
		System.out.println(linkProblems.firstHalf("WooHoo"));
		System.out.println(linkProblems.firstHalf("HelloThere"));
		System.out.println(linkProblems.firstHalf("abcdef"));

		// Link given problem 4
		System.out.println("\nLink given problem 4 nonStart :");
		System.out.println(linkProblems.nonStart("Hello", "There"));
		System.out.println(linkProblems.nonStart("java", "code"));
		System.out.println(linkProblems.nonStart("shotl", "java"));

		// Link given problem 5
		System.out.println("\nLink given problem 5 theEnd :");
		System.out.println(linkProblems.theEnd("Hello", true));
		System.out.println(linkProblems.theEnd("Hello", false));
		System.out.println(linkProblems.theEnd("oh", true));

		// Link given problem 6
		System.out.println("\nLink given problem 6 endsLy :");

		System.out.println(linkProblems.endsLy("oddl"));
		System.out.println(linkProblems.endsLy("oddly"));
		System.out.println(linkProblems.endsLy("ly"));

		// Link given problem 7
		System.out.println("\nLink given problem 7 middleThree :");

		System.out.println(linkProblems.middleThree("Candy"));
		System.out.println(linkProblems.middleThree("and"));
		System.out.println(linkProblems.middleThree("solvingCandyr"));

		// Link given problem 8
		System.out.println("\nLink given problem 8 lastChars:");

		System.out.println(linkProblems.lastChars("last", "chars"));
		System.out.println(linkProblems.lastChars("yo", "java"));
		System.out.println(linkProblems.lastChars("hi", ""));

		// Link given problem 9
		System.out.println("\nLink given problem 9 seeColor :");

		System.out.println("Input Color:" + linkProblems.seeColor("red"));
		System.out.println("Input Color:" + linkProblems.seeColor("a"));
		System.out.println("Input Color:" + linkProblems.seeColor("blu"));

		// Link given problem 10
		System.out.println("\nLink given problem 10 extraFront :");

		System.out.println("Input String:" + linkProblems.extraFront("Hello"));
		System.out.println("Input String:" + linkProblems.extraFront("ab"));
		System.out.println("Input String:" + linkProblems.extraFront("H"));

		// Link given problem 11
		System.out.println("\nLink given problem 11 startWord :");

		/*
		 * String nishiString = ""; System.out.println("\nThe length of " +
		 * nishiString + " is:" + nishiString.length()); String subStringStr =
		 * nishiString.substring(1, nishiString.length());
		 * System.out.println("\nThe subStringStr is:" + subStringStr);
		 */

		System.out.println("Start Word1:"
				+ linkProblems.startWord("hippo", "hi"));
		System.out.println("Start Word2:"
				+ linkProblems.startWord("hippo", "xip"));

		System.out.println("Start Word3:"
				+ linkProblems.startWord("hippo", "i"));

	}

	/*
	 * Link given problem 1 helloName
	 */
	public String helloName(String name) {
		String helloString = "Hello ";
		String result = helloString.concat(name).concat("!");
		return result;

	}

	/*
	 * Link given problem 2 makeOutWord
	 */
	public String makeOutWord(String out, String word) {
		String subOutString1 = out.substring(0, 2);
		String subOutString2 = out.substring(2, out.length());
		String resultString = subOutString1.concat(word).concat(subOutString2);

		return resultString;

	}

	/*
	 * Link given problem 3 Solution
	 */
	public String firstHalf(String str) {
		int strLength = str.length();
		int half = (strLength / 2);
		String strResult = str.substring(0, half);
		return strResult;

	}

	/*
	 * Link given problem 4 Solution
	 */
	public String nonStart(String a, String b) {
		String aResult = a.substring(1, a.length());
		String bResult = b.substring(1, b.length());
		String c = aResult.concat(bResult);
		return c;

	}

	/*
	 * Link given problem 5 Solution
	 */
	public String theEnd(String str, boolean front) {
		String[] strParts = str.split("(?<=\\G.)");
		String p = null;
		if (front == true) {
			p = strParts[0];

		} else if (front == false) {
			p = strParts[strParts.length - 1];

		}
		return p;

	}

	/*
	 * Link given problem 6 Solution
	 */

	public boolean endsLy(String str) {
		String strResult = null;
		boolean result = false;
		if (str.length() >= 2) {
			strResult = str.substring(str.length() - 2, str.length());
			result = strResult.equalsIgnoreCase("ly");
		}
		return result;
	}

	/*
	 * Link given problem 7 Solution
	 */
	public String middleThree(String str) {
		int p = str.length() / 2;

		String strResult = str.substring(p - 1, p + 2);
		return strResult;
	}

	/*
	 * Link given problem 8 Solution
	 */
	public String lastChars(String a, String b) {
		String[] aparts = a.split("");
		String[] bparts = b.split("");

		String x;
		String y;

		y = bparts[0].concat("@");

		if (aparts.length == 1) {
			x = aparts[0].concat("@");

		} else {
			x = aparts[1];
		}

		if (bparts.length == 1) {

			y = bparts[0].concat("@");

		} else {
			y = bparts[bparts.length - 1];
		}

		String resultString = x.concat(y);

		return resultString;
	}

	/*
	 * Link given problem 9 Solution
	 */

	public String seeColor(String str) {

		String result = "";
		if (str.startsWith("red")) {
			result = "red";
		} else if (str.startsWith("blue")) {
			result = "blue";
		}

		return result;
	}

	/*
	 * Link given problem 10 Solution
	 */
	public String extraFront(String str) {
		String result = null;
		if (str.length() >= 2) {

			String subString = str.substring(0, 2);
			result = subString.concat(subString).concat(subString);
		} else if (str.length() == 1) {
			String subString = str.substring(0, 1);
			result = subString.concat(subString).concat(subString);
		} else {
			result = "";
		}

		return result;

	}

	/*
	 * Link given problem 11 Solution
	 */
	public String startWord(String str, String word) {

		String subStringresult = null;

		if (str.length() >= word.length()) {
			if (word.substring(1, word.length()).equals(
					str.substring(1, word.length()))) {

				subStringresult = str.substring(0, word.length());

			} else {
				subStringresult = "";
			}

		} else {

			subStringresult = "";

		}
		return subStringresult;

	}
}
