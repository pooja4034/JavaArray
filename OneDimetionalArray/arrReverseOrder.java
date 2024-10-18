import java.util.Scanner;
class arrReverseOrder
{
   public static void main(String args[])
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The size of Array: ");
	int size = sc.nextInt();
	int a[] = new int[size];

	System.out.println("Enter the array element: ");
	for(int i = 0; i < a.length;i++)
	{
		a[i] = sc.nextInt();
	}
	System.out.println("Reverse Array: ");
	for(int i = a.length-1;i >= 0;i--)
	{
		System.out.print(a[i]+" ");

	}
   }
}