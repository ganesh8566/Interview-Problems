package basic_questions;

public class Practice2 {
	public static void findLargestAndSmallestElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Largest Digit in Given Array: " + arr[arr.length - 1]);
		System.out.println("Smallest Digit in Given Array: " + arr[0]);
	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 8, 2, 13, 11, 6 };
		findLargestAndSmallestElement(arr);
	}

}
