package basic_questions;
//  01 Reverse a String..............
public class ReverseString {

	public static void main(String[] args) {
		String input = "Ganesh Tarak";
		char[] c = input.toCharArray();

		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		System.out.println();
		
//		Another Method......
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		System.out.println(sb);
	}

}
