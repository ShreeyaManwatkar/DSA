package DSAJava;

public class Task6 {

	public static void main(String[] args) {
		 int[] arr = {10, 90, 301, 40, 20};

	        int max = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        System.out.println("Largest number "+" "+ max);
	    }

	}

