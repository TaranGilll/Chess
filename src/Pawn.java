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
        return true;
    }
}