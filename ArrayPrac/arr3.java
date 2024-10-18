package Array_Prac;

import java.util.Arrays;

/*
 * 8. Move All Zeroes to the End
- Input: [0, 1, 0, 3, 12]
- Output: [1, 3, 12, 0, 0]
 */
public class arr3 {
	
	public void moveAllZeros(int a[])
	{
		
		for(int i = 0;i < a.length;i++) 
		{
			if(a[i] == 0)
			{
				for(int j = i+1;j <a.length;j++)
				{
					if(a[j] != 0)
					{
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		System.out.print(Arrays.toString(a));
	}

	public static void main(String[] args) {
		
		int a[] = {0, 1, 0, 3, 12};
		arr3 obj = new arr3();
		obj.moveAllZeros(a);

	}

}
