import java.awt.*;
import javax.swing.*;
import java.sql.*;


public class Board {
    // Declaring Variables
    private JPanel gui = new JPanel(new BorderLayout());
    private JPanel chessBoard;
    private JButton[][] chessBoardSquares = new JButton[8][8];

    public Board() { initializeGui(); }

    public final void initializeGui() {
        // Initializing GUI
        chessBoard = new JPanel(new GridLayout(0,8));
        gui.add(chessBoard);

        // Insets specifies the space that must be left at each of the square edges.
        Insets chessSquaresMargin = new Insets(0,0,0,0);
        for (int row = 0; row < chessBoardSquares.length; row++) {
            for (int col = 0; col < chessBoardSquares[row].length; col++) {
                JButton chessSquare = new JButton();
                chessSquare.setMargin(chessSquaresMargin);
                chessSquare.setPreferredSize(new Dimension(64, 64));
                if ((col % 2 == 1 && row % 2 == 1) || (col % 2 == 0 && row % 2 == 0)) {
                    chessSquare.setBackground(Color.WHITE);
                    chessSquare.setOpaque(true);
                }
                else {
                    chessSquare.setBackground(Color.BLACK);
                    chessSquare.setOpaque(true);
                }
                chessBoardSquares[row][col] = chessSquare;
                chessBoard.add(chessBoardSquares[row][col]);
            }

        }
    }

    public final JComponent getGui() {
        return gui;
    }

    public static void main(String[] args) {

        Board cb = new Board();
        JFrame frame = new JFrame("Chess");
        frame.add(cb.getGui());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.pack();
        frame.setMinimumSize(frame.getSize());
        frame.setVisible(true);
    }
}