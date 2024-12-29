package basic_questions;
// 02 Check for Palindrome.........
public class Palindrome {

	public static void main(String[] args) {
		String input = "madam";
		String output = "";
		char[] c = input.toCharArray();

		for (int i = c.length - 1; i >= 0; i--) {
			output += c[i];
		}

		if (input.equals(output))
			System.out.println("Its a Palindrome");

//		Another Method............		
		String sb = new StringBuilder(input).reverse().toString();
		if (input.equals(sb))
			System.out.println("Its a Palindrome");

	}

}
