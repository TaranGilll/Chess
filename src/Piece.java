import javax.swing.*;
import java.awt.*;

public abstract class Piece {
    //instance variables
    private boolean white;
    private boolean alive;

    //constructor - initializes the color of the piece and sets it to alive when the game begins
    public Piece(boolean isWhite) {
        white = isWhite;
        alive = true;
    }

    //determine the status of the piece: alive or dead
    public boolean isAlive() {
        return alive;
    }

    //determine the color of the piece: white or black
    public boolean isWhite() {
        return white;
    }

    //change the status of the piece depending on how the game progresses
    public void setStatus(boolean status) {
        alive = status;
    }

    //determine if the piece can make a legal move
    //pieces cannot move if they compromise a check!! - ADD ALL
    public static boolean canMove(JButton button) {
        //if piece on the end Square is the same color as the current
        /*if(button.getIcon() != null && ((ImageIcon)button.getIcon).getDescription().contains("white") ) {
            return false;
        }
         */
        return true;
    }
}
