package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Example1 {

	public static void main(String[] args) {

		List<String> personList = new ArrayList();
		personList.add("aaaa");
		personList.add("ssss");
		personList.add("ffff");
		personList.add("ssss");
		personList.add("kkkk");
		personList.add("wwww");
		personList.add("cccc");
		personList.clear();

		System.out.println("Original List::" + personList);
		Collections.sort(personList);
		System.out.println("Sorted-alphabetically List::" + personList);
		Collections.reverse(personList);
		System.out.println("Reverse List::" + personList);
		Collections.shuffle(personList);
		System.out.println("shuffle List::" + personList);
		System.out.println("Repeated String is ::" + Collections.frequency(personList, "ssss"));
		System.out.println(personList);

	}

}
