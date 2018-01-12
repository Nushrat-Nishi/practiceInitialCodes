package com.individual.problems;

public class LinkProblemStringColumnThree {

	public static void main(String[] args) {
		LinkProblemStringColumnThree linkProblemStringColumnThree = new LinkProblemStringColumnThree();
		// Link given problem Column-3 Problem 1: makeTags

		System.out.println("Link given problem 1:");
		System.out.println(linkProblemStringColumnThree.makeTags("i", "Yay"));
		System.out.println(linkProblemStringColumnThree.makeTags("i", "Hello"));
		System.out
				.println(linkProblemStringColumnThree.makeTags("cite", "Yay"));

		// Link given problem Column-3 Problem 2: firstTwo
		System.out.println("\nLink given problem 2:");
		System.out.println(linkProblemStringColumnThree.firstTwo("Hello"));
		System.out.println(linkProblemStringColumnThree.firstTwo("abcdefg"));
		System.out.println(linkProblemStringColumnThree.firstTwo("ab"));
	}

	// Link given problem Column-3 Problem 1: makeTags
	public String makeTags(String tag, String word) {
		String result = "<".concat(tag).concat(">").concat(word).concat("</")
				.concat(tag).concat(">");
		return result;
	}

	// Link given problem Column-3 Problem 2: firstTwo
	public String firstTwo(String str) {
		String result=null;
		if (str.length()>=2) {
			 result=str.substring(0, 2);
			
		} else {
			 result=str;

		}
return result;
	}
}
