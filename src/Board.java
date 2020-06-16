import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.List;


public class Board implements ActionListener {
    // Declaring Variables
    private static JFrame frame;
    private JPanel chessBoard = new JPanel(new GridLayout(0, 8));
    protected JButton[][] chessBoardSquares = new JButton[8][8];
    private JButton chessSquare;
    private List<String> pieceNames;
    private JButton button3;
    
    public Board() {
        // Insets specifies the space that must be left at each of the square edges.
        Insets chessSquaresMargin = new Insets(0,0,0,0);
        for (int row = 0; row < chessBoardSquares.length; row++) {
            for (int col = 0; col < chessBoardSquares[row].length; col++) {
                chessSquare = new JButton();
                chessSquare.addActionListener(this);
                chessSquare.setMargin(chessSquaresMargin);
                chessSquare.setPreferredSize(new Dimension(64, 64));
                chessSquare.setBorder(null);
                if ((col % 2 == 1 && row % 2 == 1) || (col % 2 == 0 && row % 2 == 0)) {
                    chessSquare.setBackground(new java.awt.Color(255, 206, 110));
                    chessSquare.setOpaque(true);
                } else {
                    chessSquare.setBackground(new java.awt.Color(137, 72, 0));
                    chessSquare.setOpaque(true);
                }
                chessBoardSquares[row][col] = chessSquare;
                chessBoard.add(chessBoardSquares[row][col]);
            }
        }

        // WHITE PIECES
        for(int col = 0; col < chessBoardSquares[1].length; col++) {
            ImageIcon whitePawn = new ImageIcon(getClass().getResource("whitePawn.png"));
            chessBoardSquares[1][col].setIcon(whitePawn);
            chessBoardSquares[1][col].setBorder(null);
            if (col % 2 == 0) {
                chessBoardSquares[1][col].setBackground(new java.awt.Color(137, 72, 0));
            }
            else {
                chessBoardSquares[1][col].setBackground(new java.awt.Color(255, 206, 110));
            }
        }
        for(int col = 0; col < chessBoardSquares[0].length; col+=7) {
            ImageIcon whiteRook = new ImageIcon(getClass().getResource("whiteRook.png"));
            chessBoardSquares[0][col].setIcon(whiteRook);
            chessBoardSquares[0][col].setBorder(null);
            if(col == 0) {
                chessBoardSquares[0][col].setBackground(new java.awt.Color(255, 206, 110));
            }
            else chessBoardSquares[0][col].setBackground(new java.awt.Color(137, 72, 0));
        }
        for(int col = 1; col < chessBoardSquares[0].length; col+=5) {
            ImageIcon whiteKnight = new ImageIcon(getClass().getResource("whiteKnight.png"));
            chessBoardSquares[0][col].setIcon(whiteKnight);
            chessBoardSquares[0][col].setBorder(null);
            if(col == 1) {
                chessBoardSquares[0][col].setBackground(new java.awt.Color(137, 72, 0));
            }
            else chessBoardSquares[0][col].setBackground(new java.awt.Color(255, 206, 110));
        }
        for(int col = 2; col < chessBoardSquares[0].length; col+=3) {
            ImageIcon whiteBishop = new ImageIcon(getClass().getResource("whiteBishop.png"));
            chessBoardSquares[0][col].setIcon(whiteBishop);
            chessBoardSquares[0][col].setBorder(null);
            if(col == 5) {
                chessBoardSquares[0][col].setBackground(new java.awt.Color(137, 72, 0));
            }
            else chessBoardSquares[0][col].setBackground(new java.awt.Color(255, 206, 110));
        }
        for(int col = 3; col < 5; col++) {
            if(col == 3) {
                ImageIcon whiteQueen = new ImageIcon(getClass().getResource("whiteQueen.png"));
                chessBoardSquares[0][col].setIcon(whiteQueen);
                chessBoardSquares[0][col].setBorder(null);
                chessBoardSquares[0][col].setBackground(new java.awt.Color(137, 72, 0));
            }
            else {
                ImageIcon whiteKing = new ImageIcon(getClass().getResource("whiteKing.png"));
                chessBoardSquares[0][col].setIcon(whiteKing);
                chessBoardSquares[0][col].setBorder(null);
                chessBoardSquares[0][col].setBackground(new java.awt.Color(255, 206, 110));
            }
        }

        // BLACK PIECES
        for(int col = 0; col < chessBoardSquares[6].length; col++) {
            ImageIcon blackPawn = new ImageIcon(getClass().getResource("blackPawn.png"));
            chessBoardSquares[6][col].setIcon(blackPawn);
            chessBoardSquares[6][col].setBorder(null);
            if (col % 2 == 1) {
                chessBoardSquares[6][col].setBackground(new java.awt.Color(137, 72, 0));
            }
            else {
                chessBoardSquares[6][col].setBackground(new java.awt.Color(255, 206, 110));
            }
        }
        for(int col = 0; col < chessBoardSquares[7].length; col+=7) {
            ImageIcon blackRook = new ImageIcon(getClass().getResource("blackRook.png"));
            chessBoardSquares[7][col].setIcon(blackRook);
            chessBoardSquares[7][col].setBorder(null);
            if(col == 7) {
                chessBoardSquares[7][col].setBackground(new java.awt.Color(255, 206, 110));
            }
            else chessBoardSquares[7][col].setBackground(new java.awt.Color(137, 72, 0));
        }
        for(int col = 1; col < chessBoardSquares[7].length; col+=5) {
            ImageIcon blackKnight = new ImageIcon(getClass().getResource("blackKnight.png"));
            chessBoardSquares[7][col].setIcon(blackKnight);
            chessBoardSquares[7][col].setBorder(null);
            if(col == 6) {
                chessBoardSquares[7][col].setBackground(new java.awt.Color(137, 72, 0));
            }
            else chessBoardSquares[7][col].setBackground(new java.awt.Color(255, 206, 110));
        }
        for(int col = 2; col < chessBoardSquares[7].length; col+=3) {
            ImageIcon blackBishop = new ImageIcon(getClass().getResource("blackBishop.png"));
            chessBoardSquares[7][col].setIcon(blackBishop);
            chessBoardSquares[7][col].setBorder(null);
            if(col == 2) {
                chessBoardSquares[7][col].setBackground(new java.awt.Color(137, 72, 0));
            }
            else chessBoardSquares[7][col].setBackground(new java.awt.Color(255, 206, 110));
        }
        for(int col = 3; col < 5; col++) {
            if(col == 4) {
                ImageIcon blackQueen = new ImageIcon(getClass().getResource("blackQueen.png"));
                chessBoardSquares[7][col].setIcon(blackQueen);
                chessBoardSquares[7][col].setBorder(null);
                chessBoardSquares[7][col].setBackground(new java.awt.Color(137, 72, 0));
            }
            else {
                ImageIcon blackKing = new ImageIcon(getClass().getResource("blackKing.png"));
                chessBoardSquares[7][col].setIcon(blackKing);
                chessBoardSquares[7][col].setBorder(null);
                chessBoardSquares[7][col].setBackground(new java.awt.Color(255, 206, 110));
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        // Public variables or protected so Piece class can access them (initRow1 == first coordinate person enters)
        // Another for loop to find what other button was clicked (initRow2 == second coordinate person enteres)
        // To determine if piece is on board (.getIcon(null) == then proceed otherwise you don't)
        // White piece and you press on a black piece proceed (.getIcon(blackKing)

        String description = "";
        String color = "";
        String piece = "";
        JButton button1 = null;
        JButton button2 = null;

        // FIRST LOOP - first button is clicked
        label:
        for (int row = 0; row < chessBoardSquares.length; row ++) {
            for(int col = 0; col <chessBoardSquares[row].length; col ++) {
                if(e.getSource() == chessBoardSquares[row][col]) {
                    button1 = null;
                    button1 = chessBoardSquares[row][col];
                    if(button1.getIcon() != null)
                        description = ((ImageIcon) button1.getIcon()).getDescription();
                    JOptionPane.showMessageDialog(null, "first button");
                    if (description.lastIndexOf("Pawn") != -1 && description.contains("white")) {
                        color = "white";
                        piece = "pawn";
                    }
                    System.out.println("Works");
                    break label;
                }
            }
        }

        // SECOND LOOP
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        //label2;
        for (int row = 0; row < chessBoardSquares.length; row++) {
            for (int col = 0; col < chessBoardSquares[row].length; col++) {
                if (e.getSource() == chessBoardSquares[row][col]) {
                    button2 = chessBoardSquares[row][col];
                    JOptionPane.showMessageDialog(null, "second button");
                    System.out.println(chessBoardSquares[row][col].getIcon());
                    System.out.println(Piece.canMove(button2));
                    if (Piece.canMove(button2)) {
                        //If Button2 has no icon on it
                        ImageIcon icon = (ImageIcon) button1.getIcon();
                        //ImageIcon whitePawn = new ImageIcon(getClass().getResource("whitePawn.png"));
                        button1.setIcon(null);
                        button1.setBorder(null);
                        button1.setBackground(button1.getBackground());
                        button2.setIcon(icon);
                        button2.setBorder(null);
                        button2.setBackground(button2.getBackground());

                    }
                        //JOptionPane.showMessageDialog(null, " " + chessBoardSquares[row][col].getIcon());
                        JOptionPane.showMessageDialog(null, " " + chessBoardSquares[row][col].getX()/(int) 64);
                        JOptionPane.showMessageDialog(null, " " + chessBoardSquares[row][col].getY()/(int) 64);
                        //JOptionPane.showMessageDialog(null," " + chessBoardSquares[row][col].getLocation().y/(int) 64);
                    //break label2;
                    }
                }
            }
        }

        /*boolean condition = Piece.canMove(button2, initRow, initCol, initRow2, initRow2);
        if (condition) {
            //button.setIcon(null);
            //button.setBorder(null);
            //button.setBackground(new java.awt.Color(137, 72, 0));
            //button2.setIcon(button.getIcon());
            //button2.setBorder(null);
            //button2.setBackground(new java.awt.Color(137, 72, 0));
        }*/

            /*chessBoardSquares[2][0].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ImageIcon icon = (ImageIcon) chessBoardSquares[1][0].getIcon();
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
                    ImageIcon icon = (ImageIcon) chessBoardSquares[1][0].getIcon();
                    chessBoardSquares[1][0].setIcon(null);
                    chessBoardSquares[1][0].setBorder(null);
                    chessBoardSquares[1][0].setBackground(new java.awt.Color(137, 72, 0));
                    chessBoardSquares[3][0].setIcon(icon);
                    chessBoardSquares[3][0].setBorder(null);
                    chessBoardSquares[3][0].setBackground(new java.awt.Color(137, 72, 0));
                }
            });
        }*/

    public static void main(String[] args) {
        frame = new JFrame("Board");
        frame.add(new Board().chessBoard);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
}

