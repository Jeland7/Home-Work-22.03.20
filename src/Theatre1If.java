
/** 
More Problems on Selection Statements
Problem 1: 
Your local theatre charges different prices during the week and during the weekends.  The prices are outlined in the table below:
Day:				Price:
Monday - Thursday		€20
Friday - Sunday			€30
You have been asked to develop an application that allows a user to enter the day of the week and then display the cost of a theatre ticket for that person based on the day of the week. 
Use instantiable classes in your application.  Save the instantiable class as Theatre1.java
Theatre1IfApp.java 
	-- prompts the user to input a day
	-- uses the instantiable class Theatre1If to determine the actual cost of a theatre ticket based on the given day
*/
public class Theatre1If {

	private String day; // declare instance variable to store the day
	private int price1 = 20; // declare instance variable to store the price of a ticket based on the given day
	private int price2 = 30;
	
	 // Constructor - initialize the day with the empty string;
	public Theatre1If () { 
	}
	
	// declare a setter method for each of the instance variables that can be set/ assigned a value
	public void setDay(String day) {
	this.day = day;
	day = day.toLowerCase();
	}
	
	// declare a getter method for each of the instance variables
	public int getPrice1(){
	return price1;
	}

	public int getPrice2(){
		return price2;
		}
	
	// the method which does the actual processing: based on a given day determines the price of the ticket
	public void compute() {
		if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday")) {
			System.out.println("The price is " + price1 + " EUR");
		}else if (day.equalsIgnoreCase("friday") || day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
			System.out.println("The price is " + price2 + " EUR");
		} else {
			System.out.println("Please enter the correct day of the week");
		}
		
		
	}
	
	
}//end of class

