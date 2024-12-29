package basic_questions;

// 08 Merge Two Arrays...........
import java.util.Arrays;
// 08......................
import java.util.LinkedList;

public class MergeArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8, 9, 10 };
		int[] arr3 = { 11, 12, 13, 14, 15 };
		int[] arr4 = { 16, 17, 18, 19, 20 };

		int[] merged = new int[arr1.length + arr2.length + arr3.length + arr4.length];
		System.arraycopy(arr1, 0, merged, 0, arr1.length);
		System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
		System.arraycopy(arr3, 0, merged, arr1.length + arr2.length, arr3.length);
		System.arraycopy(arr4, 0, merged, arr1.length + arr2.length + arr3.length, arr4.length);

		System.out.println(Arrays.toString(merged));

//		Another Method.................
		LinkedList<Integer> v1 = new LinkedList<>();
		for (int i : arr1) {
			v1.add(i);
		}

		LinkedList<Integer> v2 = new LinkedList<>();
		for (int i : arr2) {
			v2.add(i);
		}

		v1.addAll(v2);
		System.out.println(v1);

	}

}
