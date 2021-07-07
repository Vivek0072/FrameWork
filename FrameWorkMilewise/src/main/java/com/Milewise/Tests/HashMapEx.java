package com.Milewise.Tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
		//HashMap-NonSynchronized,NonThreadSafe,Duplicates not allowed,null allowed once for value null allowed many times
		//HashTree-Synchronized,ThreadSafe,duplicates allowed

		
		HashMap <Integer ,String> hmObj= new HashMap<Integer ,String>();
		hmObj.put(1, "vivek");
		hmObj.put(2, "vivek2");
		hmObj.put(null, null);
		hmObj.put(null, null);//only once null key allowed no restriction on value
		hmObj.put(2, "vivek2");//no duplicates
		
		
		 for(Map.Entry m : hmObj.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   } 
		
		
	}

}
