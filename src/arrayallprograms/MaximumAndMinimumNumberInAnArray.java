package arrayallprograms;

public class MaximumAndMinimumNumberInAnArray 
{
	public static void main(String[] args) 
	{
		int[] arr= {10,30,50,70,90};
		int maximum=0;
		int minimum=10;
		for (int i =0; i < arr.length; i++)
		{
			if(arr[i]>maximum)
			{
				maximum=arr[i];
			}
			else if(arr[i]<=minimum)
			{
				minimum=arr[i];
			}
		}
	System.out.println("Maximum number in an Array:"+maximum);
	System.out.println("Minimum number in an Array:"+minimum);

	}
	

}
