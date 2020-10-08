package com.org.testing;

public class Demo {

	public static void main(String[] args) 
	{
		System.out.println("Ivalue----> " +  "   J Value--> " );
		
		for(int i=0; i<=5; i++)
		{
			
			
			System.out.println("I am in Outer loop. I value "+ i );
			
			for(int j=0; j<i; j++)
			{
				System.out.println("I am in inner loop. J value "+ j );
				System.out.println("-----> " + i +"   --> " + j);
			}
		}
	}
}