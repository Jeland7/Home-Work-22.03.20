

public class Theatre1Switch {

	private String day;
	private int price1 = 20;
	private int price2 = 30;
	
	public Theatre1Switch() {
	}
	
	public void setDay(String name) {
		day = name;
		}
	
	public int getPrice1() {
		return price1;
	}
	
	public int getPrice2() {
		return price2;
	}
	

	//processing
	public void compute(String name) {
	switch (name.toLowerCase()) {
	case "monday": 
	case "tuesday": 
	case "wednesday":
	case "thursday": 
		System.out.println("The price for ticket is " + price1 + " EUR"); break;
	case "friday": 
	case "saturday": 
	case "sunday": 
		System.out.println("The price for ticket is " + price2 + " EUR"); break;
		default: 
		System.out.println("Please enter a coorect day of the week");
	}
	}
	
}

