package chapter4;

/*Kenneth Drake-Sargent
 *Chapter 5
 *Programming Challenge 5
 *Hotel Occupancy
 */

import java.util.Scanner;

public class HotelOccupancy {

	public static void main(String[] args) {

		//declare variables
		int floors, rooms, totalRooms = 0, totalOccupied=0;
		double occupancyRate = 0;
		boolean vNumFloors = true, vNumRooms = true;
		
		//create user input object
		Scanner keyboard = new Scanner(System.in);
		
		//request user input for floors variable
		System.out.print("How many floors does the hotel have?");
		floors = keyboard.nextInt();
		
		//validate number of floors
		while (vNumFloors){
			if (floors < 1){
				System.out.print("Invalid. Enter 1 or more:");
				floors = keyboard.nextInt();
			}
			else
				vNumFloors = false;
		}
		
		//Loop to get total rooms and occupied rooms per floor
		for (int i = 1; i <= floors; i++){
			System.out.print("How many rooms does floor "+ i +" have?");
			rooms = keyboard.nextInt();
			
			//validate number of rooms
			while (vNumRooms){
				if (rooms < 10){
					System.out.print("Invalid. Enter 10 or more:");
					rooms = keyboard.nextInt();
				}
				else
					vNumRooms = false;
			}
			
			//reset room validation loop
			vNumRooms = true;
			
			//add given rooms to total rooms
			totalRooms += rooms;
			
			System.out.print("How many occupied rooms does floor "+ i +" have?");
			totalOccupied += keyboard.nextInt();
			
		}
		
		keyboard.close();
		
		//calculate occupancy rate
		occupancyRate = (double) totalOccupied/(double) totalRooms;
		
		//display results
		System.out.println("Number of rooms: " + totalRooms);
		System.out.println("Occupied rooms: " +totalOccupied);
		System.out.println("Vacant rooms: " + (totalRooms - totalOccupied));
		System.out.println("Occupancy rate: "+ occupancyRate);	
	}

}
