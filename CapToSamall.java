package com.dhanraj;

public class CapTOSmall {

	public static void main(String[] args) {
		
		String s="Dhanraj";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			int  n= (int)ch[i];
			if(n>=65&&n<=90)
			{
				
				ch[i]=(char) (n+32);
				
			}
			
			if(n>=97&&n<=122)
			{
				
				ch[i]=(char) (n-32);
				
			}
			System.out.print(ch[i]);
		}

	}

}
