import java.awt.*;
import javax.swing.*;

public class Images extends JFrame {
    private JLabel label1;
    private ImageIcon pawn;

    public Images() {
        setLayout(new FlowLayout());
        pawn = new ImageIcon(getClass().getResource("blackKing.jpg"));
        label1 = new JLabel(pawn);
        add(label1);

    }

    public static void main(String[] args) {
        Images gui = new Images();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();


    }

}
