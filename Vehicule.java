import java.awt.Point;

public class Vehicule extends Rectangle
{
   private char nom;
   private int longueur;
   private Direction dir;

   public Vehicule (char nom, int longueur, Direction dir, Slot position, String col)
   {
      if (Direction.HORIZON.equals(dir))
         super(nom + "", Constants.SQUARE * longueur, Constants.SQUARE,
               position.toPoint().x, position.toPoint().y, col);
      else
         super(nom + "", Constants.SQUARE, Constants.SQUARE * longueur,
               position.toPoint().x, position.toPoint().y, col);

      this.nom = nom;
      this.longueur = longueur;
      this.dir = dir;
      this.makeVisible();
   }


   public boolean deplacer (??? direction, int distance)
   {
      return false;
   }

   public void draw ()
   {
      super.draw();
   }
}
