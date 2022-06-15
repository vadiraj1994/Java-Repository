package arrayallprograms;

public class CountEvenOddNumbersInArray 
{
	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5};
		int even=0;
		int odd=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else if(arr[i]%2==1)
			{
				odd++;
			}
		}
		System.out.println("count of even numbers:"+even);
		System.out.println("count of even numbers:"+odd);

	}

}
