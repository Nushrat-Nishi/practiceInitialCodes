package com.individual.problems;

public class LinkProblemStringColumnTwo {

	public static void main(String[] args) {
		LinkProblemStringColumnTwo linkProblemStringColumnTwo = new LinkProblemStringColumnTwo();
		// Link given problem Column-2 Problem 1: makeAbba
		System.out.println("Link given problem 1:");
		System.out.println(linkProblemStringColumnTwo.makeAbba("Hi", "Bye"));
		System.out.println(linkProblemStringColumnTwo.makeAbba("Yo", "Alice"));
		System.out.println(linkProblemStringColumnTwo.makeAbba("What", "Up"));

		// Link given problem Column-2 Problem 2: extraEnd
		System.out.println("Link given problem 2:");
		System.out.println(linkProblemStringColumnTwo.extraEnd("Hello"));
		System.out.println(linkProblemStringColumnTwo.extraEnd("ab"));
		System.out.println(linkProblemStringColumnTwo.extraEnd("Hi"));

		// Link given problem Column-2 Problem 3: withoutEnd
		System.out.println("Link given problem 3:");
		System.out.println(linkProblemStringColumnTwo.withoutEnd("Hello"));
		System.out.println(linkProblemStringColumnTwo.withoutEnd("java"));
		System.out.println(linkProblemStringColumnTwo.withoutEnd("coding"));

		// Link given problem Column-2 Problem 4: left2
		System.out.println("Link given problem 4:");
		System.out.println(linkProblemStringColumnTwo.left2("Hello"));
		System.out.println(linkProblemStringColumnTwo.left2("java"));
		System.out.println(linkProblemStringColumnTwo.left2("Hi"));

		// Link given problem Column-2 Problem 5: withouEnd2
		System.out.println("Link given problem 5:");
		System.out.println(linkProblemStringColumnTwo.withouEnd2("Hello"));
		System.out.println(linkProblemStringColumnTwo.withouEnd2("abc"));
		System.out.println(linkProblemStringColumnTwo.withouEnd2("a"));

		// Link given problem Column-2 Problem 6: nTwice
		System.out.println("Link given problem 5:");
		System.out.println(linkProblemStringColumnTwo.nTwice("Hello", 2));
		System.out.println(linkProblemStringColumnTwo.nTwice("Chocolate", 3));
		System.out.println(linkProblemStringColumnTwo.nTwice("Chocolate", 1));

		// Link given problem Column-2 Problem 7: hasBad
		System.out.println("Link given problem 7:");
		System.out.println(linkProblemStringColumnTwo.hasBad("badxx"));
		System.out.println(linkProblemStringColumnTwo.hasBad("xbadxx"));
		System.out.println(linkProblemStringColumnTwo.hasBad("xxbadxx"));

		// Link given problem Column-2 Problem 8: conCat
		System.out.println("Link given problem 8:");
		System.out.println(linkProblemStringColumnTwo.conCat("abc", "cat"));
		System.out.println(linkProblemStringColumnTwo.conCat("dog", "cat"));
		System.out.println(linkProblemStringColumnTwo.conCat("abc", ""));

		// Link given problem Column-2 Problem 9: frontAgain
		System.out.println("Link given problem 9:");
		System.out.println(linkProblemStringColumnTwo.frontAgain("edited"));
		System.out.println(linkProblemStringColumnTwo.frontAgain("edit"));
		System.out.println(linkProblemStringColumnTwo.frontAgain("ed"));
		System.out.println(linkProblemStringColumnTwo.frontAgain(""));
		System.out.println(linkProblemStringColumnTwo.frontAgain("x"));

		// Link given problem Column-2 Problem 10: without2
		System.out.println("Link given problem 10:");
		System.out.println(linkProblemStringColumnTwo.without2("HelloHe"));
		System.out.println(linkProblemStringColumnTwo.without2(""));
		System.out.println(linkProblemStringColumnTwo.without2("HelloHi"));
		System.out.println(linkProblemStringColumnTwo.without2("Hi"));
		System.out.println(linkProblemStringColumnTwo.without2("x"));

		// Link given problem Column-2 Problem 11: withoutX
		System.out.println("Link given problem 11:");
		System.out.println(linkProblemStringColumnTwo.withoutX("xHix"));
		System.out.println(linkProblemStringColumnTwo.withoutX("xHi"));
		System.out.println(linkProblemStringColumnTwo.withoutX("Hxix"));
		System.out.println(linkProblemStringColumnTwo.withoutX("Hi"));
		System.out.println(linkProblemStringColumnTwo.withoutX("x"));
		System.out.println(linkProblemStringColumnTwo.withoutX("Hexllo"));



	}

