package chapter7;
/*Kenneth Drake-Sargent
 *Chapter 7
 *Programming Challenge 2
 *Payroll
 */

public class Payroll {
	// Constant for the number of employees
	public final int NUM_EMPLOYEES = 7;

	// Array of employee ID numbers
	private int[] employeeId = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
	// Array to hold hours worked
	private int[] hours = new int[NUM_EMPLOYEES];

	// Array to hold pay rates
	private double[] payRate = new double[NUM_EMPLOYEES];

	// Array to hold wages earned
	private double[] wages = new double[NUM_EMPLOYEES];

	/**
	 * getGrossPay method Returns the gross pay for the employee whose data is
	 * stored at element i of each array.
	 */
	public double getGrossPay(int idAt){
		double grossPay = hours[idAt]*payRate[idAt];
		return grossPay;
	}


	
	/**
	 * setEmployeeIdAt method
	 */
	public void setEmployeeIdAt(int idAt, int newId){
		employeeId[idAt] = newId;
	}


	
	/**
	 * setHoursAt method
	 */
	public void setHoursAt(int idAt, int newHours){
		hours[idAt] = newHours;
	}


	
	/**
	 * setPayRateAt method
	 */
	public void setPayRateAt(int idAt, double newPayRate){
		payRate[idAt] = newPayRate;
	}

	
	
	/**
	 * setWagesAt method
	 */
	public void setWagesAt(int idAt, double newWages){
		wages[idAt] = newWages;
	}

	
	
	/**
	 * getEmployeeIdAt method
	 */
	public int getEmployeeIdAt(int idAt){
		return employeeId[idAt];
	}

	
	/**
	 * getHoursAt method
	 */
	public int getHoursAt(int idAt){
		return hours[idAt];
	}

	
	
	/**
	 * getPayRateAt method
	 */
	public double getPayRateAt(int idAt){
		return payRate[idAt];
	}


	
	/**
	 * getWagesAt method
	 */
	public double getWagesAt(int idAt){
		return wages[idAt];
	}
}
