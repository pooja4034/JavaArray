class matrix1
{
	public static void main(String args[])
	{
		int a[][] = {{1,2,3,4,5},{6,7,8,9,10}};
		int b[][] = {{11,22,33,44,55},{66,77,88,99,100}};
		int c[][] = new int[a.length][a[0].length];

		System.out.println("Array a: ");
		for(int i = 0;i < a.length;i++)
		{
			for(int j =0;j < a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Array b: ");
		for(int i = 0;i < b.length;i++)
		{
			for(int j =0;j < b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

		
		for(int i = 0;i < a.length;i++)
		{
			for(int j =0;j < a[i].length;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
			}
			
		}

		System.out.println("Sum of two matrix a and b: ");
		for(int i = 0;i < c.length;i++)
		{
			for(int j =0;j < c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}



	}
}