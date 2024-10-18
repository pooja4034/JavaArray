import java.util.Scanner;
class Uppertraingulolr2D
{
	public static void main(String args[])
	{
		int a[][] = {{10,23,39,67},{67,11,90,45},{35,78,23,15},{78,69,53,21}};
		System.out.println("Orignal Array : ");
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				

			}
			System.out.println();

		}


		System.out.println("Upper Matrix : ");	
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				if(i > j)//it will strict upper matrix condition should be (i>=j)
				{
					//a[i][j]=0;
					System.out.print("0  ");

				}
				else
				{
					System.out.print(a[i][j]+" ");
				}
				
			}
			System.out.println();

		}
		/*for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				

			}
			System.out.println();

		}*/


	}
}