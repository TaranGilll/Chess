public class Bishop extends Piece
{
    public Bishop (boolean whiteColor)
    {
        super(whiteColor);
    }

    @Override
    public boolean canMove(Board board, Square start, Square end)
    {
        //if piece on the end Square is the same color as the current
        if (end.getPiece() != null && start.getPiece().isWhite() == end.getPiece().isWhite())
            return false;

        //ensure bishop moves legally
        if (Math.abs(start.getX() - end.getX()) != Math.abs(start.getY() - end.getY()))
            return false;

        //determine direction of movement
        String direction = "";
        if (start.getX() > end.getX() && start.getY() > end.getY())
            direction = "nw";
        else if (start.getX() > end.getX() && start.getY() < end.getY())
            direction = "sw";
        else if (start.getX() < end.getX() && start.getY() > end.getY())
            direction = "ne";
        else
            direction = "se";

        //make sure no pieces are being "jumped" in the direction of movement
        int spaces = Math.abs(start.getY() - end.getY());
        for(int i = 1; i < spaces; i++)
        {
            if (direction.equals("nw"))
            {
                if (board.getBoard()[start.getY() - i][start.getX() - i].getPiece() != null)
                    return false;
            }
            else if (direction.equals("sw"))
            {
                if (board.getBoard()[start.getY() + i][start.getX() - i].getPiece() != null)
                    return false;
            }
            else if (direction.equals("ne"))
            {
                if (board.getBoard()[start.getY() + i][start.getX() + i].getPiece() != null)
                    return false;
            }
            else if (direction.equals("se"))
            {
                if (board.getBoard()[start.getY() + i][start.getX() + i].getPiece() != null)
                    return false;
            }
        }
        return true;
    }

}
