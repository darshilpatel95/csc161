import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Smiley extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillOval(10, 10, 200, 200);

        // draw Eyes
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        
        g.drawPolygon(new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3);

        // draw Mouth
        g.fillOval(50, 110, 120, 60);

        // adding smile
        g.fillRect(50, 110, 120, 30);
        g.fillOval(10, 120, 120, 40);
    }

    public static void main(String[] args) {
        Smiley smily = new Smiley();
        JFrame app = new JFrame();
        app.add(smily);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}
