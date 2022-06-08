package toriCarDealership;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * The Main class manages the JOptionPane display, as well as allows the user to interact with the dealership (list
 * of car objects) by sorting and searching based on certain attributes, and even add or remove cars from the list
 * by making a purchase.
 */
public class Main {	
	
	/*
	 * The main method creates Car objects and adds them to the dealership. The user can toggle through different
	 * ways to sort the list of all the cars and make decisions to select and purchase them using the JOptionPane
	 * options.
	 */
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Black");
		colors.add("White");
		colors.add("Silver");
		colors.add("Navy");
		colors.add("Pink");
		ArrayList<String> models = new ArrayList<String>();
		models.add("2022 Honda CR-V");
		models.add("2022 Honda Pilot");
		models.add("2022 Honda Passport");
		models.add("2022 Honda Accord");
		models.add("2022 Honda Civic");
		ArrayList<String> pckgs = new ArrayList<String>();
		pckgs.add("Standard");
		pckgs.add("Deluxe");
		pckgs.add("Premium");
		
		ArrayList<Car> crvs = new ArrayList<Car>();
		ArrayList<Car> pilots = new ArrayList<Car>();
		ArrayList<Car> passports = new ArrayList<Car>();
		ArrayList<Car> accords = new ArrayList<Car>();
		ArrayList<Car> civics = new ArrayList<Car>();
		for(String p: pckgs) {
			for(String c: colors) {
				crvs.add(new Car(c, "2022 Honda CR-V", p));
				pilots.add(new Car(c, "2022 Honda Pilot", p));
				passports.add(new Car(c, "2022 Honda Passport", p));
				accords.add(new Car(c, "2022 Honda Accord", p));
				civics.add(new Car(c, "2022 Honda Civic", p));
			}
		}

		ArrayList<Car> cart = new ArrayList<Car>();
		
		String title = "Tori's Car Dealership";
		boolean menu = true;
	    ImageIcon okIPullUp = new ImageIcon(Main.class.getResource("okipullup.png"));
		
