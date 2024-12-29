package basic_questions;
// 12 Reverse a Number...........
public class ReverseANumber {

	public static void main(String[] args) {
		int num = 153;
		int sum = 0;
		
		while(num != 0) {
			int digit = num % 10;
			sum = sum *10 + digit;
			num /=10;
		}
		System.out.println("Reverse of a Number: "+sum);
	}

}
