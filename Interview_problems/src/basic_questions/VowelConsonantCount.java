package basic_questions;

// 06 Count Vowels and Consonants........
public class VowelConsonantCount {

	public static void main(String[] args) {
		String input = "Automation";

		int vowelCount = 0;
		int consonantCount = 0;

		for (char c : input.toCharArray()) {
			if ("aeiouAEIOU".indexOf(c) != -1)
				vowelCount++;
			else if (Character.isLetter(c))
				consonantCount++;
		}
		System.out.println("Vowel Count: " + vowelCount);
		System.out.println("Consonant Count: " + consonantCount);

//		Another Method............

		for (char c : input.toCharArray()) {
			switch (Character.toLowerCase(c)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelCount++;
				break;
			default:
				if (Character.isLetter(c)) {
					consonantCount++;
					break;
				}
			}
		}
		System.out.println("Vowel Count: " + vowelCount);
		System.out.println("Consonant Count: " + consonantCount);
	}

}
