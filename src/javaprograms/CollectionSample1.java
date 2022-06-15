package javaprograms;

import java.util.ArrayList;
import java.util.List;

public class CollectionSample1
{
	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<String>();
		list.add("John Snagman");
		list.add("John K fradgn, MD");
		list.add("John Kennedy, OD");
		list.add("John F Saleem");

		System.out.println( getLastNames(list));
	}
	public static List<String> getLastNames(List<String> list)
	{
		List<String> lastnames=new ArrayList<String>();
		for (int i = 0; i < list.size(); i++)
		{
			String fullName=list.get(i);

		//	System.out.println( fullName);
			
			String[] firstName1 = fullName.split(",");
		//	System.out.println( firstName1);
			String[] firstName2= firstName1[0].split(" ");
		//	System.out.println( firstName2);
			lastnames.add(firstName2[firstName2.length-1]);
		}
		return lastnames;
	}
}
