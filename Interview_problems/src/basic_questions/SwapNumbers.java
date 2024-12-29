package basic_questions;

// 18 Swap Two Numbers................
public class SwapNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a: " + a + " b: " + b);

//		Another Method..........
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a: " + a + " b: " + b);

//		Another Method.............
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a: " + a + " b: " + b);

	}

}
