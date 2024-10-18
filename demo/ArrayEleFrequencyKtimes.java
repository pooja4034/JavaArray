/*Q1.Given an array of N integers. Find the first element that occurs at least K number of times.
 
Example 1:
Input :
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
Output :
7
*/
class ArrayEleFrequencyKtimes
{
	public static void main(String args[])
	{
		int a[] = {1, 7, 4, 3, 4, 8, 7};
		System.out.println("Array: ");

		for(int i = 0;i <a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		int cnt = 0;
		int lock = -1;
		int k = 2;
		System.out.println("\nfirst element that occurs at least K number of times: ");
		for(int i = 0;i < a.length;i++)
		{
			cnt = 1;
			for(int j = i+1;j <a.length;j++)
			{
				if(a[i] == a[j])
				{
					cnt++;
					
				}
			}
			if(cnt == k)
			{
				System.out.println("Frist iteration of Equals to k times : "+a[i]+": "+cnt);
				break;

			}
							
		}
	}
}