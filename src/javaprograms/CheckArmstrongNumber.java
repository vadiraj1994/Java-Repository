package javaprograms;

public class CheckArmstrongNumber
{
	public static void main(String[] args) {

		int no=153;
		int sum=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem*rem*rem;
			no=no%10;
		}
		if(sum==copy)
		{
			System.out.println("It is a Armstrong Number");
		}
		else
		{
			System.out.println("It is Not a Armstrong Number");
		}
	}
}
