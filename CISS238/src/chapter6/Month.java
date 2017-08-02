package chapter6;

/*Kenneth Drake-Sargent
 *Chapter 6
 *Programming Challenge 5
 *Month
 */

public class Month {
	//class field for month number
	private int monthNumber;
	
	//constructors for the Month class
	public Month(){
		monthNumber = 1;
	}
	
	public Month(int m){
		monthNumber = m;
		if (monthNumber < 1 || monthNumber >12) {
			monthNumber = 1;
		}
	}
	
	public Month(String m) {
		if (m.equalsIgnoreCase("january")){
			monthNumber = 1;
		} else if (m.equalsIgnoreCase("february")){
			monthNumber = 2;
		} else if (m.equalsIgnoreCase("march")){
			monthNumber = 3;
		} else if (m.equalsIgnoreCase("april")){
			monthNumber = 4;
		} else if (m.equalsIgnoreCase("may")){
			monthNumber = 5;
		} else if (m.equalsIgnoreCase("june")){
			monthNumber = 6;
		} else if (m.equalsIgnoreCase("july")){
			monthNumber = 7;
		} else if (m.equalsIgnoreCase("august")){
			monthNumber = 8;
		} else if (m.equalsIgnoreCase("september")){
			monthNumber = 9;
		} else if (m.equalsIgnoreCase("october")){
			monthNumber = 10;
		} else if (m.equalsIgnoreCase("november")){
			monthNumber = 11;
		} else if (m.equalsIgnoreCase("december")){
			monthNumber = 12;
		} else {
			monthNumber = 1;
		}
	}
	
	//mutator method
	public void setMonthNumber(int m){
		this.monthNumber = m;
		if (monthNumber < 1 || monthNumber >12) {
			monthNumber = 1;
		}
	}
	
	//accessor methods
	public int getMonthNumber(){
		return monthNumber;
	}
	
	public String getMonthName(){
		String name;
		switch (monthNumber){
		case 1:
			name = "January";
			break;
		case 2:
			name = "February";
			break;
		case 3:
			name = "March";
			break;
		case 4:
			name = "April";
			break;
		case 5:
			name = "May";
			break;
		case 6:
			name = "June";
			break;
		case 7:
			name = "July";
			break;
		case 8:
			name = "August";
			break;
		case 9:
			name = "September";
			break;
		case 10:
			name = "October";
			break;
		case 11:
			name = "November";
			break;
		case 12:
			name = "December";
			break;
		default:
			name = "Unknown";
		}
		return name;
	}
	
	//toString method
	public String toString(){
		return getMonthName();
	}
	
	//evaluation methods
	public boolean equals(Month month2) {
		boolean status;
		
		if (month2.getMonthNumber() == monthNumber){
			status = true;
		} else {
			status = false;
		}
		
		return status;
	}
	
	public boolean greaterThan(Month month2){
		boolean status;
		
		if (monthNumber > month2.getMonthNumber()){
			status = true;
		} else {
			status = false;
		}
		
		return status;
	}
	
	public boolean lessThan(Month month2){
		boolean status;
		
		if (monthNumber < month2.getMonthNumber()){
			status = true;
		} else {
			status = false;
		}
		
		return status;
	}
}
