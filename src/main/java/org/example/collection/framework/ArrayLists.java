package org.example.collection.framework;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(1);
		list.add("Java Programming");
		list.add("Collection");
		list.add('A');
		list.add(90000);
		list.add(true);
		list.remove(5);
		System.out.println("Linked List: "+list); 

	}

}
