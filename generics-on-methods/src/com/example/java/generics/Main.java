package com.example.java.generics;

import java.util.ArrayList;
import java.util.Comparator;
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

		final Person person = min(madMen, new AgeComparator());

		System.out.println(person);
	}

	private static <T> T min(List<T> values, Comparator<T> comparator) {

		if (values.isEmpty()) {
			throw new IllegalArgumentException("List is empty");
		}

		T lowestElement = values.get(0);

		for (int i = 1; i < values.size(); i++) {

			final T element = values.get(i);

			if (comparator.compare(element, lowestElement) < 0) {
				lowestElement = element;
			}
		}
		return lowestElement;
	}
}
