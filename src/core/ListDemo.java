package core;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(20); // 0th
		list1.add(120); // 1st
		list1.add(220);
		list1.add(320);
		list1.add(420);

		System.out.println(list1.size());// 5
		System.out.println(list1.get(1));// 1st index -> 120
		System.out.println(list1.remove(2));// 2nd index -> 220

		System.out.println(list1);

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		for (int x : list1) {
			System.out.println(x);
		}

		int p = 0;
		while (p < list1.size()) {
			System.out.println(list.get(p));
			p++;
		}

	}
}
