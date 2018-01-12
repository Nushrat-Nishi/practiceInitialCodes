package com.individual.problems;

public class LogicTwoProblems {

	public static void main(String[] args) {
		LogicTwoProblems logicTwoProblems = new LogicTwoProblems();

		// Link given problem Column-1 Problem 1: makeBricks
		System.out.println("Logic given problem 1 makeBricks :");
		System.out.println("True: " + logicTwoProblems.makeBricks(3, 1, 8));
		System.out.println("False: " + logicTwoProblems.makeBricks(3, 1, 9));
		System.out.println("True: " + logicTwoProblems.makeBricks(3, 2, 10));
		System.out.println("True: " + logicTwoProblems.makeBricks(1, 4, 11));
		System.out.println("True: " + logicTwoProblems.makeBricks(3, 2, 8));
		System.out.println("True: " + logicTwoProblems.makeBricks(0, 3, 10));

		// Link given problem Column-1 Problem 2: noTeenSum
		System.out.println("Logic given problem 2 noTeenSum :");
		System.out.println("6: " + logicTwoProblems.noTeenSum(1, 2, 3));
		System.out.println("3: " + logicTwoProblems.noTeenSum(2, 13, 1));
		System.out.println("3: " + logicTwoProblems.noTeenSum(2, 1, 14));

		// Link given problem Column-1 Problem 3: blackjack
		System.out.println("Logic given problem 3 blackjack :");
		System.out.println("21: " + logicTwoProblems.blackjack(19, 21));
		System.out.println("21: " + logicTwoProblems.blackjack(21, 19));
		System.out.println("19: " + logicTwoProblems.blackjack(19, 22));

		// Link given problem Column-2 Problem 1: loneSum
		System.out.println("Logic given problem 1 loneSum :");
		System.out.println("6: " + logicTwoProblems.loneSum(1, 2, 3));
		System.out.println("2: " + logicTwoProblems.loneSum(3, 2, 3));
		System.out.println("0: " + logicTwoProblems.loneSum(3, 3, 3));

		// Link given problem Column-2 Problem 2: roundSum
		System.out.println("Logic given problem 2 roundSum :");
		System.out.println("60: " + logicTwoProblems.roundSum(16, 17, 18));
		System.out.println("30: " + logicTwoProblems.roundSum(12, 13, 14));
		System.out.println("10: " + logicTwoProblems.roundSum(6, 4, 4));

		// Link given problem Column-2 Problem 3: evenlySpaced
		System.out.println("Logic given problem 3 evenlySpaced :");
		System.out.println("True: " + logicTwoProblems.evenlySpaced(2, 4, 6));
		System.out.println("True: " + logicTwoProblems.evenlySpaced(4, 6, 2));
		System.out.println("False: " + logicTwoProblems.evenlySpaced(4, 6, 3));

		// Link given problem Column-3 Problem 1: luckySum
		System.out.println("Logic given problem 1 luckySum :");
		System.out.println("6: " + logicTwoProblems.luckySum(1, 2, 3));
		System.out.println("3: " + logicTwoProblems.luckySum(1, 2, 13));
		System.out.println("1: " + logicTwoProblems.luckySum(1, 13, 3));

		// Link given problem Column-3 Problem 2: closeFar
		System.out.println("Logic given problem 2 closeFar :");
		System.out.println("True: " + logicTwoProblems.closeFar(1, 2, 10));
		System.out.println("False: " + logicTwoProblems.closeFar(1, 2, 3));
		System.out.println("True: " + logicTwoProblems.closeFar(4, 1, 3));

		// Link given problem Column-3 Problem 3: makeChocolate
		System.out.println("Logic given problem 3 makeChocolate :");
		System.out.println("4: " + logicTwoProblems.makeChocolate(4, 1, 9));
		System.out.println("-1: " + logicTwoProblems.makeChocolate(4, 1, 10));
		System.out.println("2: " + logicTwoProblems.makeChocolate(7, 1, 12));

	}

	// Link given problem Column-1 Problem 1: makeBricks
	public boolean makeBricks(int small, int big, int goal) {
		if (big * 5 + small < goal) {
			return false;

		} else if (goal % 5 > small) {
			return false;
		} else {
			return true;
		}

	}

