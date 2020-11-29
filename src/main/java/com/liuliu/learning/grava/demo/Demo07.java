package com.liuliu.learning.grava.demo;

import java.util.Set;

import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

public class Demo07 {
	public static void main(String[] args) {
		Set<String> newHashSet1 = Sets.newHashSet("a", "a", "b", "c");
		Set<String> newHashSet2 = Sets.newHashSet("b", "b", "c", "d");
		// 交集
		SetView<String> intersectionSet = Sets.intersection(newHashSet1, newHashSet2);
		System.out.println(intersectionSet); // [b, c]
		// 并集
		SetView<String> unionSet = Sets.union(newHashSet1, newHashSet2);
		System.out.println(unionSet); // [a, b, c, d]
		// newHashSet1 中存在，newHashSet2 中不存在
		SetView<String> setView = Sets.difference(newHashSet1, newHashSet2);
		System.out.println(setView); // [a]
	}
}
