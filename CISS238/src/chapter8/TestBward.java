package chapter8;

import java.util.Scanner;

public class TestBward {

	public static void main(String[] args) {
		String userInput;
		String bwardInput = "";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter something: ");
		userInput = keyboard.nextLine();
		
		for (int index = (userInput.length()-1); index >= 0; index--){
			bwardInput += userInput.charAt(index);
		}
		
		System.out.print(bwardInput);
		
		keyboard.close();
	}

}
