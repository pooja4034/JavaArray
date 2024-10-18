class matrix6
{
	public static void main(String args[])
	{
		int a[][] = {{13,0,0},{0,38,0},{0,0,90}};
		

		System.out.println("Orignal Array: ");
		for(int i = 0;i < a.length;i++)
		{
			for(int j =0;j < a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int diagonalSum = 0;		
		for(int i = 0;i < a.length;i++)
		{
			for(int j =0;j < a[i].length;j++)
			{
				if(i == j)
				{
					diagonalSum += a[i][j];
				}
			}
			
		}

		System.out.println("The sum of the  diagonal elements is: " + diagonalSum);



	}
}
