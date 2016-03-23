package com.csrk.examples;
class String{
	public void strcompare(str1,str2)
	{
        if(str1.compareTo(str2))
        {
        	System.out.println("Two Strings are same.");
        }
        else
        {
        	System.out.println("The two Strings are different.");
        }
	}
	public void strcompignore(str1,str2)
	{
		if(str1.compareToIgnoreCase(str2))
		{
			System.out.println("Two strings content is same.");
		}
		else
		{
			System.out.println("Two strings content is different.");
		}
	}
	
}