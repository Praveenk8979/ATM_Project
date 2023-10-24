package com.string;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Praveen");
		sb.append(" Chauhan");
		System.out.println(sb);
		System.out.println("+=======================================+");
		System.out.println(sb.length());
		System.out.println("+=======================================+");

		System.out.println(sb.capacity());
		System.out.println("+=======================================+");

		System.out.println(sb.charAt(3));
		System.out.println("+=======================================+");

		System.out.println(sb.isEmpty());
		System.out.println("+=======================================+");

		System.out.println(sb.append(" Java Developer"));
		System.out.println("+=======================================+");

		//System.out.println(sb.delete(3, 5));
		System.out.println(sb.insert( 8,"Thakur "));
		System.out.println("+=======================================+");
        System.out.println(sb.reverse());
		System.out.println("+=======================================+");
        System.out.println(sb.lastIndexOf("P"));
		System.out.println("+=======================================+");

        System.out.println(sb.lastIndexOf("P",36));
		
	}

}
