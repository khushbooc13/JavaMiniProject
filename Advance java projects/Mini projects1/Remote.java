import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class Remote extends JFrame {
    JPanel p2;

    private Window Remote;

    public Remote() {
        createAndShowGUI();
    }

    public void createAndShowGUI() {
        // Set title and default close operation
        setTitle("Transparent Panel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        p2 = new JPanel();
        JLabel label = new JLabel(new ImageIcon("C://Mobile.png"));
        p2.add(label);
        p2.setPreferredSize(new Dimension(1000, 800));
        add(p2);
        setLayout(new FlowLayout());
        setSize(315, 610);
        setVisible(true);
        setLocation(800, 100);
    }

    public static void main(String args[]) {
        // Run in the EDT
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Remote remote = new Remote();
            }
        });
    }

}