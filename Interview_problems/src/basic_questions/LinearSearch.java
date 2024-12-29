package basic_questions;

public class LinearSearch {

	public static int linearSearch(int[] num, int target) {

		for (int i = 0; i < num.length; i++) {
			if(num[i] == target)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int num[] = { 1, 5, 10, 15, 16, 18, 2, 11, 46 };
		int target = 16;
		int index = linearSearch(num, target);
		
		if(index == -1)
			System.out.println("Key Not Found");
		else
			System.out.println("Key Found at Index of "+ index);
	}

}
