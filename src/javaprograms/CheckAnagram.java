package javaprograms;

import java.util.Arrays;

public class CheckAnagram 
{
	private static Object r1;

	public static void main(String[] args)
	{
		String s1="fear";
		String s2="fare";

		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a,b);
		if(result==true)
		{
			System.out.println("String's Are Anagram...");
		}
		else
		{
			System.out.println("String's Are Not an Anagram...!!!!");

		}
	}
}
