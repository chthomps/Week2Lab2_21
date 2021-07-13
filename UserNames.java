

import java.util.Scanner;
import java.util.Random;


public class UserNames {

	public static void main(String[] args) {
		
		//defining variables
				String firstName, lastName;
				Random generator = new Random();
				int num;
				
				
				Scanner scan = new Scanner(System.in);
				
				//prompting user for first and last name
				System.out.println("Enter your first name: ");
				firstName = scan.nextLine();
				
				System.out.println("Enter your last name: ");
				lastName = scan.nextLine();
				
				
				//random number (10-99) generator
				num = generator.nextInt(90) +10;
				
				System.out.println(lastName.substring(0, 4)+ firstName.substring(0,1)+ num);
				
	}

}
