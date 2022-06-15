package javaprograms;

public class FindNthFibonacciNumber 
{
	public static void main(String[] args) 
	{
		int no=10;
		int fib1=0;
		int fib2=1;
		int fib3=0;
		System.out.println(fib1+" "+fib2);
		if(no==1)
		{
			System.out.println(fib1);
		}
		else if(no==2)
		{
			System.out.println(fib2);
		}
		else
		{
			for (int i=3; i<=no; i++)
			{
				fib3=fib1+fib2;
				fib1=fib2;
				fib2=fib3;
	
			}
			System.out.println("10th fibonacci number is:"+fib3);

		}

	}
}
