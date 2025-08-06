package DSAJava;

import java.util.ArrayList;
import java.util.Collections;

public class Task12 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Yuvi");
		list.add("Sonu");
		list.add("Aarya");
		list.add("Vinayak");
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
