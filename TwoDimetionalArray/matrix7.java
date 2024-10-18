class matrix7
{
	public static void main(String args[])
	{
		int a[][] = {{1,7,7},{4,7,2},{1,3,6}};
		

		System.out.println("Orignal Array: ");
		for(int i = 0;i < a.length;i++)
		{
			for(int j =0;j < a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int diagonalPro = 1;		
		for(int i = 0;i < a.length;i++)
		{
			for(int j =0;j < a[i].length;j++)
			{
				if(i == j)
				{
					diagonalPro *= a[i][j];
				}
			}
			
		}

		System.out.println("The Product of the  diagonal elements is: " + diagonalPro);



	}
}
