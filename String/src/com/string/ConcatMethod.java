package com.string;

public class ConcatMethod {

	public static void main(String[] args) {
		String s1="Praveen";
		String s2="Java";
		// + operator method
		System.out.println(s1+s2);//Praveen Java
		System.out.println(s1+10); //Praveen10
		System.out.println(s1+10+20);//Praveen30
		System.out.println(20+s1+10);//20Praveen10
		System.out.println(10+20+s1);//30Praveen
		System.out.println(s1+20/10);//Praveen2
		System.out.println(s1+10*20);//Praveen200
//		System.out.println(s1+20-10);arror provide krega
		
		//concat method
		System.out.println(s1.concat(s2));//Praveen Java
		
		//join method
		
		System.out.println(String.join("/",s1,s2,s1));//Praveen/Java/Praveen

	}

}
