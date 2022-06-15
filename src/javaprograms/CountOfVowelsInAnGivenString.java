package javaprograms;

public class CountOfVowelsInAnGivenString 
{
	public static void main(String[] args)
	{
		String s1="vadi rajo vija yate";
		String s2=s1.replaceAll(" ", "");
		int count=0;
		for (int i = 0; i < s1.length(); i++) 
		{
			if((s1.charAt(i)=='a')||(s1.charAt(i)=='e')||(s1.charAt(i)=='i')||(s1.charAt(i)=='o')||(s1.charAt(i)=='u'))	
			{
				count++;
			}
		}
		System.out.println("Count of Vowels In An Given String:"+count);

	}
}
