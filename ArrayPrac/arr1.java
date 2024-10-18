package Array_Prac;
/*
 * 1. Find the Maximum Product of Two Elements
- Input: [1, 4, 3, 7, 6]
- Output: 28 (Product of 4 and 7)
 */
public class arr1 {
	
	public int MaxProduct(int a[])
	{
		System.out.println("Array: ");
		int max = 0,secMax = 0;
		int pro = 0;
		for(int i = 0;i <a.length;i++) 
		{
				if(a[i] > max)
				{
					secMax = max;
					max = a[i];
				}
				else if(a[i] > secMax && a[i] != max)
				{
					secMax = a[i];
				}
				
				pro = max * secMax;
//				System.out.println("Max no 1 "+max);
//				System.out.println("Max no 2 "+secMax);
//				System.out.println("Product of two element: "+pro);
				
//				
		}
		System.out.println("Frist elemnet: "+max+" sec element: "+secMax);
		
		
		return pro;
	}

	public static void main(String[] args) {
		
		int a[] = {1,4,3,7,6};
		arr1 obj = new arr1();
		int product = obj.MaxProduct(a);
		System.out.println("Maximum product of two no: "+product);

	}

}
