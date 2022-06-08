package toriCarDealership;

/*
 * This class is used to represent a Car object, which have the attributes color, model, and package.
 */
public class Car {

	//instance vars
	private String color;
	private String model;
	private String pckg;
	
	//getters
	public String getColor() { return color; }
	public String getModel() { return model; }
	public String getPackage() { return pckg; }
	
	//constructor
	public Car(String c, String m, String p) {
		color = c;
		model = m;
		pckg = p;
	}
	
	
	//converts to string
	@Override
	public String toString() {
		return color + " " + model + " (package: " + pckg + ")";
	}
	
	
}


//colors = {"red", "black", "white", "silver", "navy", "pink"}
//models = {"2022 Honda CR-V", "2022 Honda Pilot", "2022 Honda Passport", "2022 Honda Accord", "2022 Honda Civic", "2022 Tesla Model S", "2022 Tesla Model Y", "2022 Tesla Model X"}
//pckgs = {"Standard", "Deluxe", "Premium"}