package com.liuliu.learning.grava.demo;

import java.util.List;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

public class Demo03 {
	public static void main(String[] args) {
		// Guava 中快速创建ArrayList
		List<String> list = Lists.newArrayList("a", "b", "c", "d");
		// 开始校验
		int index = Preconditions.checkElementIndex(5, list.size());
		// java.lang.IndexOutOfBoundsException: index (5) must be less than size (4)
	}
}
