import java.util.Scanner;
class arrUserInputcolAndrowAddtion2D
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
		System.out.println("Array a: ");	
		
		for(int i = 0;i<a.length;i++)
		{
			int rowsum=0,colsum=0;
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				rowsum += a[i][j];
				colsum += a[j][i];

			}
			System.out.println("Row Sum: "+rowsum+"Column Sum: "+colsum);

		}
	}
}