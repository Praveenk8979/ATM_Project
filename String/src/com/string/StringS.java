package com.string;

public class StringS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("        PRAVEEN      ");
		String k=new String("praveen");
		System.out.println(s==k);//false
		System.out.println(s.equals(k));//true
		//s.concat("chauhan");
		System.out.println("=======================================================");
    	System.out.println(s);
    	System.out.println(s.length());
		System.out.println("=========================================================");
		System.out.println(s.toLowerCase());
		System.out.println(k.toUpperCase());
		System.out.println("==========================================================");
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println("===========================================================");
		System.out.println(s.length());
		System.out.println("==============================================================");
		System.out.println(s.charAt(1));
		System.out.println(k.charAt(1));
		System.out.println("=============================================================");
		System.out.println(k.equalsIgnoreCase(k));
		System.out.println(k.equals(s));
		System.out.println(k.compareTo(s));
		System.out.println("================================");
		System.out.println(k.indexOf("praveen"));
		System.out.println(s.lastIndexOf("PRAVEEN"));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();


	}

}
