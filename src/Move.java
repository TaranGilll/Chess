import javax.swing.*;
import java.awt.event.ActionEvent;

public class Move extends Board2 {

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chessBoardSquares[1][0]) {
            ImageIcon icon = new ImageIcon();
            icon = (ImageIcon) chessBoardSquares[1][0].getIcon();
            chessBoardSquares[3][0].setIcon(icon);
        }
    }

    public static void main(String[] args) {
        //
    }
}
