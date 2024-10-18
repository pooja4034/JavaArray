import java.util.Scanner;
class matrix11
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
		
		System.out.println("Enter the element to find its frequency: ");
        	int targetElement = sc.nextInt();

                int cnt = 0;	
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				if (a[i][j] == targetElement) 
				{
					cnt++;
				}

			}
		
		}
		System.out.println("The frequency of " + targetElement + " in the matrix is: " + cnt);

	}
}