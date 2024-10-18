package Array_Prac;
//3. Write a Java program to find the sum of the prime numbers between 30 and 50, but only consider
//the first three prime numbers in the range. Print the sum of those three prime numbers.
public class primeSerise2 {

	public static void main(String[] args) {
		
		primeSerise2 obj = new primeSerise2();
		int sum = obj.prime3();
		System.out.println("Sum of three Prime: "+sum);
	}
	int prime3()
	{
		int sum = 0;
		int n = 30;
		int primecnt = 0;
		while(n <= 50 && primecnt < 3)
		{
			int cnt = 0;
			int i = 1;
			while(i <= n)
			{
				if(n % i == 0)
				{
					cnt++;
				}
				i++;
			}
			if(cnt == 2)
			{
				sum = sum + n;
				System.out.println("Prime: "+n);
				primecnt++;
			}
			n++;
			
		}
		return sum;
	}

}
