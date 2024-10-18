package Array_Prac;



public class unionintersection {
	public void Union()
	{
		int a[] = {1, 3, 4, 5, 7};
		int b[] = {2, 3, 5, 6};
		System.out.println("**Union****");
		for(int i=0; i<a.length; i++)
		{
			int c= 0;
			
			for(int j=0; j<b.length; j++)
			{
				if(a[i] == b[j])
				{
					c++;
					break;
				}
					
			}
			if(c==0)
			{
				System.out.print(a[i] +" ");
			}
			
		}
		for(int j=0; j<b.length; j++)
		{
			System.out.print(b[j] +" ");
		}
	}
		
	public void InterS()
	{
		int a[] = {1, 3, 4, 5, 7};
		int b[] = {2, 3, 5, 6};
		System.out.println("**intersection****");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i] == b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
				
	}
		
public static void main(String[] args) {
	unionintersection obj = new unionintersection();
	obj.InterS();
	obj.Union();
}
}
