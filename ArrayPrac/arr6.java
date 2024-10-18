package Array_Prac;

import java.util.Arrays;

/*
 * 7. Find the Longest Increasing Subsequence
- Input: [10, 9, 2, 5, 3, 7, 101, 18]
- Output: [2, 3, 7, 101]
 */
public class arr6 {
	
	public void longestSubsequence(int a[])
	{
		
		for(int i = 0; i <a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int cnt = 0,max = 0;
		int target = 0,ind = 0;
		for(int i = 0;i <a.length;i++)
		{
			cnt = 1;
			target = a[i];
			//System.out.print(target+" ");
			for(int j = i+1;j <a.length;j++)
			{
				if(target < a[j])
				{
					//System.out.print(a[j]+" ");
					target = a[j];
					cnt++;
				}
			}
			if(cnt > max)
			{
				max = cnt;
				ind = i;
				
			}
			//System.out.println();
		}
		//System.out.println("max "+max);
		int b[] = new int[max];
		int k = 0;
		
		b[k++] = a[ind];
		
		target = a[ind];
			
			for(int j = ind;j <a.length;j++)
			{
				if(target < a[j])
				{
					
					target = a[j];	
					b[k++] = a[j];
				}
			}
			System.out.println(Arrays.toString(b));
			
		
	}

	public static void main(String[] args) 
	{
		int a[] = {10, 9, 2, 5, 3, 7, 101, 18};
		arr6 obj = new arr6();
		obj.longestSubsequence(a);
	}

}
