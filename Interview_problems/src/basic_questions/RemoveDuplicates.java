package basic_questions;
// 10 Remove Duplicates from an Array................
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 3, 8, 9, 3, 2, 1 };
		HashSet<Integer> hs = new HashSet<>();
		for (int num : arr) {
			hs.add(num);
		}

		System.out.println(hs);
	}

}
