import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Move extends Board implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chessBoardSquares[1][0]) {
            ImageIcon icon = (ImageIcon) chessBoardSquares[1][0].getIcon();
            chessBoardSquares[2][0].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    chessBoardSquares[1][0].setIcon(null);
                    chessBoardSquares[1][0].setBorder(null);
                    chessBoardSquares[1][0].setBackground(new java.awt.Color(137, 72, 0));
                    chessBoardSquares[2][0].setIcon(icon);
                    chessBoardSquares[2][0].setBorder(null);
                    chessBoardSquares[2][0].setBackground(new java.awt.Color(255, 206, 110));
                }
            });
            chessBoardSquares[3][0].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    chessBoardSquares[1][0].setIcon(null);
                    chessBoardSquares[1][0].setBorder(null);
                    chessBoardSquares[1][0].setBackground(new java.awt.Color(137, 72, 0));
                    chessBoardSquares[3][0].setIcon(icon);
                    chessBoardSquares[3][0].setBorder(null);
                    chessBoardSquares[3][0].setBackground(new java.awt.Color(137, 72, 0));
                }
            });
        }
    }

        public static void main (String[]args){
            //

        }
}
