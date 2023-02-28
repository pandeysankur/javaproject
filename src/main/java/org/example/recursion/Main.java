package recursion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num = 0;
		System.out.println("Input your number and press enter: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		System.out.print("Reverse of the input number is:");
		RecursionDemo.reverseMethod(num);
		System.out.println();
	}

}
