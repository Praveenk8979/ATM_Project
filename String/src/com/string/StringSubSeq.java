package com.string;

public class StringSubSeq {

	public static void main(String[] args) {
		String s1="This is Demo";
		System.out.println(s1.subSequence(3, 9));// s is D
		System.out.println(s1.substring(4));//is Demo
		System.out.println(s1.substring(3, 11));//s is Dem
		System.out.println(s1.substring(0, 0));//empty
	}

}
