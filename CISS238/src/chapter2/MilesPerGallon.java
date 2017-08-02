package chapter2;
import java.util.Scanner;

/*Kenneth Drake-Sargent
 *Chapter 2
 *Programming Challenge 9
 *Miles-per-Gallon
 */

public class MilesPerGallon {

	public static void main(String[] args) {
		
		float milesDriven;
		float gallonsUsed;
		Scanner userInput = new Scanner(System.in);
		float MPG;

		System.out.print("Enter the number of miles driven:");
		milesDriven = userInput.nextFloat();
		System.out.print("Enter the number amount of gas used in gallons:");
		gallonsUsed = userInput.nextFloat();
		
		userInput.close();
		
		MPG = milesDriven/gallonsUsed;
		
		System.out.printf("Driving %.2f miles while using %.2f gallons of gas "+
		"means your car's fuel efficency for this trip is %.2f Miles per Gallon.", milesDriven, gallonsUsed, MPG);
	}

}
