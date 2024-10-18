/*Q2.Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
*/
class ArraylederEle
{
	public static void main(String args[])
	{
		int a[] = {16,17,4,3,5,2};
		System.out.println("Array: ");

		for(int i = 0;i <a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		boolean b = true;
		System.out.println("\nLeader Element: ");
		for(int i = 0;i < a.length;i++)
		{
			b = true;
			for(int j = i+1;j <a.length;j++)
			{
				if(a[i] < a[j])
				{
					b = false;
					break;
				}
			}
			if(b== true)
			System.out.print(a[i]+" ");				
		}
		
	}
}