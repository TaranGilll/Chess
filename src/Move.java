import javax.swing.*;

public class Move extends Board {

    public static void move(JButton button1, JButton button2)
    {
        Piece piece = null;
        Boolean color = null;

        if (Board.getType(button1).equals("Pawn")) {
            piece = new Pawn(des);
        }
        else if (Board.getType(button1).equals("Bishop")) {
            piece = new Bishop(des);
        }
        else if(Board.getType(button1).equals("Knight")) {
            piece = new Knight(des);
        }
        else if(Board.getType(button1).equals("Rook")) {
            piece = new Rook(des);
        }
        else if(Board.getType(button1).equals("King")) {
            piece = new King(des);
        }
        else if(Board.getType(button1).equals("Queen")) {
            piece = new Queen(des);
        }
        if (piece.canMove(button1, button2, chessBoardSquares)) {
            button2.setIcon(button1.getIcon());
            button2.setBorder(null);
            button2.setBackground(button2.getBackground());
            button1.setIcon(null);
            button1.setBorder(null);
            button1.setBackground(button1.getBackground());
        }
    }
}