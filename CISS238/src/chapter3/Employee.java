package chapter3;

/*Kenneth Drake-Sargent
 *Chapter 3
 *Programming Challenge 1
 *Employee Class
 */

public class Employee {
	
	//employee object fields 
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	//empty constructor left to fulfill assignment
	public Employee()
	{

	}
	
	//accessor methods to retrieve employee object values
	public String getName(){
		return name;
	}
	
	public int getIdNumber(){
		return idNumber;
	}
	
	public String getDepartment(){
		return department;
	}
	
	public String getPosition(){
		return position;
	}
	
	//mutator methods to set or modify employee object values
	public void setName(String newName){
		name = newName;
	}
	
	public void setIdNumber(int newId){
		idNumber = newId;
	}
	
	public void setDepartment(String newDepartment){
		department = newDepartment;
	}
	
	public void setPosition(String newPosition){
		position = newPosition;
	}

}
