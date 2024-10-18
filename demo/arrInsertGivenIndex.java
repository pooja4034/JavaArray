import java.util.Scanner;
class arrInsertGivenIndex
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();

		int a[] = new int[size+1];
		System.out.println("Enter the Array Element");

		for(int i = 0;i < size;i++)
		{
			a[i] = sc.nextInt();

		}
		System.out.println("Before Inertion ");
		for(int i = 0; i < size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nEnetr elemnt you want to insert: ");

		int ele = sc.nextInt();

		System.out.print("\nEnter index to insert the element on that Index: ");
		int index = sc.nextInt();

		for(int i = a.length-1;i > index;i--)
		{
			a[i] = a[i-1];
		}
		a[index] = ele;

		for(int i = 0;i < a.length;i++)
		{
			System.out.print(a[i]+" ");

		}

	}			
}