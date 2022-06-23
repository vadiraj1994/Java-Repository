package javaprograms;

public class PrimeNumberEasyMethod
{
	public static void main(String[] args) {

		int num=7, count=0;
		for (int i = 2; i <num; i++) 
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("It is a Prime Number");
		}
		else
		{
			System.out.println("It is NOT a Prime Number");

		}
		
	}
}
