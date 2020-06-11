import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.sql.*;


public class Board implements ActionListener{
    // Declaring Variables
    private JPanel chessBoard = new JPanel(new GridLayout(0, 8));
    protected JButton[][] chessBoardSquares = new JButton[8][8];
    private JButton chessSquare;

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
        if (e.getSource() == chessBoardSquares[1][0]) {
            ImageIcon icon = (ImageIcon) chessBoardSquares[1][0].getIcon();
            if(chessBoardSquares[2][0].getModel().isPressed()) {
                chessBoardSquares[1][0].setIcon(null);
                chessBoardSquares[1][0].setBorder(null);
                chessBoardSquares[1][0].setBackground(new java.awt.Color(137, 72, 0));
                chessBoardSquares[2][0].setIcon(icon);
                chessBoardSquares[2][0].setBorder(null);
                chessBoardSquares[2][0].setBackground(new java.awt.Color(255, 206, 110));
            }
            else if(e.getSource() == chessBoardSquares[3][0]) {
                chessBoardSquares[1][0].setIcon(null);
                chessBoardSquares[1][0].setBorder(null);
                chessBoardSquares[1][0].setBackground(new java.awt.Color(137, 72, 0));
                chessBoardSquares[3][0].setIcon(icon);
                chessBoardSquares[3][0].setBorder(null);
                chessBoardSquares[3][0].setBackground(new java.awt.Color(137, 72, 0));
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Board");
        frame.add(new Board().chessBoard);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
    //
}
