package Array_Prac;
import java.util.*;

public class game_using_random {
	
	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
			
			
			Random robj = new Random();
			
			int maxattempt = 5;
			int random = robj.nextInt(100);
			//int attempts = 0;
			boolean won = false;
			
			System.out.println();
			
			while(maxattempt != 0)
			{
				System.out.print("Enter your guess: ");
	            int guess = sc.nextInt();
				
				
				if(guess == random)
				{
					won = true;
					break;
				}
				else if(guess > random)
				{
					System.out.println("no Its too heigh....");
				}
				else
				{
					System.out.println("no Its too low....");
				}
				maxattempt--;
				System.out.println("You have only: "+maxattempt+" attempts");
			}
			if(won)
			{
				System.out.println("You Guessed no..");
			}
			else
			{
				System.out.println("Soory, you used all attempts..");
			}
			
			
	}

}
