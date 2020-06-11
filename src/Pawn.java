import static java.lang.Math.*;

public class Pawn extends Piece
{
    public Pawn (boolean whiteColor)
    {
        super(whiteColor);
    }

    @Override
    public boolean canMove(Board2 board2, Square start, Square end)
    {
        if (!super.canMove(board2, start, end))
            return false;

        //Ensure legal movement depending on current location
        int y_distance = abs(start.getY() - end.getY());
        int x_distance = abs(start.getX() - end.getX());

        //pawn can move diagonal ONLY to kill opponent's piece
        if (x_distance == 1 && y_distance == 1)
        {
            if (end.getPiece().isWhite() != start.getPiece().isWhite() || end.getPiece() == null)
                return false;
        }

        //other illegal moves
        else if ((x_distance != y_distance) && (y_distance > 2 || x_distance != 0))
        {
            return false;
        }

        //pawn can only move up two positions if it is at starting spot
        else if (y_distance == 2) 
        {
            //also makes sure pawn doesn't jump over a piece - CHECK
            if (start.getPiece().isWhite() && start.getY() != 1)
            {
                if (board2.getBoard()[start.getY() + 1][start.getX()].getPiece() != null)
                    return false;
            }
            else if (!start.getPiece().isWhite() && start.getY() != 6)
            {
                if (board2.getBoard()[start.getY() - 1][start.getX()].getPiece() != null)
                    return false;
            }
        }
        //enpasant - ADD


        return true;
    }
}
