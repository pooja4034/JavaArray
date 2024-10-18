import java.util.Scanner;
class arrPrintnameWithIndex
{
   public static void main(String args[])
   {
	Scanner sc = new Scanner(System.in);
	String a[] = new String[5];

	System.out.println("Enter the Fruit name: ");
	for(int i = 0; i < a.length;i++)
	{
		a[i] = sc.next();
	}
	for(int i = 0;i < a.length;i++)
	{
		System.out.println(i+" "+a[i]);

	}
	
   }
}