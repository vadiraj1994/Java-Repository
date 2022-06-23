package javaprograms;

public class RangeOfPrimeNumberEasyMethod
{
	public static void main(String[] args) {

		for (int no = 1; no <=100; no++) //Range
		{
			int count=0;
			for (int i = 2; i <no; i++) 
			{
				if(no%i==0)
				{
					count++;
					break;
				}
			}

			if(count==0)
			{
				System.out.print(no +" ");
			}
		}
	}
}
