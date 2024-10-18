package Array_Prac;

import java.util.Arrays;

/*
 * 10. Merge Two Sorted Arrays
- Input: [1, 3, 5] and [2, 4, 6]
- Output: [1, 2, 3, 4, 5, 6]
 */
public class arr5 {
	
	public void mergeArray(int a[],int b[])
	{
		int c[] = new int[a.length+b.length];
		int ind = 0;
		for(int i = 0;i <a.length;i++)
		{
			c[ind++] = a[i];
			c[ind++] = b[i];
		}
		System.out.println(Arrays.toString(c));
	}

	public static void main(String[] args) {
		
		int a[] = {1,3,5};
		int b[] = {2,4,6};
		
		arr5 obj = new arr5();
		obj.mergeArray(a, b);

	}

}
