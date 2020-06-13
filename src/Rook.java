/*public class Rook extends Piece
{

    public Rook (boolean whiteColor)
    {
        super(whiteColor);
    }

    @Override
    public boolean canMove(Board2 board2, Square start, Square end) {

        if (!super.canMove(board2, start, end))
            return false;

        //ensure rook moves legally (only in a straight line)
        if (start.getX() != end.getX() && start.getY() != end.getY())
            return false;

        //determine the direction of movement
        String direction = "";
        if (start.getX() < end.getX())
            direction = "east";
        else if (start.getX() > end.getX())
            direction = "west";
        else if (start.getY() > end.getY())
            direction = "north";
        else if (start.getY() < end.getY())
            direction = "south";

        //make sure rook doesn't jump over any pieces depending on direction of movement
        if (direction.endsWith("st"))
        {
            if (direction.equals("east"))
            {
                for (int i = start.getX() + 1; i < end.getX(); i++)
                {
                    if (board2.getBoard()[start.getY()][i].getPiece() != null)
                        return false;
                }
            }
            else
                {
                for (int i = start.getX() - 1; i > end.getX(); i--)
                {
                    if (board2.getBoard()[start.getY()][i].getPiece() != null)
                        return false;
                }
            }
        }
        else if (direction.endsWith("th"))
        {
            if (direction.equals("south"))
            {
                for (int i = start.getY() + 1; i < end.getY(); i++)
                {
                    if (board2.getBoard()[i][start.getX()].getPiece() != null)
                        return false;
                }
            }
            else
            {
                // CHECK - no (>=)
                for (int i = start.getY() - 1; i > end.getY(); i--)
                {
                    if (board2.getBoard()[i][start.getX()].getPiece() != null)
                        return false;
                }
            }
        }

        return true;
    }
}
*/