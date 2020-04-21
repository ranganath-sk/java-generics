package com.example.java.generics;

import java.util.Comparator;

/**
 * @author Ranganatha S K
 *
 */
public class AgeComparator implements Comparator<Person> {

	@Override
	public int compare(final Person left, final Person right) {

		return Integer.compare(left.getAge(), right.getAge());
	}

}
