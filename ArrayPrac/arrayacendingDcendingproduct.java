package Array_Prac;

public class arrayacendingDcendingproduct {

	public static void main(String[] args) {
		
		
		int a[] = {3, 1, 1};
		int b[] = {6, 5, 4};
		
		System.out.println("Array a: ");

		for(int i = 0;i <a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nArray b: ");

		for(int i = 0;i <b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		for(int i = 0;i <a.length;i++)
		{
			for(int j = i+1;j <a.length;j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0;i <b.length;i++)
		{
			for(int j = i+1;j <a.length;j++)
			{
				if(b[i] < b[j])
				{
					int temp = b[i];
					b[i] = a[j];
					b[j] = temp;
				}
			}
		}
		int re = 0;
		for(int i = 0;i < a.length;i++)
		{
			re = re + a[i]*b[i];
		}
		System.out.println("Minimum : " + re);

	}

}
