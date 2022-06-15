package arrayallprograms;

public class SumOfOddEvenElementsInAnArray 
{
	public static void main(String[] args) {

		int[] arr= {1,3,5,7,9,2,4,6,8};
		int even=0;
		int odd=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]%2==0)
			{
				even=even+arr[i];
			}
			else if(arr[i]%2==1)
			{
				odd=odd+arr[i];
			}
		}
		System.out.println("Sum Even  Elements In An Array:"+" "+even);
		System.out.println("Sum Odd   Elements In An Array:"+" "+odd);

	}
}
