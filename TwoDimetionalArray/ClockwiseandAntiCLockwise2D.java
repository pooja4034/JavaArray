import java.util.Scanner;
class ClockwiseandAntiCLockwise2D
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
		System.out.println("Orignal Array: ");	
		
		for(int i = 0;i<a.length;i++)
		{
			
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				

			}
			System.out.println();

		}
		System.out.println("Clockwise Array: ");
		for(int i = 0;i<a.length;i++)
		{
			
			for(int j = a.length-1;j>=0;j--)
			{
				System.out.print(a[j][i]+" ");
				

			}
			System.out.println();

		}
		
		System.out.println("AntiClockwise Array: ");
		for(int i = a.length-1;i>=0;i--)
		{
			
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[j][i]+" ");
				

			}
			System.out.println();

		}

	}
}