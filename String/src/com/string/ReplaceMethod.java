package com.string;

public class ReplaceMethod {

	public static void main(String[] args) {
		String s="This is Demo";
		System.out.println(s.replace("is", "was"));//Thwas was Demo
		System.out.println(s.replaceFirst("is", "was"));//Thwas is Demo
		System.out.println(s.replaceAll("is", "was"));//Thwas was Demo
		System.out.println(s.replaceAll("is(.)", "was"));//ThwaswasDemo
		System.out.println(s.replaceAll("is(.*)", "was"));//Thwas
		
	}
	
	
	
	

}
