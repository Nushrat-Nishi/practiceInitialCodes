package com.individual.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListProblems {

	public static void main(String[] args) {
		ListProblems listProblems = new ListProblems();

		// List given Problem 1
		System.out.println("List given Problem 1 is:");

		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(11);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);

		int result = listProblems.listSum(numbers);

		System.out.println(result);

		// List given Problem 2
		System.out.println("\nList given Problem 2 is:");

		List<Integer> numbersOdd = new ArrayList<Integer>();

		numbersOdd.add(1);
		numbersOdd.add(2);
		numbersOdd.add(3);

		int resultOdd = listProblems.listOddSum(numbersOdd);

		System.out.println(resultOdd);

		// List given Problem 3
		System.out.println("\nList given Problem 3 is:");

		LinkedList<Integer> mainNumbers = new LinkedList<Integer>();

		mainNumbers.add(11);
		mainNumbers.add(2);
		mainNumbers.add(3);
		mainNumbers.add(4);
		mainNumbers.add(5);
		mainNumbers.add(6);
		mainNumbers.add(7);
		mainNumbers.add(8);
		mainNumbers.add(9);

		List<Integer> result1 = listProblems.reverseList(mainNumbers);

		System.out.println(result1);

		// List given Problem 4
		System.out.println("\nList given Problem 4 is:");
		LinkedList<Double> multiNumbers = new LinkedList<Double>();

		multiNumbers.add(2.0);
		multiNumbers.add(2.0);
		multiNumbers.add(2.4);
		multiNumbers.add(1.0);
		multiNumbers.add(9.0);

		LinkedList<Double> multiResult = listProblems
				.multiplyPosition(multiNumbers);

		System.out.println(multiResult);

		// List given Problem 5
		System.out.println("\nList given Problem 5 is:");
		ArrayList<String> list = new ArrayList<String>();

		list.add("I");
		list.add("am");
		list.add("Nishi");
		list.add("Mahmood");

		List<String> listResult = listProblems.doubleList(list);
		System.out.println(listResult);

		// List given Problem 6

		System.out.println("\nList given Problem 6 is:");
		ArrayList<String> listswapPairs1 = new ArrayList<String>();

		listswapPairs1.add("to");
		listswapPairs1.add("be");
		listswapPairs1.add("or");
		listswapPairs1.add("not");
		listswapPairs1.add("to");
		listswapPairs1.add("be");
		listswapPairs1.add("Mahmood");
		System.out.println("\nlength is:" + listswapPairs1.size());
		System.out.println(listProblems.swapPairs(listswapPairs1));

		// List given Problem 7
		System.out.println("\nList given Problem 7 is:");
		ArrayList<String> liststutter = new ArrayList<String>();

		liststutter.add("I");
		liststutter.add("am");
		liststutter.add("Nishi");
		liststutter.add("Mahmood");

		int k = 4;

		System.out.println("\nlength is:" + liststutter.size());
		System.out.println(listProblems.stutter(liststutter, k));

		// List given Problem 8

		System.out.println("\nList given Problem 8 is:");
		int min = 5;
		int max = 8;
		List<Integer> listfilterRange = new ArrayList<Integer>();

		listfilterRange.add(4);
		listfilterRange.add(7);
		listfilterRange.add(9);
		listfilterRange.add(2);

		listfilterRange.add(7);
		listfilterRange.add(7);
		listfilterRange.add(5);
		listfilterRange.add(3);

		listfilterRange.add(5);
		listfilterRange.add(1);
		listfilterRange.add(7);
		listfilterRange.add(8);

		listfilterRange.add(6);
		listfilterRange.add(7);

		System.out.println("\nlength is:" + listfilterRange.size());

		System.out.println("[4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7]:  \n"
				+ listProblems.filterRange(listfilterRange, min, max));

		System.out
				.println("---------------------------------------------------------");
		List<Integer> removeOddNumberInput = new ArrayList<Integer>();
		removeOddNumberInput.add(2);
		removeOddNumberInput.add(5);
		removeOddNumberInput.add(4);
		System.out.println(listProblems.removeOddNumber(removeOddNumberInput));
	}

	// List given Problem 1
	public int listSum(List<Integer> numbers) {
		int sumNValues = 0;

		for (Integer num : numbers) {
			sumNValues += num;
		}

		return sumNValues;
	}

	// List given Problem 2
	public int listOddSum(List<Integer> numbersOdd) {
		int sumOddValues = 0;

		for (int x = 0; x < numbersOdd.size(); x++) {
			int xvalue = numbersOdd.get(x);
			if ((xvalue % 2) != 0) {

				sumOddValues += xvalue;
			}

		}

		return sumOddValues;
	}

	// List given Problem 3

	public LinkedList<Integer> reverseList(final LinkedList<Integer> mainNumbers) {

		Collections.reverse(mainNumbers);

		return mainNumbers;

	}

	// List given Problem 4

	public LinkedList<Double> multiplyPosition(LinkedList<Double> multiNumbers) {

		LinkedList<Double> multiNumbersResult = new LinkedList<Double>();

		for (int i = 0; i < multiNumbers.size(); i++) {

			multiNumbersResult.add(multiNumbers.get(i) * i);

		}

		return multiNumbersResult;

	}

	// List given Problem 5

	public List<String> doubleList(List<String> list) {

		List<String> list2 = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			list2.add(list.get(i));
			list2.add(list.get(i));
		}
		return list2;

	}

	// List given Problem 6
	public List<String> swapPairs(List<String> listswapPairs1) {
		List<String> listswapPairs = new ArrayList<String>();

		if ((listswapPairs1.size()) % 2 == 0) {
			for (int i = 0; i < (listswapPairs1.size() - 1); i = i + 2) {
				listswapPairs.add(listswapPairs1.get(i + 1));
				listswapPairs.add(listswapPairs1.get(i));
			}
		} else {
			for (int i = 0; i < (listswapPairs1.size() - 1); i = i + 2) {
				listswapPairs.add(listswapPairs1.get(i + 1));
				listswapPairs.add(listswapPairs1.get(i));
			}
			listswapPairs.add(listswapPairs1.get(listswapPairs1.size() - 1));
		}

		return listswapPairs;
	}

	// List given Problem 7

	public List<String> stutter(List<String> liststutter, int k) {

		List<String> liststutter2 = new ArrayList<String>();
		for (int i = 0; i < liststutter.size(); i = i + 1) {
			// liststutter2.add(liststutter.get(i));
			for (int j = 1; j <= k; j = j + 1) {
				liststutter2.add(liststutter.get(i));
			}

		}
		return liststutter2;

	}

	// List given Problem 8

	public List<Integer> filterRange(List<Integer> listfilterRange, int min,
			int max) {
		List<Integer> listfilterRange2 = new ArrayList<Integer>();
		boolean found = false;

		if (listfilterRange.size() > 0) {

			for (int i = 0; i < listfilterRange.size(); i++) {

				for (int j = min; j <= max; j++) {
					if ((listfilterRange.get(i)) == j) {
						found = true;
					}

				}
				if (found == false) {
					listfilterRange2.add(listfilterRange.get(i));
				}

				found = false;

			}

		} else {
			listfilterRange2 = listfilterRange;
		}

		return listfilterRange2;

	}

	public List<Integer> removeOddNumber(List<Integer> numList) {

		System.out.println("--->>input:: " + numList);

		for (Iterator<Integer> iterator = numList.iterator(); iterator
				.hasNext();) {
			Integer num = (Integer) iterator.next();
			if (num % 2 != 0) {
				iterator.remove();
			}

		}
		return numList;
	}

}
