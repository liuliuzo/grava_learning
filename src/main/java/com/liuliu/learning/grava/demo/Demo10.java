package com.liuliu.learning.grava.demo;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

public class Demo10 {
	public static void main(String[] args) {
		// JDK 方式一
		ArrayList<String> list = Lists.newArrayList("a", "b", "c", null);
		String join = String.join(",", list);
		System.out.println(join); 	// a,b,c,null
		// JDK 方式二
		String result = list.stream().collect(Collectors.joining(","));
		System.out.println(result); // a,b,c,null
		// JDK 方式三
		StringJoiner stringJoiner = new StringJoiner(",");
		list.forEach(stringJoiner::add);
		System.out.println(stringJoiner.toString()); // a,b,c,null
		
		
		//grava
		ArrayList<String> list2 = Lists.newArrayList("a", "b", "c", null);
		String join2 = Joiner.on(",").skipNulls().join(list2);
		System.out.println(join2); // a,b,c
		String join3 = Joiner.on(",").useForNull("空值").join("旺财", "汤姆", "杰瑞", null);
		System.out.println(join3); // 旺财,汤姆,杰瑞,空值
	}
}
