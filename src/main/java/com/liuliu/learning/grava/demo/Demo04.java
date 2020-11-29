package com.liuliu.learning.grava.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableSet;

public class Demo04 {
	public static void main(String[] args) {
		// 创建方式1：of
		ImmutableSet<String> immutableSet = ImmutableSet.of("a", "b", "c");
		immutableSet.forEach(System.out::println);
		// a
		// b
		// c

		// 创建方式2：builder
		ImmutableSet<String> immutableSet2 = ImmutableSet.<String>builder()
		    .add("hello")
		    .add(new String("AAA"))
		    .build();
		immutableSet2.forEach(System.out::println);
		// hello
		// AAA
		// 创建方式3：从其他集合中拷贝创建
		ArrayList<String> arrayList = new ArrayList();
		arrayList.add("www.wdbyte.com");
		arrayList.add("https");
		ImmutableSet<String> immutableSet3 = ImmutableSet.copyOf(arrayList);
		immutableSet3.forEach(System.out::println);
		// www.wdbyte.com
		// https
		
		
		//native java unmodifiableList
		ArrayList<String> arrayList2 = new ArrayList();
		arrayList2.add("www.wdbyte.com");
		arrayList2.add("https");
		// JDK Collections 创建不可变 List
		List<String> list = Collections.unmodifiableList(arrayList2);
		list.forEach(System.out::println);// www.wdbyte.com https
		list.add("AAA"); // java.lang.UnsupportedOperationException
		
		
	}
}
