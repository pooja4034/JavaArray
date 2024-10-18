import java.util.Scanner;
class PrimaryAndSecondary2D
{
	public static void main(String args[])
	{
		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
		System.out.println("Orignal Array : ");
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				

			}
			System.out.println();

		}


		System.out.println("Primary Array : ");	
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i][j]+" ");

				}
				
			}
			System.out.println();

		}
		System.out.println("Secondary Array : ");
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				if(i+j==a.length-1)
				{
					System.out.print(a[i][j]+" ");

				}
				

			}
			System.out.println();

		}

	}
}