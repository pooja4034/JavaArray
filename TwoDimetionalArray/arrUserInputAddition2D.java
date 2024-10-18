import java.util.Scanner;
class arrUserInputAddition2D
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size: ");
		int row = sc.nextInt();

		System.out.println("Enter the col size: ");
		int col = sc.nextInt();

		int a[][] = new int[row][col];
		int b[][] = new int[row][col];
		int c[][] = new int[a.length][a[0].length];
		System.out.println("Enter the element for a array: ");
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.println("Enter "+i+""+j+" Element: ");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Enter the element for b array: ");
		for(int i = 0;i<b.length;i++)
		{
			for(int j = 0;j<b[i].length;j++)
			{
				System.out.println("Enter "+i+""+j+" Element: ");
				b[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Array a: ");
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Array b: ");
		for(int i = 0;i<b.length;i++)
		{
			for(int j = 0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" " );
			}
			System.out.println();
		}
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of Given Matrix: ");
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}
}