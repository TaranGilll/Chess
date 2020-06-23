import javax.swing.*;
import static java.lang.StrictMath.abs;

public class Pawn extends Piece
{

    public Pawn(String des) {
        super(des);
    }

    @Override
    public boolean canMove(JButton button1, JButton button2, JButton[][] squares)
    {
        //if piece on the end Square is the same color as the current
        if(!super.canMove(button1, button2, squares))
            return false;

        //determine button coordinates on the board
        int startX = button1.getX() / 64;
        int startY = button1.getY() / 64;
        int endX = button2.getX() / 64;
        int endY = button2.getY() / 64;

        //Ensure legal movement depending on current location
        int x_direction = abs(startX - endX);
        int y_direction = abs(startY - endY);

        if (x_direction == 1 && y_direction == 1)
        {
            if(this.isWhite() != Board.isWhite(button2) || button2.getIcon() == null)
                return false;
        }

        //other illegal moves
        if (x_direction != 0 || y_direction > 2)
            return false;

        else if (y_direction == 2)
        {
            if (this.isWhite() && startY == 1)
            {
                if(squares[startY + 1][startX].getIcon() != null)
                    return false;
            }
            else if (!this.isWhite() && startY == 6)
            {
                if(squares[startY - 1][startX].getIcon() != null)
                    return false;
            }
        }

        return true;
    }
}