package arrayallprograms;

public class ArraysOfEqualLengthProgram 
{

	public static void main(String[] args) {
		int [] a= {2,3,4};
		int [] b= {5,6,7};

		for (int i=0; i<a.length; i++)
		{
			int sum = a[i] + b[i];
			System.out.println(sum);	
		}
	}

}
