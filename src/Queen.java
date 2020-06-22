import javax.swing.*;
import static java.lang.StrictMath.abs;

public class Queen extends Piece
{

    public Queen(String des) {
        super(des);
    }

    @Override
    public boolean canMove(JButton button1, JButton button2, JButton[][] squares) {

        //if piece on the end Square is the same color as the current
        if (!super.canMove(button1, button2, squares))
            return false;

        //determine button coordinates on the board
        int startX = button1.getX() / 64;
        int startY = button1.getY() / 64;
        int endX = button2.getX() / 64;
        int endY = button2.getY() / 64;

        //check if Queen can move legally (diagonal and in a straight line)
        int x_distance = abs(startX - endX);
        int y_distance = abs(startY - endY);

        if ((x_distance != y_distance) || (startX != endX && startY != endY))
            return false;

        //moving straight (rook)

        //moving diagonally (bishop)

        return true;
    }
}