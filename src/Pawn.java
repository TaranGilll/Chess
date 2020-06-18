import javax.swing.*;
import static java.lang.StrictMath.abs;

public class Pawn extends Piece
{

    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(JButton button1, JButton button2, JButton[][] squares)
    {
        return true;
    }
}