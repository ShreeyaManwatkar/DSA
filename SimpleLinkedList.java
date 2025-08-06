package DSAJava;

import java.util.Collections;
import java.util.LinkedList;

public class SimpleLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		LinkedList<String> names = new LinkedList<String>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(50);
		numbers.add(40);
		
		names.add("Yuvi");
		names.add("Sonu");
		names.add("Shravani");
		names.add("Grace");
		names.add("Aarya");
		
		
		Collections.sort(names);
		Collections.sort(numbers);
		System.out.println(numbers);
		System.out.println(names);
	}

}