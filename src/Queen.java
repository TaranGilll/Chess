import static java.lang.Math.abs;

public class Queen extends Piece
{
    public Queen (boolean whiteColor)
    {
        super(whiteColor);
    }

    @Override
    public boolean canMove(Board board, Square start, Square end)
    {
        if (!super.canMove(board, start, end))
            return false;

        //check if Queen can move legally (diagonal and in a straight line)
        int y_distance = abs(start.getY() - end.getY());
        int x_distance = abs(start.getX() - end.getX());
        if ((x_distance != y_distance) || (start.getX() != end.getX() && start.getY() != end.getY()))
            return false;


        //moving straight (rook)
        //moving diagonally (bishop)

        return true;
    }
    //
}
