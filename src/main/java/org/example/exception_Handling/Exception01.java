package exception_Handling;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a, b, c;

		try {
			System.out.println("Enter first Number::");
			b = obj.nextInt();
			System.out.println("Enter second  Number::");
			c = obj.nextInt();

			a = b / c;
			System.out.println("Div::" + a);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Your result goes on for infinity");
		}

	}

}
