package DSAJava;

import java.util.HashMap;

public class SimpleHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> studentList = new HashMap<Integer, String>();
		studentList.put(1, "Eminem");
		studentList.put(2, "emiway");
		studentList.put(3, "snop dog");
		studentList.put(3, "snop dog");
		studentList.put(4, "snop dog");
		studentList.put(5, "Eminem");
		System.out.println(studentList);

	}

}