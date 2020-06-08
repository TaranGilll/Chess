public class Knight extends Piece
{
    public Knight(boolean whiteColor) {
        super(whiteColor);
    }

    @Override
    public boolean canMove(Board board, Square start, Square end)
    {
        //if piece on the end Square is the same color as the current
        if (end.getPiece() != null && start.getPiece().isWhite() == end.getPiece().isWhite())
            return false;

        //ensure knight moves legally
        int x_direction = Math.abs(start.getX() - end.getX());
        int y_direction = Math.abs(start.getY() - end.getY());
        if (x_direction > 2 || y_direction > 2)
            return false;
        if ((x_direction != 2 && y_direction != 1) || (x_direction != 1 && y_direction != 2))
            return false;

        //can't really "go over" a piece

        return true;
    }
}
