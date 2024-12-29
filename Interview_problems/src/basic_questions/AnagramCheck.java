package basic_questions;
// 14 Check for Anagram............
import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "nliste";
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
			System.out.println("It is an Anagram");
		else
			System.out.println("It is Not Anagram ");
	}

}
