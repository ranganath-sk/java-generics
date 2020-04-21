package com.example.java.generics;

public class SortedPairTest {

	public static void main(String[] args) {

		SortedPair<Integer> pair = new SortedPair<Integer>(1, 2);

		System.out.println(pair.getFirst().toString() + " " + pair.getSecond().toString());

		SortedPair<Integer> pair2 = new SortedPair<Integer>(2, 1);

		System.out.println(pair2.getFirst().toString() + " " + pair2.getSecond().toString());
	}
}
