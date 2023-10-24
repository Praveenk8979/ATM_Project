package com.string;
import java.util.*;
public class PalindroneString {

	public static void main(String[] args) {
		Scanner string=new Scanner(System.in);
		System.out.println("Enter the String :");
		String name=string.nextLine();
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev))
		{
			System.out.println("Palindrone String");
		}
		else
		{
			System.out.println("Not a Palindrone String");
		}
	   string.close();

	}

}
