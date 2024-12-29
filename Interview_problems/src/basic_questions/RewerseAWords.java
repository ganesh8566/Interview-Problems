package basic_questions;

public class RewerseAWords {
	public static void reverse(String sen) {
		String[] s = sen.split(" ");

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[s.length - 1 - i] + " " );
		}
	}

	public static void main(String[] args) {
		String sen = "Iam Going to Warangal";
		reverse(sen);
	}

}
