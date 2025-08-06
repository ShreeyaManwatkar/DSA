package DSAJava;

public class Task7 {

	public static void main(String[] args) {
		int[] arr = {7, 2, 3, 4, 9};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Odd numbers" + " "+ count);
	}

}
