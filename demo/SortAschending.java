class SortAschending
{
	public static void main(String args[])
	{
		int a[] = {43,23,56,11,35};

		System.out.println("Array Before Sorting");
		for(int i = 0;i < a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i = 0;i < a.length;i++)
		{
			for(int j = i+1;j <a.length;j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("\nArray After Sorting");
		for(int i = 0;i < a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}