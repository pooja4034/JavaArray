/*
Java Program to determine whether a given matrix is an Symentric matrix
*/
import java.util.Scanner;
class CheckSymmentric2D
{
	public static void main(String args[])
	{
		int a[][] = {{0,2,6},{2,6,5},{6,5,8}};
		System.out.println("Orignal Array : ");
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				

			}
			System.out.println();

		}


		boolean check = true;		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
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