class arr2D
{
	public static void main(String args[])
	{
		int a[][] = {{11,22,33},{44,55,66},{77,88,99}};
				
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}