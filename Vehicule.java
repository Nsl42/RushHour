
import java.awt.Point;

public class Vehicule extends Rectangle
{
	private char nom;
	private int longueur;
	private String dir;

	public Vehicule (char nom, int longueur, String dir, Slot position, String col)
	{
		//if (Constants.HORIZONTAL.equals(dir))
			super(nom + "", Constants.SQUARE * longueur, Constants.SQUARE,
					position.toPoint().x, position.toPoint().y, col);
		//else
			//this(nom + "", Constants.SQUARE, Constants.SQUARE * longueur,
					//position.toPoint().x, position.toPoint().y, col);

		this.nom = nom;
		this.longueur = longueur;
		this.dir = dir;
		this.makeVisible();
	}


	public void deplacer (String direc, int distance)
	{
		switch(direc)
		{
			case Constants.LEFT:
				this.slowMoveHorizontal(0-(distance * Constants.SQUARE));
				break;
			case Constants.RIGHT:
				this.slowMoveHorizontal(distance * Constants.SQUARE);
				break;
			case Constants.UP:
				this.slowMoveVertical(distance * Constants.SQUARE);
				break;
			case Constants.DOWN:
				this.slowMoveVertical(0-(distance * Constants.SQUARE));
				break;
		}
	}

	public String getNom ()
	{
		return this.nom + "";
	}
}
