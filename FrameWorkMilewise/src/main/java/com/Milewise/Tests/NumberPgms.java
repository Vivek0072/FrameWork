package com.Milewise.Tests;

public class NumberPgms {
	
	public static void PrimeNumberMethod(int num) 
    {
	int count=0;
	for(int i=1;i<=num;i++) {
		if(num%i==0)
		{count++;
		}
	}
	if(count!=2)
	{
		System.out.println(num+" is Not Prime");
	}
	else
	{
		System.out.println(num +" is Prime");
	}
}
	
	public static void Fabnoci(int num)
	{
		
		int n1=0;
		int n2=1;
		int n3;
		
		System.out.println(n1);

		System.out.println(n2);
		
		for(int i=2;i<=num;++i)
		{
			n3=n1+n2;
			
			System.out.println(n3);
			n1=n2;
			n2=n3;					
		}
		
		
	}
	
	public static void main(String[] args) {
		
		PrimeNumberMethod(10);		
		Fabnoci(10);
		
		
	}

}
