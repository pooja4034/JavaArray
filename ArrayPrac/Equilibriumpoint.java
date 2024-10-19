package Array_Prac;

// Q3.Given an array A of n positive numbers. The task is to find the first Equilibrium Point in an array. 
//Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
//
//Note: Return the index of Equilibrium point. (1-based index)
//
//Example 1:
//
//Input: 
//n = 5 
//A[] = {1,3,5,2,2} 
//Output: 3 

  
public class Equilibriumpoint {
	
	public void Eelpointt()
	{
		int a[] = {1,3,5,2,2};
		for(int i=0; i<a.length; i++)
		{
			int leftsum = 0, rightsum = 0;
			for(int j=0; j<i; j++)
			{
				leftsum = leftsum + a[j];
			}
			for(int k=i+1; k<a.length; k++)
			{
				rightsum = rightsum + a[k];
			}
			if(leftsum == rightsum)
			{
				System.out.print("Equilibrium point :" +(i+1));
			}
		}
	}
	public static void main(String[] args)
	{
	Equilibriumpoint obj = new Equilibriumpoint();
	obj.Eelpointt();
	}
}
