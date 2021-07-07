package com.Milewise.Tests;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		//Set-Interface-No duplicates no insertion order
		//as its interface we need a class to create object
		//HashSet-No insertion order
		//LinkedHashSet-insertion order preserved
		//TreeSet-preserved in Asending order
		
		
		Set <String> HashSetObj= new HashSet<String>();
		HashSetObj.add("Vivek");
		HashSetObj.add("Sumanth");
		HashSetObj.add("Mom");
		HashSetObj.add("dad");
		
		System.out.println(" HashSet printing ");
		for (String Value:HashSetObj)
		{
			System.out.println(Value);
		}
		
		HashSetObj.remove("Vivek");
		System.out.println(HashSetObj);
		HashSetObj.add("Vivek");
		System.out.println(HashSetObj);
		
		
		
		
		
		Set <String> LinkedHashSetObj = new LinkedHashSet<String>();
		
		LinkedHashSetObj.add("First");
		LinkedHashSetObj.add("Second");
		LinkedHashSetObj.add("third");
		LinkedHashSetObj.add("4th");
		System.out.println("LinkedHashSet printing-Insertion order is preservered ");
		System.out.println(LinkedHashSetObj);
		for (String Value:LinkedHashSetObj)
		{
			System.out.println(Value);
		}
		LinkedHashSetObj.remove("Second");
		System.out.println(LinkedHashSetObj);
		LinkedHashSetObj.add("2nd");
		for (String Value:LinkedHashSetObj)
		{
			System.out.println(Value);
		}
		
     Set <Integer> TreeSetObj = new TreeSet<Integer>();
     TreeSetObj.add(10);
     TreeSetObj.add(1);
     TreeSetObj.add(100);
     System.out.println("TreeSet printing- alws Ascending order ");
     for (int Value:TreeSetObj)
		{
			System.out.println(Value);
		}
      
     
     
	}

}
