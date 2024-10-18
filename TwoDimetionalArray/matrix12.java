import java.util.Scanner;
class matrix12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size: ");
		int row = sc.nextInt();

		System.out.println("Enter the col size: ");
		int col = sc.nextInt();

		int a[][] = new int[row][col];
		System.out.println("Enter the element for array: ");
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
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