package Array_Prac;

import java.util.Arrays;

public class arrayPrime {
	
	public void prime()
	{
		int PrimeCnt = 0;
		int a[] = {23,17,15,19,13,16};
		
		for(int i =0;i <a.length;i++)
		{
			int cnt = 0;
			for(int j = 1;j <=a[i];j++)
			{
				if(a[i] % j == 0)
				{
					cnt++;
				}
			}
			if(cnt == 2)
			{
				System.out.println(a[i]);
				PrimeCnt++;
			}
		}
		
		int primearr[] = new int[PrimeCnt];
		int ind = 0;
		for(int i =0;i <a.length;i++)
		{
			int cnt = 0;
			for(int j = 1;j <=a[i];j++)// 1/23 2/23 
			{
				if(a[i] % j == 0)
				{
					cnt++;
				}
			}
			if(cnt == 2)
			{
				primearr[ind] = a[i];
				ind++;
			}
		}
		System.out.println(Arrays.toString(primearr));
		
	}

	public static void main(String[] args) {
		
		arrayPrime obj = new arrayPrime();
		obj.prime();

	}

}
