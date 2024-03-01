import java.util.Random;
import java.util.Scanner;

public class CodeSoft_Projects {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner inputChar = new Scanner(System.in);
		
		
		Random rand = new Random();
		int machine = rand.nextInt(100) + 1; 
		
		int trying = 0;
		int score = 0;
		int count = 0;
		
		
		System.out.print("How many times do you want to play: ");
		trying = input.nextInt();
		
		if(trying <= 0)
		{
			System.out.print("\nEnter number more than 0: ");
			trying = input.nextInt();
		}
		
		System.out.print("Enter generated number: ");
		int number = input.nextInt();
		
		while(trying > 0)
		{
			
			if(number == machine)
			{
				score++;
				trying++;
				System.out.println("Congradulations you got it right: the number is: " + machine);
				System.out.println("\nYour Score: " + score + "\nYour tries: " + trying);
				
				System.out.print("\n\nEnter generated number: ");
				number = input.nextInt();
				
			}
			else
			{
				trying--;
				count = machine - number;
				
				if(count < 25)
				{
					System.out.println("\nSorry, the answer is: " + machine + " You are very low");
				}
				else if(count >= 25 || count < 50 )
				{
					System.out.println("\nSorry, the answer is: " + machine + " You are low");
				}
				else if(count == 50)
				{
					System.out.println("\nSorry, the answer is: " + machine + " You are avarage");
				}
				else if(count > 50 || count < 75)
				{
					System.out.println("\nSorry, the answer is: " + machine + " You are Hot");
				}
				else
				{
					System.out.println("\nSorry, the answer is: " + machine + " You are very Hot");
				}
				
				System.out.print("Your Score: " + score + "\nYour tries: " + trying);
				//System.out.print("\nEnter (X to quit or N to play): ");
	            //quit = inputChar.nextLine();
				
				if(trying  > 0)
				{
					System.out.print("\n\nTry again...Enter generated number: ");
					number = input.nextInt();
				}
				else
				{
					System.out.print("\nGame-Over");
				}
			}
			
			machine = rand.nextInt(100) + 1;
		}
		

	}

}
