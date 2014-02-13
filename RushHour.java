/** RushHour, the main class of the RushHour game
 *
 * @author: Romain Bressan
 * @author: Jean-Baptiste Carlus
 * @author: Siham Ben Arbiya
 * @author: Anas Alaoui M'Darhri
 *
 * @version: 2014.02.14
 */

public class RushHour{

	public static void main(String[] args)
	{
		// Creating & Instanciating the Parking
		Parking myPark = new Parking();
		
		// Adding all the Vehicules
		myPark.add(new Vehicule('X',Constants.SHORT, Constants.HORIZONTAL,new Slot(1,2), "red"));
		myPark.add(new Vehicule('A',Constants.SHORT, Constants.HORIZONTAL,new Slot(1,3), "green"));
		myPark.add(new Vehicule('B',Constants.SHORT, Constants.VERTICAL,new Slot(1,4), "orange"));
		myPark.add(new Vehicule('C',Constants.SHORT, Constants.HORIZONTAL,new Slot(2,5), "dark_blue"));
		myPark.add(new Vehicule('O',Constants.LONG, Constants.VERTICAL,new Slot(3,2), "yellow"));
		myPark.add(new Vehicule('P',Constants.LONG, Constants.VERTICAL,new Slot(5,3), "dark_purple"));

		// Performing the moves
		myPark.move("PU3");
		myPark.move("OU2");
		myPark.move("CR2");
		myPark.move("AR3");
		myPark.move("OD3");
		myPark.move("XR1");
		myPark.move("BU4");
		myPark.move("XL1");
		myPark.move("OU3");
		myPark.move("CL3");
		myPark.move("AL3");
		myPark.move("PD3");
		myPark.move("OD3");
		myPark.move("XR5");
	}

}
