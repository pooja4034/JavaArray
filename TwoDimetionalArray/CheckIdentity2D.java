/*
Java Program to determine whether a given matrix is an identity matrix
*/
import java.util.Scanner;
class CheckIdentity2D
{
	public static void main(String args[])
	{
		int a[][] = {{0,1,0},{0,1,0},{0,1,0}};
		System.out.println("Orignal Array : ");
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				

			}
			System.out.println();

		}


		boolean check = false;		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				if(a[i]==a[j])
				{
					if(a[i][j] != 1)
					{
						check = true;
					}
					
				}
				else if(a[i][j] != 0)
				{
					check = true;
				}

				
			}
			
		}
		if(check)
		{
			System.out.println("It is not identity matrix");
		}
		else
		{
			System.out.println("It is identity matrix");
		}


		
	}
}