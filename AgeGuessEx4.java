//Modifies AgeGuess to incorporate an conditional 


import java.util.Random;
import java.util.Scanner;

public class AgeGuessEx4 {

			
		public static void main(String[] args) {
			
			String name;
			int age, ageGuess;
			Random generator = new Random();
		
			age = generator.nextInt(101);
			Scanner scan = new Scanner (System.in);
			
			System.out.print("Enter an age guess for a random person: ");
			ageGuess = scan.nextInt();
			
			if (ageGuess < age)
				System.out.println("You guessed wrong! \nYour guess is younger than the person's actual age.");
			
			if (ageGuess > age)
				System.out.println("You guessed wrong! \nYour guess is older than the person's actual age.");
						
			if (ageGuess == age)
				System.out.println("You guessed correctly- bravo!");
				
				

	}

}
