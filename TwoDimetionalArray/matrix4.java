class matrix4
{
	public static void main(String args[])
	{
		int a[][] = {{13,30,54},{30,38,65},{54,65,90}};
		

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
				if(a[i][j] != a[j][i])
				{
					check = false;
					break;
				}
			}
			
		}

		if(check)
		{
			System.out.println("It is Symmentric identity matrix");
		}
		else
		{
			System.out.println("It is not Symmentric  matrix");
		}




	}
}
