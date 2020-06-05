import static java.lang.Math.*;

public class Pawn extends Piece
{
    public Pawn (boolean whiteColor)
    {
        super(whiteColor);
    }

    @Override
    public boolean canMove(Square start, Square end)
    {
        //Make sure that there isn't another Piece of its own color on the end Square
        //This is true for all pieces, so should method not be abstract.
        if (start.getPiece().isWhite() == end.getPiece().isWhite())
        {
            return false;
        }
        
        //Make sure pawn moves appropriate places depending on current location
        int y_distance = abs(start.getY() - end.getY());
        int x_distance = abs(start.getX() - end.getX());
        if (y_distance > 2 || x_distance != 0) 
        {
            return false;
        }
        else if (y_distance == 2) 
        {
            if (start.getPiece().isWhite() && start.getY() != 1)
            {
                return false;
            }
            else if (!start.getPiece().isWhite() && start.getY() != 6)
            {
                return false;
            }
        }

        return true;
    }
}
