package collectionprograms;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetProgram1
{
	public static void main(String[] args) {

		Set<String> cityNames= new LinkedHashSet<String>();
		cityNames.add("Bangalore");
		cityNames.add("Mysore");
		cityNames.add("Vijaypur");
		cityNames.add("Athani");
		cityNames.add("Yalagur");

		System.out.println(cityNames);
		Iterator<String> itr = cityNames.iterator();
		while(itr.hasNext())
		{
			System.err.println(itr.next());
		}
		System.out.println("========================================");
		for (String names : cityNames) 
		{
		System.out.println(names);	
		}

	}
}
