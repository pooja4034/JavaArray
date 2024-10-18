class Arrayprime
{
	public static void main(String args[])
	{
		int a[] = {16,17,4,3,5,2};
		System.out.println("Array: ");

		for(int i = 0;i <a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nPrime: ");
		int c = 0;
		for(int i = 0;i < a.length;i++)  // 13 15 16
		{
			c = 0;
			for(int j = 1;j <=a[i];j++) // 13/1 13/2 13/13 1 13
			{
				if(a[i] % j == 0)
				{
					c++;
				}
			}
			if(c == 2)
			System.out.print(a[i]+" ");				
		}
		
	}
}