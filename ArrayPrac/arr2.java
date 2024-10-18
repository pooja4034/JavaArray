package Array_Prac;
/*
 * 2. Find the Minimum Difference Between Any Two Elements
- Input: [3, 1, 4, 1, 5, 9]
- Output: 0 (Difference between two 1s)
 */
public class arr2 {
	
	public void DiffOfTwoEle(int a[])
	{
		for(int i = 0;i <a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
		int sub = 0;
		int min = 9;
		for(int i = 0;i <a.length;i++)
		{
			
			for(int j = i+1;j <a.length;j++)
			{
					sub = a[i] - a[j];

					
					if(sub < min && sub >= 0)
					{						
						min = sub;
					}				
			}
			
		}
		System.out.println("min Diffrance is "+min);
	}

	public static void main(String[] args) {
		
		int a[] = {3,1,4,1,5,9};
		
		arr2 obj = new arr2();
		obj.DiffOfTwoEle(a);
	}

}
