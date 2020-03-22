

import java.util.Scanner;

public class Theatre1SwitchApp {
	
	public static void main(String[] args) {
		
		String d; // declare a variable to store the day entered by the user
		
		Scanner input = new Scanner(System.in);
		
		Theatre1Switch t = new Theatre1Switch();
		
		System.out.println("Please enter the day of the week: ");
		d = input.nextLine();
		
		t.setDay(d);
		t.compute(d);
		
		int firstPrice = t.getPrice1();
		int secondPrice = t.getPrice2();
		
		
	
		
		
}//end main
	
}//end class
