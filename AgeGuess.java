

//Modifies the Week1 AgeGuess program

import java.util.Scanner;
import java.util.Random;

public class AgeGuess {

	public static void main(String[] args) {
		
		String name;
		int age, ageGuess;
		Random generator = new Random();
	
		age = generator.nextInt(101);
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter an age guess for a random person: ");
		ageGuess = scan.nextInt();
		
		System.out.println("Your guess: " + ageGuess+", The actual age: " + age);
		

	}

}
