import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Board implements ActionListener {
    // Declaring Instance Variables
    private static JFrame frame;
    private JPanel chessBoard = new JPanel(new GridLayout(0, 8));
    protected static JButton[][] chessBoardSquares = new JButton[8][8];
    private JButton chessSquare;
    private static final String [] pieceNames = {"rook", "knight", "bishop", "queen", "king", "pawn"};
    private static String des;

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
                if ((row + col) % 2 == 0) {
                    chessSquare.setBackground(new java.awt.Color(255, 206, 110));
                    chessSquare.setOpaque(true);
                } else {
                    chessSquare.setBackground(new java.awt.Color(137, 72, 0));
                    chessSquare.setOpaque(true);
                }
                //add button to chessSquare
                chessBoardSquares[row][col] = chessSquare;
                //add chessSquare to the chessBoard (panel)
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

    // HELPER METHODS
    public static String getDescription(JButton initButton) {
        des = ((ImageIcon)initButton.getIcon()).getDescription();
        return des;
    }
    public static String getType(JButton initButton) {
        Board.getDescription(initButton);
        String a = "King";
        String b = "Rook";
        String c = "Bishop";
        String d = "Queen";
        String e = "Knight";
        String f = "Pawn";

        if(des.contains(a)) return a;
        if(des.contains(b)) return b;
        if(des.contains(c)) return c;
        if(des.contains(d)) return d;
        if(des.contains(e)) return e;
        else return f;
    }

    //may not need
    public static boolean isWhite(JButton initButton) {
        if (des.contains("white")) return true;
        return false;
    }

    JButton button1 = null;
    JButton button2 = null;
    int counter = 0;

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        JButton clicked = null;
        String des = "";

        OUTER:
        for (int row = 0; row < chessBoardSquares.length; row++) {
            for (int col = 0; col < chessBoardSquares[row].length; col++) {
                if (source == chessBoardSquares[row][col]) {

                    /*
                    String type = Board.getType(chessBoardSquares[row][col]);
                    Boolean isWhite = Board.isWhite(chessBoardSquares[row][col]);
                    System.out.println(Board.getType(chessBoardSquares[row][col]));
                    System.out.println(Board.isWhite(chessBoardSquares[row][col]));
                     */

                    clicked = (JButton) source;

                    if (counter == 0) {
                        button1 = clicked;
                        System.out.println("click1");
                        JOptionPane.showMessageDialog(null, " " + "first step done");
                        counter++;
                        return;
                    } else if (counter == 1) {
                        button2 = clicked;
                        System.out.println("click2");
                        JOptionPane.showMessageDialog(null, " " + "second step done");
                        counter++;
                    }
                    if (counter > 1)
                        counter = 0;
                    break OUTER;
                }
            }
        }
        move(button1, button2);
    }

    public void move(JButton button1, JButton button2)
    {
        Piece piece = null;

        //determine the piece
        if (Board.getType(button1).equals("Pawn")) {
            piece = new Pawn(des);
            System.out.println("pawn being moved");
        }
        else if (Board.getType(button1).equals("Rook")) {
            piece = new Rook(des);
            System.out.println("rook being moved");
        }
        else if (Board.getType(button1).equals("Knight")) {
            piece = new Knight(des);
            System.out.println("knight being moved");
        }
        else if (Board.getType(button1).equals("Bishop")) {
            piece = new Bishop(des);
            System.out.println("bishop being moved");
        }
        else if (Board.getType(button1).equals("Queen")) {
            piece = new Queen(des);
            System.out.println("queen being moved");
        }
        else if (Board.getType(button1).equals("King")) {
            piece = new King(des);
            System.out.println("king being moved");
        }

        //print
        System.out.println(des);
        System.out.println(piece.canMove(button1, button2, chessBoardSquares));

        //execute move
        if (piece.canMove(button1, button2, chessBoardSquares)) {
            button2.setIcon(button1.getIcon());
            button2.setBorder(null);
            button2.setBackground(button2.getBackground());
            button1.setIcon(null);
            button1.setBorder(null);
            button1.setBackground(button1.getBackground());
        }
        des = "";
    }

    public JComponent getChessBoard() { return chessBoard; }

    public static void main(String[] args) {
        frame = new JFrame("Board");
        frame.add(new Board().chessBoard);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
}


// TO FIX
//determining color for piece on button2 if any (can do this. for button1, but 2 requires method in this class
//squares with icons vs squares with pieces (adding piece objects and reffering from that??)
    //easier to manipulate to get piece color and stuff instead of icon.description.contains
    //using Java objects instead of just text...better OOP
    //((ImageIcon)button2.getIcon()).getDescription().contains("white")) always gives errors...very bad technique


