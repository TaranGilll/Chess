import javax.swing.*;
import java.awt.*;

public abstract class Piece extends Board
{
    private boolean white;
    private boolean alive;

    //constructor - initializes the color
    public Piece (boolean whiteColor)
    {
        white = whiteColor;
        alive = true;
    }

    /*
            @Override
            public boolean canMove(JComponent button)
            {
                if (!super.canMove(board2, start, end))
                    return false;

                //Ensure legal movement depending on current location
                int y_distance = abs(start.getY() - end.getY());
                int x_distance = abs(start.getX() - end.getX());

                //pawn can move diagonal ONLY to kill opponent's piece
                if (x_distance == 1 && y_distance == 1)
                {
                    if (end.getPiece().isWhite() != start.getPiece().isWhite() || end.getPiece() == null)
                        return false;
                }

                //other illegal moves
                else if ((x_distance != y_distance) && (y_distance > 2 || x_distance != 0))
                {
                    return false;
                }

                //pawn can only move up two positions if it is at starting spot
                else if (y_distance == 2)
                {
                    //also makes sure pawn doesn't jump over a piece - CHECK
                    if (start.getPiece().isWhite() && start.getY() != 1)
                    {
                        if (board2.getBoard()[start.getY() + 1][start.getX()].getPiece() != null)
                            return false;
                    }
                    else if (!start.getPiece().isWhite() && start.getY() != 6)
                    {
                        if (board2.getBoard()[start.getY() - 1][start.getX()].getPiece() != null)
                            return false;
                    }
                }
                //enpasant - ADD


                return true;
            }
         */

    public void setAlive(boolean status)
    {
        alive = status;
    }

    public boolean isAlive()
    {
        return alive;
    }

    public boolean isWhite()
    {
        return white;
    }

    //determine if the piece can make a legal move
    //pieces cannot move if they compromise a check!! - ADD ALL
    public static boolean canMove(JButton button, int x1, int x2, int y1, int y2)
    {
        //if piece on the end Square is the same color as the current
        if (button.getIcon() != null )
            return false;
        return true;
    }

    public double getX()
    {
        return MouseInfo.getPointerInfo().getLocation().getX();
    }

    public double getY()
    {
        return MouseInfo.getPointerInfo().getLocation().getY();
    }
}
