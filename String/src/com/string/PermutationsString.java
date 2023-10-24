 package com.string;
import java.util.*;
public class PermutationsString {
	private static void solution(String str) {
		 
	}
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.next();
		solution(str);
	}

	

}


