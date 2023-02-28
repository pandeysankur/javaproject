package org.example.collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Hashmap {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(14);
		list.add(14);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(73);
		list.add(73);
		for(Integer a: list) {
			if(map.containsKey(a)) {
				Integer value = map.get(a);
				value++;
				map.put(a, value);
			}else {
				map.put(a, 1);
			}
		}
		System.out.println(map);
		
		/*
		 * Map<Integer, Long> collect = list.stream()
		 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 * System.out.println(collect);
		 */
		

	}
}
