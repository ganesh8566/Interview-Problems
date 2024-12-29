package basic_questions;

// 09 Find the Largest Element in an Array...............
public class LargestInArray {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 9, 17, 2, 1 };
		int largestNumber = arr[0];
		
		for(int num : arr) {
			if(largestNumber < num)
				largestNumber = num;
		}	
		System.out.println("Largest Element in Array: " + largestNumber);
		
//		Another Method.................
		int largest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
		}
		System.out.println("Largest Element in Array: " + largest);
	}

}
