package com.string;

import java.util.*;

public class ToggleCase {
	public static String toggleCase(String st) {
		StringBuilder sb = new StringBuilder(st);
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				char uch = (char) ('A' + ch - 'a');
				sb.setCharAt(i, uch);
			} else if (ch >= 'A' && ch <= 'Z') {
				char lch = (char) ('a' + ch - 'A');
				sb.setCharAt(i, lch);
			}
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String st = sc.next();
		System.out.println(toggleCase(st));
	}

}
