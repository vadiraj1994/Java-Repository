package javaprograms;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class CountElementsRepetationUsingMapForInteger
{
	public static void main(String[] args) {

		LinkedHashMap<Integer, Integer> l1=new LinkedHashMap<Integer, Integer>();

		int[] arr= {10,20,30,40,20};
		for (int i = 0; i < arr.length; i++) 
		{
			if(!l1.containsKey(arr[i]))
			{
				l1.put(arr[i],1);
			}
			else
			{
				int x=l1.get(arr[i]);
				x++;
				l1.put(arr[i], x);
			}
		}
		TreeSet l2=new TreeSet();
		for (Entry o2 : l1.entrySet())
		{
			l2.add(o2.getKey()+"\t"+o2.getValue());	
		}
		System.out.println(l2);

	}
}
