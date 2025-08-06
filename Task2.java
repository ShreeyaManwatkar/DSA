package DSAJava;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        Stack<String> stack = new Stack<>();

        // Ask user to enter 3 students roll numbers and names
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter roll number for student " + i );
            int roll = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter name for student " + i );
            String name = sc.nextLine();

            students.put(roll, name);
            stack.push(name);    
            sc.close();
            }

        
        System.out.println(stack.peek()); //peek.
        System.out.println(stack); //whole stack
    }


	}


