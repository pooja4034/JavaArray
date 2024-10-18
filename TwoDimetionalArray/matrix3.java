class matrix3
{
	public static void main(String args[])
	{
		int a[][] = {{13,30,54,12},{15,38,65,43},{67,43,90,75}};
		int b[][] = new int[a[0].length][a.length];

		System.out.println("Orignal Array: ");
		for(int i = 0;i < a.length;i++)
		{
			for(int j =0;j < a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
				
		for(int i = 0;i < a.length;i++)
		{
			for(int j =0;j < a[i].length;j++)
			{
				b[j][i] = a[i][j];
			}
			
		}

		System.out.println("Transpose Matrix: ");
		for(int i = 0;i < b.length;i++)
		{
			for(int j =0;j < b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}



	}
}