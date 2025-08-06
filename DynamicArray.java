package DSAJava;

import java.util.ArrayList;
import java.util.Collections;

public class DynamicArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(90);
		
		Collections.sort(list);
		System.out.println(list);

	}

}
