package basic_questions;

public class RepeatedCharacter {
	public static void repeatedCharacterCount(String name) {
		int k = 0, a = 0, d = 0;
		char[] ch = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'k')
				k++;
			else if (ch[i] == 'a')
				a++;
			else if (ch[i] == 'd')
				d++;
		}
		System.out.println("k count: " + k + ",a count: " + a + ",d count: " + d);
	}

	public static void main(String[] args) {
		String name = "karnakarjonnalagada";
		repeatedCharacterCount(name);
	}

}
// k,a,d