import java.util.Scanner;
class arrDeleteEle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter the element of array: ");
		for(int i = 0;i < a.legnth;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Before Deletion : ");
		for(int i = 0;i < a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nEnter Index you want to delete: ");
		int index = sc.nextInt();

		System.out.println(a[index]+"is deleted...");
		for(int i = index;i < a.length-1;i++)
		{
			a[i] = a[i+1];
		}
		System.out.println("After Deletion : ");
		for(int i = 0;i < a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
}