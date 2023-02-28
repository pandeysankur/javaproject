package recursion;

public class RecursionDemo {

	public static void reverseMethod(int number) {
		if (number < 10) {
			System.out.println(number);
			return;
		} else {
			System.out.print(number % 10);
			// Method is calling itself: recursion
			reverseMethod(number / 10);
		}
	}
}
