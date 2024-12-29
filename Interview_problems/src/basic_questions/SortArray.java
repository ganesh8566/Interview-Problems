package basic_questions;

// 07 Sort an Array.............
import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 8, 1, 3 };
		System.out.println("Input Array: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Output Array" + Arrays.toString(arr));

//		Another Method...............
		Arrays.sort(arr);
		System.out.println("Output Array in Ascending Order: " + Arrays.toString(arr));
		Integer[] arr1 = { 1, 2, 3, 4, 8 };
		Arrays.sort(arr1, Collections.reverseOrder());
		System.out.println("Output Array in Descending Order: " + Arrays.toString(arr1));
	}

}