		while(menu) {
			String[] options = {"Browse", "View Cart", "Add/Remove Availability", "Exit"};
			int choice = JOptionPane.showOptionDialog(null, "Welcome to Tori's Car Dealership!", title + ": Menu", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, options, null);
			
			//browse all cars
			if(choice == 0) {
				boolean browse = true;
				while(browse) {
					String[] browseOpt = {"CR-V", "Pilot", "Passport", "Accord", "Civic", "Back to Menu"};
					int contBrowse = JOptionPane.showOptionDialog(null, browseAll(crvs, pilots, passports, accords, civics), title + ": Browse", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, browseOpt, null);
						
					String[] browseByModelOpt = {"Choose to Add to Cart", "Back", "Back to Menu"};
						
						//browse cr-v
						if(contBrowse == 0) {
							boolean crv = true;
							while(crv) {
								int crvChoice = JOptionPane.showOptionDialog(null, browseByModel(crvs), title + ": Browse CR-Vs", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, browseByModelOpt, null);
								
								//showinputdialog to add to cart
								if(crvChoice == 0) {
									int purchase = Integer.parseInt((String) JOptionPane.showInputDialog(null, browseByModel(crvs) + "\nEnter the number of the CR-V from the list that you would like to add to cart.", title + ": Add CR-V to Cart", JOptionPane.QUESTION_MESSAGE, okIPullUp, null, null));
									cart.add(crvs.get(purchase-1));
									crvs.remove(crvs.get(purchase-1));
								}
								//back to browse all
								else if(crvChoice == 1) {
									crv = false;
								}
								//back to menu
								else if(crvChoice == 2) {
									crv = false;
									browse = false;
								}
							}
							
						}
						
						//browse pilot
						else if(contBrowse == 1) {
							boolean pilot = true;
							while(pilot) {
								int pilotChoice = JOptionPane.showOptionDialog(null, browseByModel(pilots), title + ": Browse Pilots", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, browseByModelOpt, null);
								
								//showinputdialog to add to cart
								if(pilotChoice == 0) {
									int purchase = Integer.parseInt((String) JOptionPane.showInputDialog(null, browseByModel(pilots) + "\nEnter the number of the Pilot from the list that you would like to add to cart.", title + ": Add Pilot to Cart", JOptionPane.QUESTION_MESSAGE, okIPullUp, null, null));
									cart.add(pilots.get(purchase-1));
									pilots.remove(pilots.get(purchase-1));
								}
								//back to browse all
								else if(pilotChoice == 1) {
									pilot = false;
								}
								//back to menu
								else if(pilotChoice == 2) {
									pilot = false;
									browse = false;
								}
							}
						}
						
						//browse passport
						else if(contBrowse == 2) {
							boolean passport = true;
							while(passport) {
								int passportChoice = JOptionPane.showOptionDialog(null, browseByModel(passports), title + ": Browse Passports", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, browseByModelOpt, null);
								
								//showinputdialog to add to cart
								if(passportChoice == 0) {
									int purchase = Integer.parseInt((String) JOptionPane.showInputDialog(null, browseByModel(passports) + "\nEnter the number of the Passport from the list that you would like to add to cart.", title + ": Add Passport to Cart", JOptionPane.QUESTION_MESSAGE, okIPullUp, null, null));
									cart.add(passports.get(purchase-1));
									passports.remove(passports.get(purchase-1));
								}
								//back to browse all
								else if(passportChoice == 1) {
									passport = false;
								}
								//back to menu
								else if(passportChoice == 2) {
									passport = false;
									browse = false;
								}
							}
						}
						
						//browse accord
						else if(contBrowse == 3) {
							boolean accord = true;
							while(accord) {
								int accordChoice = JOptionPane.showOptionDialog(null, browseByModel(accords), title + ": Browse Accords", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, browseByModelOpt, null);
								
								//showinputdialog to add to cart
								if(accordChoice == 0) {
									int purchase = Integer.parseInt((String) JOptionPane.showInputDialog(null, browseByModel(accords) + "\nEnter the number of the Accord from the list that you would like to add to cart.", title + ": Add Accord to Cart", JOptionPane.QUESTION_MESSAGE, okIPullUp, null, null));
									cart.add(accords.get(purchase-1));
									accords.remove(accords.get(purchase-1));
								}
								//back to browse all
								else if(accordChoice == 1) {
									accord = false;
								}
								//back to menu
								else if(accordChoice == 2) {
									accord = false;
									browse = false;
								}
							}
						}
						
						//browse civic
						else if(contBrowse == 4) {
							boolean civic = true;
							while(civic) {
								int civicChoice = JOptionPane.showOptionDialog(null, browseByModel(civics), title + ": Browse Civics", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, browseByModelOpt, null);
								
								//showinputdialog to add to cart
								if(civicChoice == 0) {
									int purchase = Integer.parseInt((String) JOptionPane.showInputDialog(null, browseByModel(civics) + "\nEnter the number of the Civic from the list that you would like to add to cart.", title + ": Add Civic to Cart", JOptionPane.QUESTION_MESSAGE, okIPullUp, null, null));
									cart.add(civics.get(purchase-1));
									civics.remove(civics.get(purchase-1));
								}
								//back to browse all
								else if(civicChoice == 1) {
									civic = false;
								}
								//back to menu
								else if(civicChoice == 2) {
									civic = false;
									browse = false;
								}
							}
						}
						//back to menu
						else if(contBrowse == 5) {
							browse = false;
						}
						
					}
					
			}
			
			//view cart
			else if(choice == 1) {
				boolean cartMenu = true;
				while(cartMenu) {
					String[] cartOpt = {"Checkout", "Back to Menu"};
					int contCart = JOptionPane.showOptionDialog(null, browseByModel(cart), title + ": Cart", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, cartOpt, null);
					
					//checkout
					if(contCart == 0) {
						boolean checkout = true;
						while(checkout) {
							String[] checkoutOpt = {"Confirm Purchase", "Remove from Cart", "Back"};
							int confCheckout = JOptionPane.showOptionDialog(null, browseByModel(cart), title + ": Checkout", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, checkoutOpt, null);
							if(confCheckout == 0) {
								for(Car v: cart) {
									cart.remove(v);
								}
								String[] purchOpt = {"Back to Menu"};
								int confPurch = JOptionPane.showOptionDialog(null, "Congratulations! Your purchase has been confirmed.", title + ": Purchase Confirmation", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, purchOpt, null);
								if(confPurch == 0) {
									checkout = false;
									cartMenu = false;
								}
							}
							else if(confCheckout == 1) {
								boolean remFromCart = true;
								while(remFromCart) {
									int remCart = Integer.parseInt((String) JOptionPane.showInputDialog(null, browseByModel(cart) + "\nEnter the number of the item that you would like to remove from cart.", title + ": Remove from Cart", JOptionPane.QUESTION_MESSAGE, okIPullUp, null, null));
									if(cart.get(remCart-1).getModel().equals("2022 Honda CR-V")) {
										crvs.add(cart.get(remCart-1));
									}
									else if(cart.get(remCart-1).getModel().equals("2022 Honda Pilot")) {
										pilots.add(cart.get(remCart-1));
									}
									else if(cart.get(remCart-1).getModel().equals("2022 Honda Passport")) {
										passports.add(cart.get(remCart-1));
									}
									else if(cart.get(remCart-1).getModel().equals("2022 Honda Accord")) {
										accords.add(cart.get(remCart-1));
									}
									else if(cart.get(remCart-1).getModel().equals("2022 Honda Civic")) {
										civics.add(cart.get(remCart-1));
									}
									cart.remove(cart.get(remCart-1));
									remFromCart = false;
								}
								
							}
							else if(confCheckout == 2) {
								checkout = false;
							}
						}
						
					}
					
					//back to menu
					else if(contCart == 1) {
						cartMenu = false;
					}
				}
				
			}
			
			//add/remove availability
			else if(choice == 2) {
				boolean addRem = true;
				while(addRem) {
					String[] addRemOpt = {"Add Availability", "Remove Availability", "Back to Menu"};
					int contAddRem = JOptionPane.showOptionDialog(null, "Choose to add or remove availabilty of cars in the dealership.", title + ": Add/Remove Availability", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, addRemOpt, null);
					if(contAddRem == 0) {
						//gives option to add a car
						String[] addColorOpt = {"Red", "Black", "white", "Silver", "Navy", "Pink"};
						String[] addModelOpt = {"2022 Honda CR-V", "2022 Honda Pilot", "2022 Honda Passport", "2022 Honda Accord", "2022 Honda Civic"};
						String[] addPckgOpt = {"Standard", "Deluxe", "Premium"};
						int addColor = JOptionPane.showOptionDialog(null, "Choose the color of a car to add.", title + ": Add Availability", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, addColorOpt, null);
						int addModel = JOptionPane.showOptionDialog(null, "Choose the model of a car to add.", title + ": Add Availability", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, addModelOpt, null);
						int addPckg = JOptionPane.showOptionDialog(null, "Choose the package of a car to add.", title + ": Add Availability", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, addPckgOpt, null);
					}
					else if(contAddRem == 1) {
						//gives options to remove by color, remove by pckg, or remove 1 specific car
						boolean rem = true;
						while(rem) {
							String[] remOpt = {"Remove by Color", "Remove by Package", "Remove One Car", "Back"};
							int remChoose = JOptionPane.showOptionDialog(null, "Choose how you would like to select cars to remove from the availability.", title + ": Remove Availability", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, remOpt, null);
							//remove by color
							if(remChoose == 0) {
								String[] remColOpt = {"Red", "Black", "White", "Silver", "Navy", "Pink"};
								int remColChoose = JOptionPane.showOptionDialog(null, "Remove all cars of the selected color from availability.", title + ": Remove by Color", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, remColOpt, null);
								if(remColChoose == 0) {
									for(Car v: crvs) {
										if(v.getColor().equals("Red")) {
											crvs.remove(v);
										}
									}
									for(Car v: pilots) {
										if(v.getColor().equals("Red")) {
											pilots.remove(v);
										}
									}
									for(Car v: passports) {
										if(v.getColor().equals("Red")) {
											passports.remove(v);
										}
									}
									for(Car v: accords) {
										if(v.getColor().equals("Red")) {
											accords.remove(v);
										}
									}
									for(Car v: civics) {
										if(v.getColor().equals("Red")) {
											civics.remove(v);
										}
									}
								}
								else if(remColChoose == 1) {
									for(Car v: crvs) {
										if(v.getColor().equals("Black")) {
											crvs.remove(v);
										}
									}
									for(Car v: pilots) {
										if(v.getColor().equals("Black")) {
											pilots.remove(v);
										}
									}
									for(Car v: passports) {
										if(v.getColor().equals("Black")) {
											passports.remove(v);
										}
									}
									for(Car v: accords) {
										if(v.getColor().equals("Black")) {
											accords.remove(v);
										}
									}
									for(Car v: civics) {
										if(v.getColor().equals("Black")) {
											civics.remove(v);
										}
									}
								}
								else if(remColChoose == 2) {
									for(Car v: crvs) {
										if(v.getColor().equals("White")) {
											crvs.remove(v);
										}
									}
									for(Car v: pilots) {
										if(v.getColor().equals("White")) {
											pilots.remove(v);
										}
									}
									for(Car v: passports) {
										if(v.getColor().equals("White")) {
											passports.remove(v);
										}
									}
									for(Car v: accords) {
										if(v.getColor().equals("White")) {
											accords.remove(v);
										}
									}
									for(Car v: civics) {
										if(v.getColor().equals("White")) {
											civics.remove(v);
										}
									}
								}
								else if(remColChoose == 3) {
									for(Car v: crvs) {
										if(v.getColor().equals("Silver")) {
											crvs.remove(v);
										}
									}
									for(Car v: pilots) {
										if(v.getColor().equals("Silver")) {
											pilots.remove(v);
										}
									}
									for(Car v: passports) {
										if(v.getColor().equals("Silver")) {
											passports.remove(v);
										}
									}
									for(Car v: accords) {
										if(v.getColor().equals("Silver")) {
											accords.remove(v);
										}
									}
									for(Car v: civics) {
										if(v.getColor().equals("Silver")) {
											civics.remove(v);
										}
									}
								}
								else if(remColChoose == 4) {
									for(Car v: crvs) {
										if(v.getColor().equals("Navy")) {
											crvs.remove(v);
										}
									}
									for(Car v: pilots) {
										if(v.getColor().equals("Navy")) {
											pilots.remove(v);
										}
									}
									for(Car v: passports) {
										if(v.getColor().equals("Navy")) {
											passports.remove(v);
										}
									}
									for(Car v: accords) {
										if(v.getColor().equals("Navy")) {
											accords.remove(v);
										}
									}
									for(Car v: civics) {
										if(v.getColor().equals("Navy")) {
											civics.remove(v);
										}
									}
								}
								else if(remColChoose == 5) {
									for(Car v: crvs) {
										if(v.getColor().equals("Pink")) {
											crvs.remove(v);
										}
									}
									for(Car v: pilots) {
										if(v.getColor().equals("Pink")) {
											pilots.remove(v);
										}
									}
									for(Car v: passports) {
										if(v.getColor().equals("Pink")) {
											passports.remove(v);
										}
									}
									for(Car v: accords) {
										if(v.getColor().equals("Pink")) {
											accords.remove(v);
										}
									}
									for(Car v: civics) {
										if(v.getColor().equals("Pink")) {
											civics.remove(v);
										}
									}
								}
								String[] remColOk = {"Back to Menu"};
								int remColConf = JOptionPane.showOptionDialog(null, "You have removed all " + remColOpt[remColChoose] + " cars from availability.", title + ": Remove by Color", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, remColOk, null);
								if(remColConf == 0) {
									rem = false;
									addRem = false;
								}
								

							}
							//remove by package
							else if(remChoose == 1) {
								String[] remPckgOpt = {"Standard", "Deluxe", "Premium"};
								int remPckgChoose = JOptionPane.showOptionDialog(null, "Remove all cars of the selected package from availability.", title + ": Remove by Package", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, remPckgOpt, null);
								if(remPckgChoose == 0) {
									for(Car v: crvs) {
										if(v.getPackage().equals("Standard")) {
											crvs.remove(v);
										}
									}
									for(Car v: pilots) {
										if(v.getPackage().equals("Standard")) {
											pilots.remove(v);
										}
									}
									for(Car v: passports) {
										if(v.getPackage().equals("Standard")) {
											passports.remove(v);
										}
									}
									for(Car v: accords) {
										if(v.getPackage().equals("Standard")) {
											accords.remove(v);
										}
									}
									for(Car v: civics) {
										if(v.getPackage().equals("Standard")) {
											civics.remove(v);
										}
									}
								}
								else if(remPckgChoose == 1) {
									for(Car v: crvs) {
										if(v.getPackage().equals("Deluxe")) {
											crvs.remove(v);
										}
									}
									for(Car v: pilots) {
										if(v.getPackage().equals("Deluxe")) {
											pilots.remove(v);
										}
									}
									for(Car v: passports) {
										if(v.getPackage().equals("Deluxe")) {
											passports.remove(v);
										}
									}
									for(Car v: accords) {
										if(v.getPackage().equals("Deluxe")) {
											accords.remove(v);
										}
									}
									for(Car v: civics) {
										if(v.getPackage().equals("Deluxe")) {
											civics.remove(v);
										}
									}
								}
								else if(remPckgChoose == 2) {
									for(Car v: crvs) {
										if(v.getPackage().equals("Premium")) {
											crvs.remove(v);
										}
									}
									for(Car v: pilots) {
										if(v.getPackage().equals("Premium")) {
											pilots.remove(v);
										}
									}
									for(Car v: passports) {
										if(v.getPackage().equals("Premium")) {
											passports.remove(v);
										}
									}
									for(Car v: accords) {
										if(v.getPackage().equals("Premium")) {
											accords.remove(v);
										}
									}
									for(Car v: civics) {
										if(v.getPackage().equals("Premium")) {
											civics.remove(v);
										}
									}
								}
								String[] remPckgOk = {"Back to Menu"};
								int remPckgConf = JOptionPane.showOptionDialog(null, "You have removed all " + remPckgOpt[remPckgChoose] + " cars from availability.", title + ": Remove by Package", 0, JOptionPane.INFORMATION_MESSAGE, okIPullUp, remPckgOk, null);
								if(remPckgConf == 0) {
									rem = false;
									addRem = false;
								}

							}
							//remove specific car
							else if(remChoose == 2) {
								
								
							}
							//back
							else if(remChoose == 3) {
								rem = false;
							}

						}
						
					}
					else if(contAddRem == 2) {
						addRem = false;
					}
				}
			}
			
			//exit and x button
			else if(choice == 3 || choice == -1) {
				menu = false;
			}
			
			
		}

	}
	
	/*
	 * This method creates a String of a list of cars when the user wants to sort and look through the cars
	 * of a specified model.
	 */
	static String browseByModel(ArrayList<Car> vehicle) {
		String ret = "";
		int numList = 1;
		for(Car v: vehicle) {
			ret += numList + ". " + v.toString() + "\n";
			numList++;
		}
		return ret;
	}
	
	/*
	 * This method creates a string to display when the user wants to see every car available in the dealership.
	 */
	public static String browseAll(ArrayList<Car> crvs, ArrayList<Car> pilots, ArrayList<Car> passports, ArrayList<Car> accords, ArrayList<Car> civics) {
		return "     Model                    # Available\n" + 
			   "2022 Honda CR-V               " + crvs.size() + "\n" +
			   "2022 Honda Pilot                " + pilots.size() + "\n" +
			   "2022 Honda Passport        " + passports.size() + "\n" +
			   "2022 Honda Accord           " + accords.size() + "\n" +
			   "2022 Honda Civic               " + civics.size() + "\n" +
			   "\n\n Browse by Model:";
	}
	
}
