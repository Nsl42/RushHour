/**
 * A set of constants used in the RushHour program.
 */
public interface Constants {

    // the window's title
    public static final String TITLE = "Rush Hour";

    // dimensions of cars in squares 
    public static final int LONG = 3, SHORT = 2;

    // constants to represent directions
    public static final String HORIZONTAL = "H", VERTICAL = "V";
    public static final String LEFT = "L", RIGHT = "R";
    public static final String UP = "U", DOWN = "D";

    // dimensions in pixels
    public static final int SQUARE = 30; // the side of a square in the grid
    public static final int BORDER = 4; // the width of a border in the grid 
    public static final int SIZE = 6*SQUARE+2*BORDER; // the total size of the window (height or width)

}
