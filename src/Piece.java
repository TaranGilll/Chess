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
    public abstract boolean canMove(Square start, Square end);
}
