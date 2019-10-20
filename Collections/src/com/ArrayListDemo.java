package com;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// write your code here
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);

		System.out.println(list);
		//checking array list contains particular element
		if (list.contains(78)) {
			System.out.println("list contains element" + list.get(0));
		} else {
			System.out.println("does not contain element");
		}
		// printing array list elements using various techniques
		System.out.println("printing elements using normal for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("#2printing elements using advance for loop");
		for (Integer integer : list) {
			System.out.println(integer);

		}

		System.out.println("#3using while loop");
		int j = 0;
		while (list.size() > j) {

			System.out.println(list.get(j));
			j++;
		}
		System.out.println("4.using iterator");
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("5.using list iterator");
		itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		ArrayList<String> str = new ArrayList<>();


		str.add("kerala");
		str.add("delhi");
		str.add("bangalore");
		str.add("ap");
		str.add("ts");
		str.add("karnataka");
		str.add("chennai");
		str.add("up");
		System.out.println(str);

		System.out.println("*******************************************");
		System.out.println("printing String elements ");
		System.out.println("1.printing elements using normal for loop");
		for (int i = 0; i < str.size(); i++) {
			System.out.println(str.get(i));
		}
		System.out.println("#2printing elements using advance for loop");
		for (String str1 : str) {
			System.out.println(str1);

		}

		System.out.println("#3using while loop");
		int k = 0;
		while (str.size() > k) {

			System.out.println(str.get(k));
			k++;
		}
		System.out.println("4.using iterator");
		Iterator<String> str1 = str.iterator();
		while (str1.hasNext()) {
			System.out.println(str1.next());
		}
		System.out.println("5.using list iterator");
		str1 = str.listIterator();
		while (str1.hasNext()) {
			System.out.println(str1.next());
		}
	}
}
