package Collections;

import java.util.Arrays;

public class First_Day {

	public static void main(String[] args) {
		String[] cars = {"Honda City", "Tata Safary" ,"BMW"};

		System.out.println(Arrays.toString(cars));
		System.out.println("......................");

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("......................");
		for (String car : cars) {

			System.out.println(car);

		}
		
		
		

	}

}
