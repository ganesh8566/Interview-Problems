package basic_questions;

// 15 Count the Number of Digits in a Number...........
public class CountDigits {
	public static void main(String[] args) {
		int num = 12345;
		int count = 0;
		int sum = 0;

		while (num != 0) {
			int digit = num % 10;
			sum = sum * 10 + digit;
			num /= 10;
			count++;
		}
		System.out.println(count);

//		Another Method..................
		int count1 = String.valueOf(num).length();
		System.out.println(count1);

//		Another Method..................
		String s = String.valueOf(num);
		System.out.println(s.length());
	}
}
