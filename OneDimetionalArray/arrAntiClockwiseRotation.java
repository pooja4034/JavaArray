import java.util.Scanner;
class arrAntiClockwiseRotation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter the element of array: ");
		for(int i = 0;i < a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("before Anticlockwie Rotation : ");
		for(int i = 0;i < a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nEnter how many times you want to rotate: ");
		int no = sc.nextInt();
		for(int k = 1;k <= no;k++)
		{

			int temp = a[0];
			for(int i = 0;i < a.length-1;i++)
			{
				a[i] = a[i+1];
			}
			a[a.length-1] = temp;
		}
		System.out.println("Array After clockwise rotation: ");
		for(int i = 0;i <a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
}