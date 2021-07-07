package com.Milewise.Tests;

public class StringPrgms {

	public static void StringReverseMethod(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	
	
	
	public static void duplicateCharInStringMethod(String s)
	{
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			for(int j=i+1;j<=s.length()-1;j++)
			{
				if(s.charAt(i)==s.charAt(j) && s.charAt(i)!=' ')
				{
					count++;
					System.out.println("Duplicate Char is: "+ s.charAt(i));
				}
			}
		}
		if(count!=0) {
			System.out.println("Duplicate exist");
		}
		else
		{
			System.out.println("No Duplicates");
		}
	}
	
	public static void main(String[] args) {
		
		
		StringReverseMethod("vivek");
		duplicateCharInStringMethod("vivek is good");
		
		
	}

}
