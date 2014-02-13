import java.util.ArrayList;

/**
 * Parking is the playfield class, containing the Vehicules and moving them
 *
 * @author: Romain Bressan
 * @author: Jean-Baptiste Carlus
 * @author: Siham Ben Arbiya
 * @author: Anas Alaoui M'Darhri
 *
 * @version: 2014.02.14
 */

public class Parking{

	// the Collection containing all the vehicules on the field
	private ArrayList<Vehicule> liste_vehicules;

	/**  Constructor of the Parking object, instanciating the Grid (making the display happen) and the vehicules ArrayList.
	*/
	public Parking(){ 
		Grid myGrid = new Grid();
		liste_vehicules = new ArrayList<Vehicule>();
	}

	/** Add in collection method 
	 * @param: Vehicule vehicule The Vehicule to add
	 */
	public void add(Vehicule mon_vehicule)
	{
		liste_vehicules.add(mon_vehicule);
	}

	/** Get from collection method
	 * @param: String name The name of the Vehicule
	 * @return: Vehicule vehicule The vehicule corresponding to the name
	 */
	private Vehicule get(String name)
	{
		for(Vehicule v : liste_vehicules)
			if(v.getNom().equals(name))
				return v;
		return null;
	}

	/** Move vehicule method
	 * @param: String order The moving order, i.e. "XU2" to make the X car go 2 slots up
	 * @throws: IllegalArgumentException if the order isn't fitting the spec.
	 */
	public void move(String order) throws IllegalArgumentException
	{
		if(order.length() != 3)
			throw new IllegalArgumentException();
		Vehicule v = get(order.charAt(0) + "");
		int dist = Integer.parseInt(order.charAt(2) + "");
		switch(order.charAt(1) + "")
		{
			case Constants.UP:
				v.move(Constants.UP, dist);
				break;
			case Constants.LEFT:
				v.move(Constants.LEFT, dist);
				break;
			case Constants.RIGHT:
				v.move(Constants.RIGHT, dist);
				break;
			case Constants.DOWN:
				v.move(Constants.DOWN, dist);
				break;
		}
	}
}

