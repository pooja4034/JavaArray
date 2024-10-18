class ArrayDuplicateEleFrequency
{
	public static void main(String args[])
	{
		int a[] = {23,67,45,89,34,56,56};
		System.out.println("Array: ");

		for(int i = 0;i <a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		int cnt = 0;
		int lock = -1;
		System.out.println("\nFrequency of duplicate element: ");
		for(int i = 0;i < a.length;i++)
		{
			cnt = 1;
			for(int j = i+1;j <a.length;j++)
			{
				if(a[i] == a[j])
				{
					cnt++;
					a[j] = lock;
				}
			}
			if(a[i] != lock && cnt > 1)
			{
				System.out.println("Duplicate count of: "+a[i]+": "+cnt);
			}
			
		}
	}
}