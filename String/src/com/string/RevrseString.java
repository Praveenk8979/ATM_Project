package com.string;
import java.util.*;
public class RevrseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String :");
		String name=s.nextLine();
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
        s.close();
	}

}
