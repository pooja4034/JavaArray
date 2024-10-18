import java.util.Scanner;
class Transpose2D
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size: ");
		int row = sc.nextInt();

		System.out.println("Enter the col size: ");
		int col = sc.nextInt();

		int a[][] = new int[row][col];
		int transpose[][] = new int[a.length][a.length];
		System.out.println("Enter the element for array: ");
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Array a: ");	
		
		for(int i = 0;i<a.length;i++)
		{
			int rowsum=0,colsum=0;
			for(int j = 0;j<a[i].length;j++)
			{
				transpose[i][j] = a[j][i];
				

			}

		}
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(transpose[i][j]+" ");
				

			}
			System.out.println();

		}

	}
}