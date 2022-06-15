package javaprograms;

public class PrimeNumberCheckingProgram
{
	public static void main(String[] args) {

		int no=7;
		boolean flag=true;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				
			}
		}
		if(flag==true)
		{
			System.out.println("It is a Prime Number");
		}
		else
		{
			System.out.println("It is not a Prime Number");

		}
	}
}
