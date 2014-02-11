import java.awt.Point;
public class Slot{ 

	private int x; /* The X Coordinate */
	private int y; /* The Y Coordinate */
	
	/* CONSTRUCTOR */
	
	Slot(int xn, int yn)
	{
		this.setX(xn);
		this.setY(yn);
	}
	
	/* Accessors & Mutators */
	
	public void setX(int xn)
	{
		this.x = xn;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public void setY(int yn)
	{
		this.y = yn;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	/** Useful Methods **/
	
	public Point toPoint()
	{
		Point pos = new Point();
		pos.x= Constants.BORDER + (Constants.SQUARE * this.getX());
		pos.y=(Constants.BORDER + (Constants.SQUARE * this.getY()));
		return pos;
	}

	
}
