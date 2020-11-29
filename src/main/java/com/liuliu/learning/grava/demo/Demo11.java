package com.liuliu.learning.grava.demo;

import java.util.Arrays;

import com.google.common.base.Splitter;

public class Demo11 {
	public static void main(String[] args) {
		//JDK
		String str = ",a,,b,";
		String[] splitArr = str.split(",");
		Arrays.stream(splitArr).forEach(System.out::println);
		System.out.println("------");
		/**
		 *
		 * a
		 * 
		 * b ------
		 */
		
		String str2 = ",a ,,b ,";
		Iterable<String> split = Splitter.on(",")
		    .omitEmptyStrings() // 忽略空值
		    .trimResults() // 过滤结果中的空白
		    .split(str2);
		split.forEach(System.out::println);
		/**
		 * a
		 * b
		 */
	}
}
