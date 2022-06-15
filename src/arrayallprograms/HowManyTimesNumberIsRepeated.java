package arrayallprograms;

public class HowManyTimesNumberIsRepeated
{

	public static void main(String[] args) {

		int[] arr= {10,20,30,10,50,60,70};
		int find=10;
		int count=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==find)
			{
				count++;
			}

		}
		System.out.println("10 is Repeated for"+" "+count+" "+"times");

	}
}
