package javaprograms;

public class SumOfEvenAndOddDigits
{
	public static void main(String[] args)
	{
		int no=1234;
		int even=0;
		int odd=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2==0)
			{
				even++;
			}
			else if(rem%2==1)
			{
				odd++;
			}
			no=no%10;
		}

		System.out.println("sum of even numbers:"+""+even);
		System.out.println("sum of even numbers:"+""+odd);


	}
}

