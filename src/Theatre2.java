/** 
More Problems on Selection Statements
Problem 2: 
The theatre has now decided to charge based both on the day of the week and on the age of the customer. The new table of prices is outlined below:
Day:				    Age			    Price:
Monday - Thursday   Under 5/Over 65		Free
                    5 – 15			    €15
                    15 - 65			    €20
Friday - Sunday		Under 5/Over 65		€5
                    5 – 15			    €20
                    15 - 65			    €30
Use instantiable classes in your application. Save the instantiable class as Theatre2.java
Theatre2 -- the instantiable class, uses 2 nested if else selection statements to determine the cost of a theatre ticket based on a given day and a customer's age
*/

public class Theatre2 {

	private String day; // declare instance variable to store the day
	private int price0 = 0; // declare instance variable to store the price of a ticket based on the given day
	private int price1 = 5;
	private int price2 = 15;
	private int price3 = 20;
	private int price4 = 30;
	private int age;
	
	public Theatre2() {
	
	}
	// declare a setter method for each of the instance variables that can be set/ assigned a value
	public void setDay(String day) {
		this.day = day;
		day = day.toLowerCase();
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// declare a getter method for each of the instance variables
	public int getPrice0(){
		return price0;
		}	
	public int getPrice1(){
		return price1;
		}
	public int getPrice2(){
		return price2;
		}
	public int getPrice3(){
		return price3;
		}
	public int getPrice4(){
		return price4;
		}
	
	// the method which does the actual processing: based on a given day determines the price of the ticket
		public void compute() {
	if ((day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday")) && (age < 5 || age >= 65)) {
		System.out.println("Price is " + price0);
	} else if ((day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday")) && (age == 5 || age < 15)) {
		System.out.println("Price is " + price2);
	} else if ((day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday")) && (age == 15 || age < 65)) {
		System.out.println("Price is " + price3);
	} else if (day.equalsIgnoreCase("friday") || day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday") && (age < 5 || age >= 65)) {
		System.out.println("Price is " + price1);
	} else if (day.equalsIgnoreCase("friday") || day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday") && (age == 5 || age < 65)) {
		System.out.println("Price is " + price3);
	} else if (day.equalsIgnoreCase("friday") || day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday") && (age == 15 || age < 65)) {
		System.out.println("Price is " + price4);
	} else {
		System.out.println("Please enter the correct day and age");
			
	}
		}
	
}
