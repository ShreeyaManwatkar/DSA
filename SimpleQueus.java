package DSAJava;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueus {

	public static void main(String[] args) {
		
		Queue<String> names = new LinkedList<String>();
		
		names.add("Yuvi");
		names.add("Sonu");
		names.add("Shravani");
		names.add("Grace");
		names.add("Aarya");
			
		System.out.println(names);
		System.out.println(names.peek());

	}

}