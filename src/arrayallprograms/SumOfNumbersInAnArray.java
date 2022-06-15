package arrayallprograms;

public class SumOfNumbersInAnArray
{
	public static void main(String[] args) 
	{
		int[] arr= {10,30,50,70,90};
		int sum=0;
		for (int i = 0; i < arr.length; i++) 
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of Elements In An Array:"+" "+sum);
	}
}
