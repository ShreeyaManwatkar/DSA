package DSAJava;

import java.util.ArrayList;


public class Arraylist {
	
	public static void main(String[] args) {
		
		ArrayList<String> students = new ArrayList();
		
		students.add("shreeya");
		students.add("oshin");
		students.add("tushar");
		students.add("sakshi");
		students.add("vedant/vinayak");
		
		System.out.println(students);
		
		students.add("rohan");
		System.out.println(students);
	}
		
}
