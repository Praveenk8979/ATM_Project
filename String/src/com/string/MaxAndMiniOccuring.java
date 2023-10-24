package com.string;
// Find the maximum and minimum occurring character in string ;
import java.util.*;
public class MaxAndMiniOccuring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String :");
		String chr=s.nextLine();
		int[] arr=new int[256];
		for(int i=0; i<chr.length();i++)
		{
			arr[chr.charAt(i)]=arr[chr.charAt(i)]+1;
		}
		int max=-1;
		char c=' ';
		for(int i=0;i<chr.length();i++)
		{
			if(max<arr[chr.charAt(i)])
			{
				max=arr[chr.charAt(i)];
				c=chr.charAt(i);
			}
		}
		System.out.println("Maximum repeated character is "+c);
        s.close();
	}

}
