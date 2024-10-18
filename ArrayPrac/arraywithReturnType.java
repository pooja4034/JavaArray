package Array_Prac;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Program to cyclically rotate an array by one
Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}
 by using retrun type and parameter
 */
public class arraywithReturnType {
	
	public int[] colockwise(int a[])
	{
		int temp = a[a.length-1];
		for(int i = a.length-1;i>0;i--)
		{
			a[i] = a[i-1];
		}
		a[0] = temp;
		
		return a;
	}

	public static void main(String[] args) {

		arraywithReturnType obj = new arraywithReturnType();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter the array elemnt: ");
		
		for(int i = 0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		int c[] = obj.colockwise(a);
		System.out.println(Arrays.toString(c));
		

	}

}
