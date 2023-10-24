package com.string;
import java.util.*;
public class MaxAndMiniOccurring1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String :");
		String chr=s.nextLine();
		HashMap<Character,Integer> h=new HashMap<>();
		char[] c= chr.toCharArray();
		for(char ch:c)
		{
			if(h.containsKey(ch))
			{
				h.put(ch, h.get(ch)+1);
			}
			else
			{
				h.put(ch, 1);
			}
		}
		int maxCount=0;
		char maxChar=' ';
		for(Map.Entry<Character, Integer> me:h.entrySet())
		{
			if(maxCount<me.getValue())
			{
				maxCount=me.getValue();
				maxChar=me.getKey();
			}
		}
		System.out.println("Maximum repeated characer is "+maxChar);
		s.close();

	}

}
