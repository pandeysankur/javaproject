package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class First_Day_List {

	public static void main(String[] args) {

		List<String> cars = new ArrayList<String>();

		cars.add("Honda City");
		cars.add("Tata Safari");
		cars.add("BMW");
		cars.add("BMW");
		cars.add("BMW");

		System.out.println("Before the Sorting::" + cars);
		Collections.sort(cars);
		System.out.println("After the Sorting::" + cars);
		Collections.reverse(cars);
		System.out.println("After the reverse::" + cars);
		System.out.println(Collections.frequency(cars, "BMW"));

		Collections.replaceAll(cars, "Honda City", "Ayush");
		System.out.println("After the replaceAll::" + cars);
		System.out.println(Collections.emptyList());
		Collections.shuffle(cars);
		System.out.println(cars);

	}

}
