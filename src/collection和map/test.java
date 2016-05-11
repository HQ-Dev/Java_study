package collection和map;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


import java.util.*;
public class test {

	public static void main(String[] args) {
		List strings  = Arrays.asList("B","D","R","S","Q");
		
		Collections.sort(strings,new stringComparator());
		System.out.println(strings);
	}
}

class stringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
	
}


class Account implements Comparable<Account>{
	private String name;
	private String number;
	private int balacne;
	
	public Account(String name, String number, int balacne) {

		this.name = name;
		this.number = number;
		this.balacne = balacne;
	}
	
	@Override
	public String toString() {
		return String.format("Account:%s, %s, %d", name, number, balacne);
	}

	@Override
	public int compareTo(Account o) {
		return this.balacne - o.balacne;
	}
}
