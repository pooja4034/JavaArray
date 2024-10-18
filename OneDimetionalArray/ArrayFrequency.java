class ArrayFrequency
{
	public static void main(String args[])
	{
		int a[] = {43,23,56,11,35,43,43,35,11};
		int b[] = new int[a.length];

		System.out.println("Array : ");
		for(int i = 0;i < a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		int lock = -1;
		int cnt = 0;
		System.out.println("\nFrequency of Array element : ");

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
			if(a[i] != lock)
			{
				b[i] = cnt;
				//System.out.println(a[i]+ ": "+cnt);
			}
		}
		System.out.println("\nry element and its frequency");
		for(int i = 0;i < a.length;i++)
		{
			if(a[i] != lock)
			{
				System.out.println(a[i]+": "+b[i]);
			}
		}

	}
}