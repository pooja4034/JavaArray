class matrix01
{
	public static void main(String args[])
	{
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Orignal Array: ");
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");

			}
			System.out.println();
		}
		
		System.out.println("rotate a matrix by 90 degrees clockwise: ");

      		for(int i = 0;i<a.length;i++)
		{
			for(int j = a[i].length-1;j>=0;j--)
			{
				System.out.print(a[j][i]+" ");

			}
			System.out.println();
		}
		

	}
}