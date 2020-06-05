public class Square
{
    private int x;
    private int y;
    private Piece piece;

    public Square (int x_coordinate, int y_coordinate, Piece initPiece)
    {
        x = x_coordinate;
        y = y_coordinate;
        piece = initPiece;
    }

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }

    public Piece getPiece()
    {
        return piece;
    }
}
