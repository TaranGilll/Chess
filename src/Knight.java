public class Knight extends Piece
{
    public Knight(boolean whiteColor) {
        super(whiteColor);
    }

    @Override
    public boolean canMove(Board2 board2, Square start, Square end)
    {
        if (!super.canMove(board2, start, end))
            return false;

        //ensure knight moves legally
        int x_direction = Math.abs(start.getX() - end.getX());
        int y_direction = Math.abs(start.getY() - end.getY());
        return (x_direction * y_direction == 2);
    }
}
