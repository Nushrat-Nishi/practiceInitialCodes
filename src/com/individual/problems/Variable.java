package com.individual.problems;

/*---------------------learning static variable---------------------------------------------*/
public class Variable {

	public static void main(String[] args) {

		Practice y1 = new Practice();
		Practice y2 = new Practice();

		int p1 = y1.prac(5);
		int p2 = y2.prac(15);

		System.out.print("The value of p1 is:" + p1);
		System.out.print("\n");
		System.out.print("The value of p2 is:" + p2);
	}
}

class Practice {

	static int s = 0;

	public int prac(int p) {
		s = s + p;
		return s;
	}
}
/*------------------only ei file alada----eta run korlei cholbe-------------------------------------------------*/