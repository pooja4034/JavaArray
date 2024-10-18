class Saddlepoint
{
	public static void main(String args[])
	{	
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};

		for(int i = 0;i <a.length;i++)
		{
			for(int j = 0;j <a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		for(int i = 0;i < a.length;i++)
		{
			int rowmin = Integer.MAX_VALUE;
			int col = -1;
			int maxcol = 0;

			for(int j = 0;j < a[i].length;j++)
			{
 				if(a[i][j] < rowmin)
				{
					rowmin = a[i][j];
					col = j;
				}
			}
		}
	}
}