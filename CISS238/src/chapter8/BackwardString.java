package chapter8;

/*Kenneth Drake-Sargent
 *Chapter 8
 *Programming Challenge 1
 *Backward String
 */

import java.util.Scanner;

public class BackwardString {

	public static void main(String[] args) {
		
		//Declare variables to capture input and transformation
		String userInput;
		String bwardInput = "";
		
		//Declare input object
		Scanner keyboard = new Scanner(System.in);
		
		//Request input from user
		System.out.print("Enter something: ");
		userInput = keyboard.nextLine();
		
		//Process and store transformed string
		for (int index = (userInput.length()-1); index >= 0; index--){
			bwardInput += userInput.charAt(index);
		}
		
		//Display transformed string
		System.out.print(bwardInput);
		
		//Close out input
		keyboard.close();
	}

}
