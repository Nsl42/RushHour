
import java.awt.Point;

/** the vehicule Class, containing all the settings for the Vehicules
 * 
 * @author: Romain Bressan
 * @author: Anas Alaoui M'Darhri
 * @author: Jean-Baptiste Carlus
 * @author: Siham Ben Arbiya
 *
 * @version: 2014.02.14
 */
public class Vehicule extends Rectangle
{
	// The name of the vehicule, a single char (UpperCase)
	private char nom;
	// The length of the vehicule : SHORT for a car, LONG for a truck
	private int longueur;
	//The direction of the Vehicule
	private String dir;

	public Vehicule (char nom, int longueur, String dir, Slot position, String col)
	{
		// Creating the rectangle horizontally or vertically, depending on the dir string
		super(nom + "",
			       	(Constants.HORIZONTAL.equals(dir)) ? Constants.SQUARE * longueur : Constants.SQUARE,
			       	(Constants.VERTICAL.equals(dir)) ? Constants.SQUARE * longueur : Constants.SQUARE,
				position.toPoint().x, position.toPoint().y, col);

		this.nom = nom;
		this.longueur = longueur;
		this.dir = dir;
		this.makeVisible();

	}

	/** The move method, called by the Parking to move each car
	 *
	 * @param: String direc The direction of the movement
	 * @param: int distance The distance (in slots) of the movement
	 */
	public void move(String direc, int distance)
	{
		switch(direc)
		{
			case Constants.LEFT:
				this.slowMoveHorizontal(0-(distance * Constants.SQUARE));
				break;
			case Constants.RIGHT:
				this.slowMoveHorizontal(distance * Constants.SQUARE);
				break;
			case Constants.DOWN:
				this.slowMoveVertical(distance * Constants.SQUARE);
				break;
			case Constants.UP:
				this.slowMoveVertical(0-(distance * Constants.SQUARE));
				break;
		}
	}


	/** Accesor to get the Vehicule's name **/
	public String getNom ()
	{
		return this.nom + "";
	}
}
