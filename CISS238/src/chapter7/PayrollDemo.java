package chapter7;
/*Kenneth Drake-Sargent
 *Chapter 7
 *Programming Challenge 2
 *Payroll
 */

import java.text.DecimalFormat;
import java.util.Scanner;


public class PayrollDemo {
	public static void main(String[] args) {
		//create local variable
		         // Hours worked
		int hoursWorked;
		         // Hourly pay rate
		double hourlyPayRate;

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		// Create a Payroll object.
		Payroll demo = new Payroll();

		// in a loop Get the hours and pay rate for each employee.
        for (int index = 0; index < demo.NUM_EMPLOYEES; index++){
        	System.out.print("Enter the hours worked by employee number " + demo.getEmployeeIdAt(index) + ": ");
        	hoursWorked = keyboard.nextInt();
        	//using a while loop validate the input
        	boolean hoursAreValid = false;
        	while(!hoursAreValid){
        		if (!hoursAreValid && hoursWorked <0){
        			System.out.print("ERROR: Enter 0 or greater for hours: ");
        			hoursWorked = keyboard.nextInt();
        		} else { 
        			hoursAreValid = true;
        		}
        	}
        	
        	System.out.print("Enter the hourly pay rate for employee number "+ demo.getEmployeeIdAt(index) + ": ");
        	hourlyPayRate = keyboard.nextDouble();
        	
        	boolean payRateIsValid = false;
        	
        	while(!payRateIsValid){
        		if (!payRateIsValid && hourlyPayRate <6.00){
        			System.out.print("ERROR: Enter 6.00 or greater for pay rate: ");
        			hourlyPayRate = keyboard.nextDouble();
        		} else { 
        			payRateIsValid = true;
        		}
        	}
        	
            //store valid data in the payroll class arrays
        	demo.setHoursAt(index, hoursWorked);
        	demo.setPayRateAt(index, hourlyPayRate);
        }
        keyboard.close();
		
        //process gross pay and store in wages
        for (int index = 0; index < demo.NUM_EMPLOYEES; index++){
        	demo.setWagesAt(index, demo.getGrossPay(index));
        }
        
        //format double output for dollars
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        
        //print Employee Data with pay
        System.out.println("\nPAYROLL DATA");
        System.out.println("============");
        //loop employee data output
        for (int index = 0; index < demo.NUM_EMPLOYEES; index++){
        	System.out.println("Employee ID: "+ demo.getEmployeeIdAt(index));
        	System.out.println("Gross pay: $"+ dollar.format(demo.getWagesAt(index))+"\n");
        }
        
	}
}
