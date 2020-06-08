import static java.lang.Math.abs;

public class King extends Piece
{
    boolean castled = false;
    public King(boolean whiteColor)
    {
        super(whiteColor);
    }

    //when the King castles
    public void setCastled() { castled = true; }

    //determine if King has castled or not
    public boolean isCastled() { return castled; }

    @Override
    public boolean canMove(Board board, Square start, Square end) {
        //if piece on the end Square is the same color as the current
        if (end.getPiece() != null && start.getPiece().isWhite() == end.getPiece().isWhite())
            return false;

        //ensure it can move legally (diagonal or straight one square)
        int y_distance = abs(start.getY() - end.getY());
        int x_distance = abs(start.getX() - end.getX());
        if ((x_distance != y_distance) || (start.getX() != end.getX() && start.getY() != end.getY()))
            return false;
        if (x_distance > 1)
            return false;

        //direction??
        //moving straight (rook)
        //moving diagonally (bishop)


        return true;
    }
}
