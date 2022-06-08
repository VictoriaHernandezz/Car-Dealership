package toriCarDealership;

import java.util.ArrayList;
import java.util.List;

/*
 * The dealership class is an arraylist of Car objects, which can be sorted by each of the attributes.
 */
public class Dealership {

	//instance vars
	public static List<Car> dealership;
	
	//constructor
	public Dealership(ArrayList<String> colors, ArrayList<String> models, ArrayList<String> pckgs) {
		dealership = new ArrayList<Car>();
		for(String m: models) {
			for(String p: pckgs) {
				for(String c: colors) {
					dealership.add(new Car(c, m, p));
				}
			}
		}


	}
	
	@Override
	public String toString() {
		String ret = "";
		for(Car v: dealership) {
			ret += v.toString() + "\n";
		}
		return ret;
	}
	
	
}
