public abstract class Piece
{
    private boolean white;
    private boolean alive;

    //constructor - initializes the color
    public Piece (boolean whiteColor)
    {
        white = whiteColor;
        alive = true;
    }

    public void setAlive(boolean status)
    {
        alive = status;
    }

    public boolean isAlive()
    {
        return alive;
    }

    public boolean isWhite()
    {
        return white;
    }

    //determine if the piece can make a legal move
    //pieces cannot move if they compromise a check!! - ADD ALL
    public boolean canMove(Board board, Square start, Square end)
    {
        //if piece on the end Square is the same color as the current
        if (end.getPiece() != null && start.getPiece().isWhite() == end.getPiece().isWhite())
            return false;
        return true;
    }
}