	// Link given problem Column-1 Problem 2: noTeenSum
	public int noTeenSum(int a, int b, int c) {

		int x = fixTeen(a);
		int y = fixTeen(b);
		int z = fixTeen(c);

		int sum = x + y + z;
		return sum;

	}

	public int fixTeen(int n) {
		int result = 0;
		if (n == 15 || n == 16) {
			result = n;
		} else if (13 <= n && n <= 19) {
			result = 0;

		} else {
			result = n;
		}
		return result;

	}

	// Link given problem Column-1 Problem 3: blackjack
	public int blackjack(int a, int b) {
		int result = 0;
		int x = valid(a);
		int y = valid(b);

		if ((21 - x) < (21 - y)) {
			result = x;
		} else {
			result = y;
		}
		return result;

	}

	public int valid(int n) {
		int result = 0;
		if (n > 21) {
			result = 0;
		} else {
			result = n;
		}
		return result;
	}

	// Link given problem Column-2 Problem 1: loneSum
	public int loneSum(int a, int b, int c) {

		if (a == b) {
			b = 0;
			if (a == c) {
				c = 0;
			}
			a = 0;

		} else if (a == c) {

			c = 0;
			if (a == b) {
				b = 0;
			}
			a = 0;
		} else if (b == c) {

			c = 0;
			if (b == a) {
				a = 0;
			}
			b = 0;
		}

		int result = a + b + c;

		return result;

	}

	// Link given problem Column-2 Problem 2: roundSum
	public int roundSum(int a, int b, int c) {

		int result = round10(a) + round10(b) + round10(c);

		return result;

	}

	public int round10(int num) {
		int result;
		if (num % 10 < 5) {
			result = (num - num % 10); // 33
		} else {
			result = (num - num % 10) + 10; // 35
		}
		return result;
	}

	// Link given problem Column-2 Problem 3: evenlySpaced
	public boolean evenlySpaced(int a, int b, int c) {

		int largest = 0;
		int smallest = 0;
		int medium = 0;

		if (a == b && b == c) {
			return true;
		}

		if (a > b) {
			if (a > c) {
				largest = a;
				if (b > c) {
					medium = b;
				} else {
					medium = c;
				}

			} else {
				largest = c;
			}
		} else if (b > c) {
			largest = b;

			if (a > c) {
				medium = a;
			} else {
				medium = c;
			}

		} else {
			largest = c;
		}

		if (a < b) {
			if (a < c) {
				smallest = a;
				if (b < c) {
					medium = b;
				} else {
					medium = c;

				}
			} else {
				smallest = c;
			}
		} else if (b < c) {
			smallest = b;
			if (a < c) {
				medium = a;
			} else {
				medium = c;

			}

		} else {
			smallest = c;
		}

		int x = largest;
		int y = medium;
		int z = smallest;

		if ((x - y) == (y - z)) {
			return true;

		} else {
			return false;

		}

	}

	// Link given problem Column-3 Problem 1: luckySum
	public int luckySum(int a, int b, int c) {
		int result = 0;
		if (a == 13) {
			result = 0;
		} else if (b == 13) {
			result = a;

		} else if (c == 13) {
			result = a + b;
		} else {
			result = a + b + c;
		}

		return result;

	}

	// Link given problem Column-3 Problem 2: closeFar
	public boolean closeFar(int a, int b, int c) {

		if ((Math.abs(a - b) <= 1) && Math.abs(a - c) >= 2
				&& Math.abs(b - c) >= 2) {

			return true;

		} else if ((Math.abs(a - c) <= 1) && Math.abs(a - b) >= 2
				&& Math.abs(b - c) >= 2) {

			return true;

		} else {
			return false;
		}

	}

	// Link given problem Column-3 Problem 3: makeChocolate
	public int makeChocolate(int small, int big, int goal) {
		if ((small + big * 5) < goal) {
			return -1;
		} else if (goal % 5 > small) {
			return -1;
		} else if (goal % 5 == 0 && (goal / 5) > big) {
			return ((goal / 5) - big) * 5;

		} else if ((Math.round(goal / 5)) > big) {
			int s = (Math.round(goal / 5) - big) * 5;
			return (goal % 5 + s);
		} else {
			return goal % 5;
		}

	}

}
