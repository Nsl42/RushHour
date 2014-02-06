import java.awt.*;

/**
 * A rectangle that can be manipulated and that draws itself on a canvas.
 * A rectangle has a text, size, position and color. Valid colors are:
 * red, black, blue, dark_blue, light_yellow, yellow, orange, pink,
 * light_green, green, dark_green, purple, dark_purple, magenta,
 * white, brown, dark_brown, grey, dark_grey
 * 
 * @author  Pascale Launay and Michael Kölling and David J. Barnes
 * @version 2014.01.31
 */

public class Rectangle
{
    private String text; // a text displayed in the middle of the rectangle
    private int width, height; // the rectangle's dimension
    private int xPosition, yPosition; // the rectangle's position
    private String color; // the rectangle's color
    private boolean isVisible; // true if the rectangle is visible

    /**
     * Create a new rectangle with given size, position and color.
     */
    public Rectangle(int width, int height, int xPosition, int yPosition, String color)
    {
        this.width = width;
        this.height = height;
        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        isVisible = false;
    }

    /**
     * Create a new rectangle with given text, size, position and color.
     */
    public Rectangle(String text, int width, int height, int xPosition, int yPosition, String color)
    {
	this(width, height, xPosition, yPosition, color);
	this.text = text;
    }

    /**
     * Make this rectangle visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }
    
    /**
     * Make this rectangle invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }

    /**
     * Move the rectangle horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        draw();
    }

    /**
     * Move the rectangle vertically by 'distance' pixels.
     */
    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        draw();
    }

    /**
     * Slowly move the rectangle horizontally by 'distance' pixels.
     */
    public void slowMoveHorizontal(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            xPosition += delta;
            draw();
        }
    }

    /**
     * Slowly move the rectangle vertically by 'distance' pixels.
     */
    public void slowMoveVertical(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            yPosition += delta;
            draw();
        }
    }

    /**
     * Change the size to the new size (in pixels). 
     * Width and height must be >= 0.
     */
    public void changeSize(int width, int height)
    {
        erase();
        this.width = width;
        this.height = height;
        draw();
    }

    /**
     * Change the position to the new position (in pixels). 
     */
    public void changePosition(int xPosition, int yPosition)
    {
        erase();
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        draw();
    }

    /**
     * Change the color.
     */
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }

    /**
     * Draw the square with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
	    if (text == null)
		canvas.draw(this, color,
			    new java.awt.Rectangle(xPosition, yPosition, width, height));
	    else
		canvas.draw(this, color,
			    new java.awt.Rectangle(xPosition, yPosition, width, height),
			    text);
		
            canvas.wait(10);
        }
    }

    /**
     * Erase the square on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
