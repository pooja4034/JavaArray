package Array_Prac;

import java.util.Arrays;

/*
 * 9. Find the Intersection of Two Arrays
- Input: [1, 2, 2, 1] and [2, 2]
- Output: [2, 2]
 */
public class arr4 {
	
	public void intersect(int a[],int b[])
	{
		for(int i = 0;i < a.length;i++)
		{
			for(int j = 0; j < b.length;j++)
			{
				if(a[i] == b[j])
				{
					System.out.print(a[i]+" ");
					break;
				}
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		
		int a[] = {1,2,2,1};
		int b[] = {2,2};
		
		arr4 obj = new arr4();
		obj.intersect(a, b);
		

	}

}
