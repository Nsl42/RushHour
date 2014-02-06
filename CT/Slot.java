
public class Slot implements CONSTANTS{

	private int x; /* The X Coordinate */
	private int y; /* The Y Coordinate */
	
	/* CONSTRUCTOR */
	
	Slot(int xn, int yn)
	{
		this.setX(xn);
		this.setY(yn);
	}
	
	/* Accessors & Mutators */
	
	void setX(int xn)
	{
		this.x = xn;
	}
	
	int getX()
	{
		return this.x;
	}
	
	void setY(int yn)
	{
		this.y = yn;
	}
	
	int getY()
	{
		return this.y;
	}
	
	/** Useful Methods **/
	
	public Point toPoint()
	{
		Point pos = new Point();
		pos.setX(BORDER + (SQUARE * this.getX()));
		pos.setY(BORDER + (SQUARE * this.getY()));
		return pos;
	}

	
}