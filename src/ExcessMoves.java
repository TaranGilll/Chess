import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class ExcessMoves {
    private static JButton a = new JButton("Rook");
    private static JButton b = new JButton("Bishop");;
    private static JButton c = new JButton("Queen");
    private static JButton d = new JButton("Knight");
    private final JPanel gui = new JPanel(new BorderLayout(3, 3));
    private static JButton button = null;

    // Creates GUI / determines if piece is on opponent's side
    public ExcessMoves(JButton initButton) {
        button = initButton;
        gui.setBorder(new TitledBorder("MESSAGE"));
        JPanel controls = new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
        controls.add(a);
        controls.add(b);
        controls.add(c);
        controls.add(d);
        gui.add(controls,BorderLayout.SOUTH);
        JLabel label = new JLabel("Chose new piece: ");
        gui.add(label, BorderLayout.CENTER);

        if (initButton.getY() / 64 == 7 && Board.isWhite(initButton) && Board.getType(initButton).equals("Pawn")) {
            JOptionPane.showMessageDialog(null, gui);
        }
        if (initButton.getY() == 0 && !Board.isWhite(initButton) && Board.getType(initButton).equals("Pawn")){
            JOptionPane.showMessageDialog(null, gui);
        }
    }

    // Adds ActionListeners to each button and sets desired commands
    public static void ExcessMoves2(JButton initButton) {
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(button.getY() == 0) {
                    button.setIcon(new ImageIcon(getClass().getResource("blackRook.png")));
                    button.setBorder(null);
                    button.setBackground(button.getBackground());
                }
                else {
                    button.setIcon(new ImageIcon(getClass().getResource("whiteRook.png")));
                    button.setBorder(null);
                    button.setBackground(button.getBackground());
                }
            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(button.getY() == 0) {
                    button.setIcon(new ImageIcon(getClass().getResource("blackBishop.png")));
                    button.setBorder(null);
                    button.setBackground(button.getBackground());
                }
                else {
                    button.setIcon(new ImageIcon(getClass().getResource("whiteBishop.png")));
                    button.setBorder(null);
                    button.setBackground(button.getBackground());
                }
            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(button.getY() == 0) {
                    button.setIcon(new ImageIcon(getClass().getResource("blackQueen.png")));
                    button.setBorder(null);
                    button.setBackground(button.getBackground());
                }
                else {
                    button.setIcon(new ImageIcon(getClass().getResource("whiteQueen.png")));
                    button.setBorder(null);
                    button.setBackground(button.getBackground());
                }
            }
        });
        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(button.getY() == 0) {
                    button.setIcon(new ImageIcon(getClass().getResource("blackKnight.png")));
                    button.setBorder(null);
                    button.setBackground(button.getBackground());
                }
                else {
                    button.setIcon(new ImageIcon(getClass().getResource("whiteKnight.png")));
                    button.setBorder(null);
                    button.setBackground(button.getBackground());
                }
            }
        });
    }

    public static void main(JButton button2) {
        new ExcessMoves(button2);
        ExcessMoves2(button2);
    }
}