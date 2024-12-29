package basic_questions;

// 20 Find the Missing Number in an Array........
public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 0, 8, 4, 5, 6, 7, 1, 2, 3 };
		int n = arr.length;
		int total = n * (n + 1) / 2;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		System.out.println("Missing Number: " + (total - sum));
	}

}
