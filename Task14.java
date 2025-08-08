package Tasks;

import java.util.Vector;

public class Task14 {
	public static void main(String[] args) {
		Vector<String> book = new Vector<String>();
		
		book.add("Atomic Habits");
		book.add("Power");
		book.add("Think Like a Monk");
		
		System.out.println(book);
		
		book.addFirst("Rich Dad Poop Dad"); // add at the 0 index or first place.
		
		System.out.println(book);
	}
}