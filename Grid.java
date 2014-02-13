/**
 * A public Class generating and displaying the boardgame
 *
 * @author:Romain Bressan
 * @author: Anas Alaoui M'Darhri
 * @author: Jean-Baptiste Carlus
 * @author: Siham Ben Arbiya
 * 
 * @version:0.1
 */


public class Grid{
/**
 * The constructor of the Grid Class, the only Method of the class
 *
 */

	public Grid()
	{
		// Creates the border (Big grey square, canvas-sized)
		new Rectangle(Constants.SIZE, Constants.SIZE,0,0,"dark_grey").makeVisible();

		// Creates the playfield (Big withe square, canvas - Border sized)
		new Rectangle(Constants.SIZE-2*Constants.BORDER, Constants.SIZE-2*Constants.BORDER,Constants.BORDER,Constants.BORDER,"white").makeVisible();

		// Creates all the little squares (The Slots)
		for(int j = 0; j<6; j++)
		{
			for(int i = 0; i<6; i++)
			{
				new Rectangle(Constants.SQUARE-2*Constants.BORDER, Constants.SQUARE-2*Constants.BORDER, 
						i*Constants.SQUARE+2*Constants.BORDER, j*Constants.SQUARE+2*Constants.BORDER, "blue").makeVisible(); 
			}
		}

// Creates the hole in the border (A white band on the right)
		new Rectangle(Constants.BORDER, Constants.SQUARE, Constants.SIZE-Constants.BORDER, 2*Constants.SQUARE+Constants.BORDER, "white").makeVisible();

	}
}
