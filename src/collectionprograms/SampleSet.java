package collectionprograms;

import java.util.LinkedHashSet;
import java.util.Set;
class Cookies
{
	public String name()
	{
		return "Qspiders";
	}

}

public class SampleSet {


	public static void main(String[] args) {

		Set<Cookies> set=new LinkedHashSet<Cookies>();
		set.add(new Cookies());
		set.add(new Cookies());
		set.add(new Cookies());
		set.add(new Cookies());

		for (Cookies c : set)
		{
			System.out.println(c.name());	
		}
	}
}
