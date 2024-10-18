package Array_Prac;

public class PrimeSerise {
		public static void main(String args[])
		{
			PrimeSerise obj = new PrimeSerise();
			int sum = obj.fristPrimeSum();
			System.out.println("Prime sum: "+sum);
			
		}
		int fristPrimeSum()
		{
			int n = 10;
			int sum = 0;
			int cntPrime = 0;
			while(n <= 20 && cntPrime < 2)
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
					System.out.println("Prime: "+n);
					sum = sum + n;
					cntPrime++;
				}
				n++;
			}
			return sum;

		}

}
