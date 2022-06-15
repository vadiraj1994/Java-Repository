package javaprograms;

import java.util.LinkedHashMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class CountOfStringElementsInAnArrayUsingMap 
{
	public static void main(String[] args) {

		LinkedHashMap<Character, Integer> l1=new LinkedHashMap<Character, Integer>();
		String str="hellojava";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(!l1.containsKey(ch[i]))
			{
				l1.put(ch[i], 1);
			}
			else
			{
				int x=l1.get(ch[i]);
				x++;
				l1.put(ch[i], x);
			}
		}
		TreeSet l2=new TreeSet();
		for (Entry o2 : l1.entrySet())
		{
			l2.add(o2.getKey()+" "+o2.getValue());	
		}
		System.out.println(l2);

	}
}
