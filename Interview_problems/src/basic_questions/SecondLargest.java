package basic_questions;
//17 Find the Second Largest element in an Array.........

import java.util.Arrays;
import java.util.Collections;

public class SecondLargest {
	public static void main(String[] args) {
		Integer[] arr1 = { 12, 35, 1, 10, 34, 1 };
		Arrays.sort(arr1, Collections.reverseOrder());
		System.out.println("Second Largest Number: " + arr1[1]);

//		Another Method...............
		int[] arr2 = { 12, 35, 1, 10, 34, 1 };
		Arrays.sort(arr2);
		System.out.println("Second Largest Number: " + arr2[arr2.length - 2]);

	}

}
