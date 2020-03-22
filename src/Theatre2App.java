import java.util.Scanner;

/**Theatre2App.java 
	-- prompts the user to input a day and the age of the customer
	-- uses the instantiable class Theatre2 to determine the actual cost of a theatre ticket based on the given day and age

import java.util.Scanner;*/

public class Theatre2App {

	public static void main(String[] args) {
		
		String d;
		int years;
		
		Scanner input = new Scanner(System.in);
		Theatre2 myT= new Theatre2 ();
		
		System.out.println("Please enter the day of the week: ");
		d = input.next();
		
		System.out.println("Please enter your age: ");
		years = input.nextInt();
		
		myT.setDay(d);
		myT.setAge(years);
		
		myT.compute();
		
		int zeroPrice = myT.getPrice1();
		int firstPrice = myT.getPrice1();
		int secondPrice = myT.getPrice2();
		int thirdPrice = myT.getPrice3();
		int fourthPrice = myT.getPrice4();
	}
}
