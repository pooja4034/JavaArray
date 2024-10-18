import java.util.Scanner;
class arrInsertLast
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the size of array");

		int size = sc.nextInt();
		int a[] = new int[size+1];
		System.out.println("Given "+size+" Array size");
		System.out.println("Enetr element: ");

		for(int i = 0;i < size;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Before insertion of Frist element");
		for(int i = 0;i < size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter element you want to: ");

		int ele = sc.nextInt();
		a[a.length-1] = ele;
		System.out.println("After insertion of Frist element");
		for(int i = 0;i < a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}