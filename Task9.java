package DSAJava;

import java.util.ArrayList;
import java.util.Collections;

public class Task9 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

       
        Collections.reverse(list);

        
        System.out.println(list);
		}
}
