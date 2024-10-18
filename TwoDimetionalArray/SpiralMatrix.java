/*
1  2  3  4
5  6  7  8
9 10 11  12 
13 14 15 16

00 01 02 03
10 11 12 13
20 21 22 23
30 31 32 33

left =0 right= a.length-1;
to =0 bottom = a.length-1;
1 2 3 4 12 16 15 14 13 9 5 6 7 11 10
*/

class SpiralMatrix
{
	public static void main(String args[])
	{

		int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int left = 0,top =0;
		int right = a.length-1,bottom = a.length-1;

		for(int i = 0;i <a.length;i++)
		{
			for(int j= 0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		while(left <= right && top <= bottom)
		{
			for(int i = left;i <= right;i++)
			{
				System.out.print(a[top][i]+" ");
			}
			top++;

			for(int i= top;i <=bottom;i++)
			{
				System.out.print(a[i][right]+" ");
			}
			right--;

			if(top <= bottom)
			{
				for(int i = right;i >=left;i--)
				{
					System.out.print(a[bottom][i]+" ");
				}
				bottom--;
			}
			if(left <= right)
			{
				for(int i = bottom;i >= top;i--)
				{
					System.out.print(a[i][left]+" ");
				}
				left++;
			}
		}
	}
}