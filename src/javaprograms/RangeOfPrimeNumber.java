package javaprograms;

public class RangeOfPrimeNumber
{
	public static void main(String[] args) {

		for(int no=1;no<=100;no++)
		{
			boolean flag=true;
			for(int i=2;i<no;i++)
			{
				if(no%i==0)
				{
					flag=false;
					break;

				}
			}

			if(flag==true)
			{
				System.out.println("No.of Prime Numbers are:"+no);
			}
		}
	}
}