package basic_questions;

import java.util.ArrayList;

public class Practice1 {
	public static void checkPrime(int[] arr) {
		ArrayList<Integer> al = new ArrayList<>();

		for (int num : arr)
			al.add(num);

		for (int num : arr) {
			boolean isCheck = true;
			if (num < 2)
				isCheck = false;
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					isCheck = false;
					break;
				}
			}
			if (isCheck)
				System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 9, 13, 27 };
		checkPrime(arr);
	}
}
