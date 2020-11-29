package com.liuliu.learning.grava.demo;

import com.google.common.base.Preconditions;

public class Demo02 {
	public static void main(String[] args) {
		String param = "www.wdbyte.com2";
		String wdbyte = "www.wdbyte.com";
		Preconditions.checkArgument(wdbyte.equals(param), "[%s] 404 NOT FOUND", param);
		// java.lang.IllegalArgumentException: [www.wdbyte.com2] 404 NOT FOUND
	}
}
