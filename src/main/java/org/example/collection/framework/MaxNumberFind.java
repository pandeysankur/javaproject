package collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxNumberFind {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<Integer>();
	      try {
	         list.add(14);
	         list.add(2);
	         list.add(2);
	         list.add(2);
	         list.add(2);
	         list.add(73);
	         System.out.println("Maximum element : " + Collections.max(list));
	         System.out.println("Maximum element : " + Collections.min(list));   
	      }
	      catch (ClassCastException e) {
	         System.out.println("Exception caught : " + e);
	      }

	}

}
