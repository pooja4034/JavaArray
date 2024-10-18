package Array_Prac;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Wap to take a array of intergers from user 
 * and find all the prime numbers from that array, and 
 * insert it into another array and print it ... 
 * by using return type.
 */
public class ReturnArrayPrime {
	
	
	public int[] primeArray(int a[])
	{
		int primecnt = 0;
		for(int i = 0;i <a.length;i++)
		{
			int cnt= 0;
			for(int j = 1;j <=a[i];j++)
			{
				if(a[i] % j == 0)
				{
					cnt++;
				}
			}
			if(cnt == 2)
			{
				primecnt++;
			}
		}
		
		int c[] = new int[primecnt];
		
		int index = 0;
		
		for(int i = 0;i <a.length;i++)
		{
			int cnt= 0;
			for(int j = 1;j <=a[i];j++)
			{
				if(a[i] % j == 0)
				{
					cnt++;
				}
			}
			if(cnt == 2)
			{
				c[index] = a[i];
				index++;
			}
		}
		return c;
		
		
	}

	public static void main(String[] args) {

		ReturnArrayPrime obj = new ReturnArrayPrime();
		
		int a[]= {23,17,15,19,13,16};
		int prime[] = obj.primeArray(a);
		System.out.println(Arrays.toString(prime));

	}

}
