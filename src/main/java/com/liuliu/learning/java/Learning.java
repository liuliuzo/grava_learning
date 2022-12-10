package com.liuliu.learning.java;

import java.util.Objects;

public class Learning {
	private String str1;

	private String str2;

	private String str3;

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public String getStr3() {
		return str3;
	}

	public void setStr3(String str3) {
		this.str3 = str3;
	}

	@Override
	public String toString() {
		return "Learning [str1=" + str1 + ", str2=" + str2 + ", str3=" + str3 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(str1, str2, str3);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Learning other = (Learning) obj;
		return Objects.equals(str1, other.str1) && Objects.equals(str2, other.str2) && Objects.equals(str3, other.str3);
	}

}
