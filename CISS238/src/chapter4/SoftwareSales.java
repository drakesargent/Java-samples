package chapter4;

/*Kenneth Drake-Sargent
 *Chapter 4
 *Programming Challenge 4
 *Software Sales
 */

public class SoftwareSales {

	//known permanent value
	final double RETAIL_PRICE=99.00;
	
	//user input value
	int unitsSold;
	
	//calculated values
	double discount;
	double totalCost;
	double basePrice;
	
	/*SoftwareSales constructor
	 * initializes with units sold value
	 * calls a method to calculate and set the basePrice
	 * calls a method to calculate discount and total price based on units 
	 */
	public SoftwareSales(int qty){
		unitsSold = qty;
		basePrice(RETAIL_PRICE, unitsSold);
		salesTotal();
		}
	
	//mutator methods to set discount and totalCost
	private void setDiscount(double initDiscount){
		discount = initDiscount;
	}
	
	private void setTotalCost(double initTotalCost){
		totalCost = initTotalCost;
	}
	
	//accessor methods to retrieve object values
	public int getUnitsSold(){
		return unitsSold;
	}
	
	public double getDiscount(){
		return discount;
	}
	
	public double getCost(){
		return totalCost;
	}
	
	//method to calculate and set base price without discount ran at object creation
	private void basePrice(double rPrice, int uSold){
		basePrice = rPrice * uSold;
	}
	
	//if-else-if statement to determine discount price and total cost given unitsSold
	//"this" keyword used to access and use values within the created object
	public void salesTotal(){
		if (unitsSold<10){
			setTotalCost(basePrice);
			setDiscount(basePrice - this.getCost());
		}
		else if (unitsSold<20){
			setTotalCost((RETAIL_PRICE*.8)*unitsSold);
			setDiscount(basePrice - this.getCost());
			
		}
		else if (unitsSold<50){
			setTotalCost((RETAIL_PRICE*.7)*unitsSold);
			setDiscount(basePrice - this.getCost());
		}
		else if (unitsSold<100){
			setTotalCost((RETAIL_PRICE*.6)*unitsSold);
			setDiscount(basePrice - this.getCost());
		}
		else {
			setTotalCost((RETAIL_PRICE*.5)*unitsSold);
			setDiscount(basePrice - this.getCost());
		}
	}

}
