import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class JLabelWithIcon extends JFrame {
public JLabelWithIcon() throws HeadlessException {
initialize();
}

private void initialize() {
setSize(250, 350);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout(FlowLayout.LEFT));
  
Random rand = new Random();
int img_no = rand.nextInt(54) + 1;

Icon icon = new ImageIcon(img_no+".png");
JLabel label1 = new JLabel("Image : "+img_no, icon, JLabel.RIGHT);
  
img_no = rand.nextInt(54) + 1;
icon = new ImageIcon(img_no+".png");
JLabel label2 = new JLabel("Image : "+img_no, icon, JLabel.RIGHT);
  
img_no = rand.nextInt(54) + 1;
icon = new ImageIcon(img_no+".png");
JLabel label3 = new JLabel("Image : "+img_no, icon, JLabel.RIGHT);

  
getContentPane().add(label1);
getContentPane().add(label2);
getContentPane().add(label3);
}

public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
public void run() {
new JLabelWithIcon().setVisible(true);
}
});
}
}