	// Link given problem Column-2 Problem 1: makeAbba
	public String makeAbba(String a, String b) {
		String cString = a.concat(b).concat(b).concat(a);
		// String d=cString.concat(b);
		return cString;
	}

	// Link given problem Column-2 Problem 2: extraEnd
	public String extraEnd(String str) {
		String p = str.substring(str.length() - 2, str.length());
		String resultString = p.concat(p).concat(p);
		return resultString;
	}

	// Link given problem Column-2 Problem 3: withoutEnd
	public String withoutEnd(String str) {
		String resultString = str.substring(1, str.length() - 1);

		return resultString;
	}

	// Link given problem Column-2 Problem 4: left2
	public String left2(String str) {
		String sub1String = str.substring(0, 2);
		String sub2String = str.substring(2, str.length());
		String resultString = sub2String.concat(sub1String);
		return resultString;
	}

	// Link given problem Column-2 Problem 5: withouEnd2
	public String withouEnd2(String str) {
		String resultString = null;

		if (str.length() >= 2) {
			resultString = str.substring(1, str.length() - 1);
		} else {
			resultString = "";
		}

		return resultString;
	}

	// Link given problem Column-2 Problem 6: nTwice
	public String nTwice(String str, int n) {
		String result = str.substring(0, n).concat(
				str.substring(str.length() - n, str.length()));
		return result;
	}

	// Link given problem Column-2 Problem 7: hasBad
	public boolean hasBad(String str) {

		if (str.length() >= 4) {
			if ("bad".equals(str.substring(0, 3))
					|| "bad".equals(str.substring(1, 4))) {
				return true;
			} else {
				return false;
			}
		} else if ("bad" == str) {
			return true;
		} else {
			return false;
		}
	}

	// Link given problem Column-2 Problem 8: conCat
	public String conCat(String a, String b) {
		String result = null;

		if ("".equals(a) || "".equals(b)) {
			result = a.concat(b);
		} else if (a.substring(a.length() - 1, a.length()).equals(
				b.substring(0, 1))) {
			result = a.concat(b.substring(1, b.length()));
		} else {
			result = a.concat(b);
		}

		return result;

	}

	// Link given problem Column-2 Problem 9: frontAgain
	public boolean frontAgain(String str) {
		if (str.length() >= 2) {
			String sub1 = str.substring(0, 2);
			String sub2 = str.substring(str.length() - 2, str.length());
			if (sub1.equals(sub2)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	// Link given problem Column-2 Problem 10: without2
	public String without2(String str) {
		String result = null;

		if (str.length() >= 2) {
			if (str.substring(0, 2).equals(
					str.substring(str.length() - 2, str.length()))) {
				result = str.substring(2, str.length());
			} else {
				result = str;
			}
		} else {
			result = str;
		}

		return result;

	}

	// Link given problem Column-2 Problem 11: withoutX
	public String withoutX(String str) {

		String result = null;
		if (str.length() >= 2) {
			if ("x".equals(str.substring(0, 1))
					&& "x".equals(str.substring(str.length() - 1, str.length()))) {
				result = str.substring(1, str.length() - 1);
			} else if ("x".equals(str.substring(0, 1))) {
				result = str.substring(1, str.length());
			} else if ("x"
					.equals(str.substring(str.length() - 1, str.length()))) {
				result = str.substring(0, str.length() - 1);

			} else {
				result = str;
			}
		}else if ("x".equals(str)) {
			result = "";
		} 
		else {
			result = str;
		}

		return result;
	}
}
