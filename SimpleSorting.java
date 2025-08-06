package DSAJava;


import java.util.ArrayList;
import java.util.Collections;

public class SimpleSorting {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(80);
		
		System.out.println("Before sort :" + list);
		
		Collections.sort(list);
		System.out.println("After sorting ascending :" + list);
		
		
		System.out.println("After sorting descending :" + list.reversed());

	}

}