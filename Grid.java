public class Grid{

	public Grid()
	{
		new Rectangle(Constants.SIZE, Constants.SIZE,0,0,"dark_grey").makeVisible();
		new Rectangle(Constants.SIZE-2*Constants.BORDER, Constants.SIZE-2*Constants.BORDER,Constants.BORDER,Constants.BORDER,"white").makeVisible();
		for(int j = 0; j<6; j++)
		{
			for(int i = 0; i<6; i++)
			{
				new Rectangle(Constants.SQUARE-2*Constants.BORDER, Constants.SQUARE-2*Constants.BORDER, 
						i*Constants.SQUARE+2*Constants.BORDER, j*Constants.SQUARE+2*Constants.BORDER, "blue").makeVisible(); 
			}
		}
		new Rectangle(Constants.BORDER, Constants.SQUARE, Constants.SIZE-Constants.BORDER, 2*Constants.SQUARE+Constants.BORDER, "white").makeVisible();

	}
}
