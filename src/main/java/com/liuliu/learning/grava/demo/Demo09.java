package com.liuliu.learning.grava.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.HashMultimap;

public class Demo09 {
	public static void main(String[] args) {
		   HashMap<String, Set<String>> animalMap = new HashMap<>();
		   HashSet<String> dogSet = new HashSet<>();
		   dogSet.add("旺财");
		   dogSet.add("大黄");
		   animalMap.put("狗", dogSet);
		   HashSet<String> catSet = new HashSet<>();
		   catSet.add("加菲");
		   catSet.add("汤姆");
		   animalMap.put("猫", catSet);
		   System.out.println(animalMap.get("猫")); // [加菲, 汤姆]
		   
		   HashMultimap<String, String> multimap = HashMultimap.create();
		   multimap.put("狗", "大黄");
		   multimap.put("狗", "旺财");
		   multimap.put("猫", "加菲");
		   multimap.put("猫", "汤姆");
		   System.out.println(multimap.get("猫")); // [加菲, 汤姆]
	}
}
