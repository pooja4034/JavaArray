import java.util.Scanner;
class arrClockwiseRotation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of Array: ");
		int size = sc.nextInt();	
		System.out.println("Enetr the element of Array: ");
		int a[] = new int[size];

		for(int i = 0;i <a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Array before clockwise rotation: ");
		for(int i = 0;i <a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

		
		System.out.println("\nEnter how many times you want to rotate: ");
		int no = sc.nextInt();
		for(int k = 1;k <= no;k++)
		{
			int temp = a[a.length-1];
			for(int i = a.length-1;i > 0;i--)
			{
				a[i] = a[i-1];
			}
			a[0]=temp;
	        }
				
		for(int i = 0;i <a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

		
		
	}
}