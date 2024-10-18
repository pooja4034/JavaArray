class matrix13
{
	public static void main(String args[])
	{
		int a[][] = {{43, 23, 56},{12, 5, 10},{7, 34, 2}};

		System.out.println("Array Before Sorting");
		for(int i = 0;i < a.length;i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i = 0;i < a.length;i++)
		{
			for(int j = 0;j <a[i].length;j++)
			{
				for(int k = j+1;k < a[i].length; k++)
				{

					if(a[i][j] > a[i][k])
					{
						int temp = a[i][j];
						a[i][j] = a[i][k];
						a[i][k] = temp;
					}
				}
			}
		}

		System.out.println("\nArray After Sorting");
		for(int i = 0;i < a.length;i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}