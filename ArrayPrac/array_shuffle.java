package Array_Prac;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
public class array_shuffle {

	public static void main(String[] args) {
		Random  robj = new Random();
		
		int a[]= {1,2,3,4,5,6,7};
		
		System.out.println("Array Before Shuffle: "+Arrays.toString(a));
		for(int i =0;i < a.length;i++)
		{
			int ind = robj.nextInt(a.length);
			
			int temp = a[i];
			a[i] = a[ind];
			a[ind] = temp;
		}
		
		System.out.println(Arrays.toString(a));
	}

}
