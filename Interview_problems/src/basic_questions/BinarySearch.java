package basic_questions;

public class BinarySearch {

	public static void bubbleSort(int num[]) {
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - 1 - i; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
	}

	public static int binarySearch(int[] num, int target) {

		int start = 0;
		int end = num.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (num[mid] == target) {
				return mid;
			}
			if (num[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int num[] = { 2, 8, 3, 9, 12, 16, 18, 11, 3 };
		int target = 11;

		bubbleSort(num);
		int index = binarySearch(num, target);

		if (index == -1)
			System.out.println("Key Not Found");
		else
			System.out.println("Key Found at index position " + index);
	}

}
