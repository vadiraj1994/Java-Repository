package javaprograms;

public class RecursiveCalling 
{
	public static void main(String[] args)
	{

		loop(1);

	}
	static  void loop(int no)
	{
		if(no<=10)
		{
		System.out.println(no);
		no++;
		loop(no);
		}

	}
}
