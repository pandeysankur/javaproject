package hackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BhaiyaQ1Itteration {
	public static void main(java.lang.String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number");
			int n = sc.nextInt();
			int count = 0;
			while (n != 1) {
				if (n % 2 == 0) {
					n = n / 2;
					System.out.println(n);
				} else {
					n = (3 * n) + 1;
					System.out.println(n);
				}
				count++;
			}
			System.out.println("Total Number of Itteration::" + count);
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException::Input Only In Integer");
		}
	}
}
