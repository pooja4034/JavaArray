class ArrayMerge
{
	public static void main(String args[])
	{
		int a[] = {10,20,30,40,50};
		int b[] = {60,70,80,90,100};
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
		for(int i = 0;i < a.length;i++)
		{
			c[index++] = a[i];
		}
		for(int i = 0;i < b.length;i++)
		{
			c[index++] = b[i];

		}
		System.out.println("\nAfter array merge");
		for(int i = 0;i < c.length;i++)
		{
			System.out.print(c[i]+" ");
		}

	}
}