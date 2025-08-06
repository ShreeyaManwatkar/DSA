package DSAJava;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        
        Scanner Fruits = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        LinkedList<String> list = new LinkedList<String>();
        
        System.out.println("Enter 5 fruits:");
        
        for (int i = 0; i < 5; i++) {
            String fruit = Fruits.nextLine();
            if (!set.contains(fruit)) {
                set.add(fruit);   
                list.add(fruit);  
            }else {
            	System.out.println(fruit + " is a duplicate and won't be added.");
            }
            
        }
        
        Fruits.close();

        System.out.println("\nFruits in basket: " + list);
        System.out.println("Fruits count: " + list.size());
    }
}


