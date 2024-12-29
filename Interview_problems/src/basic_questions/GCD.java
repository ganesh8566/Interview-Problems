package basic_questions;

// 13 Calculate GCD of Two Numbers.............
public class GCD {

	public static void main(String[] args) {
		int a = 60;
		int b = 48;

		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		System.out.println("GCD: " + a);
	}

}
