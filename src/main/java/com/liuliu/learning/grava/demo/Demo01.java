package com.liuliu.learning.grava.demo;

import com.google.common.base.Preconditions;

public class Demo01 {
	
	public static void main(String[] args) {
		String param = "AAA";
		String name = Preconditions.checkNotNull(param);
		System.out.println(name); // AAA
		String param2 = null;
		String name2 = Preconditions.checkNotNull(param2); //NullPointerException
		System.out.println(name2);
		String param3 = null;
		String name3 = Preconditions.checkNotNull(param3,"param2 is null");
		//java.lang.NullPointerException: param3 is null
	}
}
