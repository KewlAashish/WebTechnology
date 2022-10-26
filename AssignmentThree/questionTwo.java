/*
 	QUESTION TWO:
 	Write a program to implement counting sort (with input in the range 0 to 20 and input
	can be repeated multiple times)
 	
 * */


public class questionTwo {
	
	void countingSort(int arr[])
	{
		int n = arr.length;
		int result [] = new int [n];
		
		int util[] = new int [256];
		
		for(int i = 0; i < 256; i++)
		{
			util[i] = 0;
		}
		
		for(int i = 0; i < n; i++)
		{
			util[arr[i]]++;
		}
		
		for(int i = 1; i <= 255; i++)
		{
			util[i] += util[i - 1];
		}
		
		for(int i = n - 1; i >= 0; i--)
		{
			result[util[arr[i]] - 1] = arr[i];
			--util[arr[i]];
		}
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = result[i];
		}
	}
	
	public static void main(String args[])
	{
		questionTwo ob = new questionTwo();
		int arr[] = { 7, 6, 6, 6, 8, 9, 0, 0, 3, 6 };

		ob.countingSort(arr);

		System.out.print("Sorted character array is ");
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i]);
		}
}
