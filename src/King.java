import javax.swing.*;
import static java.lang.StrictMath.abs;

public class King extends Piece
{
    boolean castled = false;

    public King(String des) {
        super(des);
    }

    //when the King castles
    public void setCastled() { castled = true; }

    //determine if King has castled or not
    public boolean isCastled() { return castled; }


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

        //ensure it can move legally (diagonal or straight one square)
        int x_distance = abs(startX - endX);
        int y_distance = abs(startY - endY);

        if ((x_distance != y_distance) || (startX != endX && startY != endY))
            return false;
        if (x_distance > 1 || y_distance > 1)
            return false;

        //direction
        //moving straight one square (root)
        //moving diagonally one square (bishop)
        //moving into a check
        //have a different way for king movements in the move or actual game class
        //due to castling and stuff
        //castle move - ADD

        return true;
    }
}
