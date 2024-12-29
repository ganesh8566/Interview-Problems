package basic_questions;

public class Practice3 {
	public static String reverseOfString(String s) {
		char[] c = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = c.length - 1; i >= 0; i--) {
			sb.append(c[i]);
		}
		return sb.toString();
	}

	public static void checkPalindromes(String s1) {
		String[] s2 = s1.split(" ");
		for (int i = 0; i < s2.length; i++) {
			for (int j = 0; j < s2[i].length(); j++) {
				if (s2[i].equals(reverseOfString(s2[i]))) {
					System.out.print(s2[i] + " ");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		String s1 = "hello madam what was your level in academics";
		checkPalindromes(s1);
	}
}
