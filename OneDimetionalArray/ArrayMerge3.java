class ArrayMerge3
{
	public static void main(String args[])
	{
		int a[] = {10,20,30,40,50};
		int b[] = {1,2,3,4,5};
		int c[] = new int[a.length+b.length];

		System.out.println("Array a : ");
		for(int i = 0;i < a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("Array b : ");
		for(int i = 0;i < b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		int index = 0;
		int j = b.length-1;
		for(int i = 0;i < a.length;i++)
		{
			c[index++] = a[i];
			c[index++] = b[j];
			j--;
		}
		System.out.println("\nAfter array merge");
		for(int i = 0;i < c.length;i++)
		{
			System.out.print(c[i]+" ");
		}

	}
}