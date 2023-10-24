package com.string;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
//		System.out.println(sb);
		
		int n=10000000;
		long start=System.currentTimeMillis();
//		String s="";
//		for(int i=0;i<n;i++) {
//			s+=i;
//		}
		for(int i=0;i<n;i++) {
			sb.append(i);
		}
		long end = System.currentTimeMillis();
		long duration=end-start;
		System.out.println(duration);
		
//		// first index define
//		char ch=sb.charAt(0);
//		System.out.println(ch);
//		// Character change
//		sb.setCharAt(0, 'L');
//		System.out.println(sb);
//		//character add
//		sb.insert(2, 'y');
//		System.out.println(sb);
//		//character delete
//		sb.deleteCharAt(2);
//		System.out.println(sb);
//		//character last m add
//		sb.append('g');
//		System.out.println(sb);
//		//character length
//		System.out.println(sb.length());
//		Scanner s=new Scanner(System.in);
//		
//		System.out.println("Enter the string");
//		String s1=s.nextLine();
//		String s2=s.nextLine();
//		System.out.println(s1);
//		System.out.println(s2);
		
//		String s1=s.nextLine();
//		String s2=s.nextLine();
//		System.out.println(s1);
//		System.out.println(s1.length());
		
//		for(int i=0;i<s1.length();i++) {
//			char ch=s1.charAt(i);
//			System.out.println(ch);
//		}
		
		//substring print 
		
//		System.out.println(s1.substring(0,1));
		
		//all substring print
		
//		for(int i=0;i<s1.length();i++) {
//			for(int j=i+1;j<=s1.length();j++) {
//				System.out.print(" "+s1.substring(i,j));
//			}
//			System.out.println();
//		}
		
		//String Add and concat and join method
		
//		System.out.println(s1.concat(s2));
//		System.out.println(String.join(" ", s1,s2,s1));
		
		// last index
		
//		System.out.println(s1.lastIndexOf('n'));
//		System.out.println(s1.charAt(6));
		
//		String s4=s1+" "+s2;
//		System.out.println(s4);
		
		//String print in next line
//		String[] parts=s1.split(",");
//		for(int i=0;i<parts.length;i++) {
//			System.out.println(parts[i]);
//		}
		
		
		
	}

}
