package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Second_Days {

	public static void main(String[] args) {
		List<String> swap = new ArrayList<String>();

		swap.add("Priya");
		swap.add("Mantu");
		swap.add("Ayush");
		System.out.println(swap);
		
		for (String str : swap) {
			System.out.println(str);
		}
		Collections.swap(swap, 0, 2);
		System.out.println(swap);
		for (String str1 : swap) {
			System.out.println(str1);
		}

	}

}
