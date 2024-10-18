class matrix5
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
		Boolean check = true;		
		for(int i = 0;i < a.length;i++)
		{
			for(int j =0;j < a[i].length;j++)
			{
				if(i != j && a[i][j] != 0)
				{
					check = false;
					break;
				}
			}
			
		}

		if(check)
		{
			System.out.println("It is Diagonal  matrix");
		}
		else
		{
			System.out.println("It is not Digonal  matrix");
		}




	}
}
