package basic_questions;

public class FibonacciRecursion {

	public static void fibonacci(int n) {
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b + " ");

		for (int i = 2; i < n; i++) {
			int c = b + a;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

	public static int fibonacciUsingRecursion(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int fn1 = fibonacciUsingRecursion(n - 1);
		int fn2 = fibonacciUsingRecursion(n - 2);
		int fn3 = fn1 + fn2;
		System.out.print( fn3 + " ");
		return fn3;
	}

	public static void main(String[] args) {
		int n = 10;
//		fibonacci(n);
		fibonacciUsingRecursion(n);

	}

}
