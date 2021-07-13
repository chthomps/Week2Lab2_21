
//A program prompting a user to enter a number then displaying the word.
//incorporating a switch statement to do so

import java.util.Scanner;

public class NumDisplay {

	public static void main(String[] args) {
		
	//declaring variables
	int num;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter a number between 0-9: ");
	num = scan.nextInt();
	
	System.out.print("The number you entered is " );
	
	switch (num) 
	{
	case 0:
		System.out.println("zero.");
		break;
		
	case 1:
		System.out.println("one.");
		break;
		
	case 2:
		System.out.println("two.");
		break;
		
	case 3:
		System.out.println("three.");
		break;
		
	case 4:
		System.out.println("four.");
		break;
		
	case 5:
		System.out.println("five.");
		break;
		
	case 6:
		System.out.println("six.");
		break;
		
	case 7:
		System.out.println("seven.");
		break;
		
	case 8:
		System.out.println("eight.");
		break;
		
	case 9:
		System.out.println("nine.");
		break;
		
	default:
		System.out.println("not between 0-9 inclusive");
	
	}


	}

}
