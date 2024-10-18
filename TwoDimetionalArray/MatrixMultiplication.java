class MatrixMultiplication
{
	public static void main(String args[])
	{
		int a[][] = {{1,2,3},{1,2,3},{1,2,3}};
		int b[][] = {{1,2,3},{1,2,3},{1,2,3}};
		int c[][] = new int[a.length][a[0].length];

		System.out.println("Matrix A: ");
		for(int i = 0;i < a.length;i++)
		{
			for(int j = 0;j <a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("Matrix B: ");
		for(int i = 0;i < b.length;i++)
		{
			for(int j = 0;j <b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		for(int i = 0;i < a.length;i++)
		{
			for(int j = 0;j <a[i].length;j++)
			{
				for(int k = 0;k < a.length;k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}

		System.out.println("After multiplication of matrix: ");
		for(int i = 0;i < c.length;i++)
		{
			for(int j = 0;j <c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}