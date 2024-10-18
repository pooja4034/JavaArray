package Array_Prac;

import java.util.Arrays;

public class arraymerge {

	public static void main(String[] args) {
	
		    	int a[] = {1, 5, 6, 7, 8, 10};
				int b[] = {2, 4, 9};
				int c[] = new int[a.length+b.length];
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
				int index = 0;
				for(int i = 0;i <a.length;i++)
				{
					c[index++]= a[i];
				}
				for(int i = 0;i <b.length;i++)
				{
					c[index++]= b[i];
				}
				
				for(int i = 0;i < c.length;i++)
				{
					for(int j = i+1;j <c.length;j++)
					{
						if(c[i] > c[j])
						{
							int temp = c[i];
							c[i] = c[j];
							c[j] = temp;
						}
					}
				}
			
				for(int i = 0;i < a.length;i++)
				{
						a[i] = c[i];
				}
				for(int i = 0;i < b.length;i++)
				{
						b[i] = c[a.length+i];
				}
				 System.out.println("A: " + Arrays.toString(a));
			        System.out.println("B: " + Arrays.toString(b));
		}
	}

	