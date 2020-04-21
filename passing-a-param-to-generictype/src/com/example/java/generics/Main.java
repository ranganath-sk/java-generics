package com.example.java.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ranganatha S K
 *
 */
public class Main {

	public static void main(String[] args) {

		Person donDraper = new Person("Don Draper", 89);
		Person peggyOlson = new Person("Peggy Olson", 65);
		Person bertCooper = new Person("Bert Cooper", 100);

		List<Person> madMen = new ArrayList<>();
		madMen.add(donDraper);
		madMen.add(peggyOlson);
		madMen.add(bertCooper);

		System.out.println(madMen);

		// sort the list with the help of anonymous class
		Collections.sort(madMen, new ReverseComparator<Person>(new AgeComparator()));

		System.out.println(madMen);
	}
}
