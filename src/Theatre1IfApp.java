

import java.util.Scanner;

/**Theatre1IfApp.java 
-- prompts the user to input a day
-- uses the instantiable class Theatre1If to determine the actual cost of a theatre ticket based on the given day */

public class Theatre1IfApp {
	
	public static void main(String[] args) {
	
		String d; // declare a variable to store the day entered by the user
		
		Scanner input = new Scanner(System.in);
		Theatre1If t = new Theatre1If(); //create an object of type Theatre1If
		
		System.out.println("Please enter the day of the week: ");
		d = input.nextLine();
		
		t.setDay(d);
		
		t.compute();
		
		int tFirstPrice = t.getPrice1();
		int tSecondPrice = t.getPrice2();
		
		
	
	}//end of main
}//end of class
