package com.Milewise.Tests;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class ListEx {

	public static void main(String[] args) {
		// List -Interface-Insertion order preserverd and duplicates allowed
		//ArrayList-Retrival frequent operation
		//LinkedList-Insertion and deletion
		
		List<String> ArrayListobj = new ArrayList<String>();
		ArrayListobj.add("First");
		ArrayListobj.add("Second");
		ArrayListobj.add("Second");
		ArrayListobj.add("third");
		ArrayListobj.add("forth");
		 for(String Value:ArrayListobj)
		 {
			 System.out.println(Value);
		 }
		 ArrayListobj.remove(1);
		 System.out.println(ArrayListobj);
		 ArrayListobj.set(1, "2ND");//will replace the value 
		 System.out.println(ArrayListobj);
		 ArrayListobj.add(2, "3rd");//will add and shift
		 System.out.println(ArrayListobj);
		 System.out.println(ArrayListobj.contains("2ND"));
		 
		 List<String> linkedListObj = new LinkedList<String>();
		 linkedListObj.add("First");
		 linkedListObj.add("Second");
		 linkedListObj.add("Second");
			linkedListObj.add("third");
			linkedListObj.add("forth");
			 for(String Value:linkedListObj)
			 {
				 System.out.println(Value);
			 }
			 linkedListObj.remove(1);
			 System.out.println(linkedListObj);
			 linkedListObj.set(1, "2ND");//will replace the value 
			 System.out.println(linkedListObj);
			 linkedListObj.add(2, "3rd");//will add and shift
			 System.out.println(linkedListObj);
			 System.out.println(linkedListObj.contains("2ND"));

	}

}
