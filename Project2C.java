import java.awt.*;
import javax.swing.*;

public class Project2C{

public static void main(String[] args) {
JFrame frame = new JFrame("Display Cards");
frame.setSize(600, 300);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.setVisible(true);

  
GridLayout grid=new GridLayout(1,3,5,5);
frame.setLayout(grid);
  
ImageIcon img1=new ImageIcon("Card/1.png");
ImageIcon img2=new ImageIcon("Card/2.png");
ImageIcon img3=new ImageIcon("Card/3.png");
  
//JLabel Lb11= new JLabel(img1);
//JLabel Lb12= new JLabel(img2);
//JLabel Lb13= new JLabel(img3);
//frame.getContentPane().add(Lb11, BorderLayout.CENTER);
//frame.getContentPane().add(Lb12, BorderLayout.CENTER);
//frame.getContentPane().add(Lb13, BorderLayout.CENTER);
  
ImageIcon[] images = new ImageIcon[54];
for (int i = 1; i < images.length; i++) {
images[i] = new ImageIcon("card/" + i + ".png");
}
  
int random[] = new int[3];
for (int i = 0; i < random.length; i++) {
random[i] = (int) (Math.random() * 54);
JLabel Lb= new JLabel(images[random[i]]);
frame.getContentPane().add(Lb, BorderLayout.CENTER);

}

}
}