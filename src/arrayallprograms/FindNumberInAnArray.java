package arrayallprograms;

public class FindNumberInAnArray 
{
	public static void main(String[] args) {

		int[] arr= {10,20,30,40,50,60,70};
		int find=10;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==find)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
