package basic_questions;
// 11 Check if a Number is ArmStrong......
public class ArmStrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int sum = 0;
		
		while (num != 0) {
			int digit = num % 10;
			sum += Math.pow(digit, 3);
			num /= 10;
		}
		if(sum == temp)
			System.out.println("It is a ArmStrong Number");
		else
			System.out.println("It is Not a ArmStrong Number");
	}

}
