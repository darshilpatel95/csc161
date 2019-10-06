import java.awt.*;
import javax.swing.*;
public class DisplayCardsRandomly extends JFrame{
     public DisplayCardsRandomly(){
          setLayout(new GridLayout(1,3,5,5));
          ImageIcon []icon=new ImageIcon[52];
          for(int i=1; i<52 ; i++){
              icon[i]= new ImageIcon("image/card/"+(i)+".png");
          }
          int r=(int)(Math.random()*52);
          int q=(int)(Math.random()*52);
          int p=(int)(Math.random()*52);
          add(new JLabel(icon[r]));
          add(new JLabel(icon[q]));
          add(new JLabel(icon[p]));
     }
     public static void main(String args[]){
          DisplayCardsRandomly cards = new DisplayCardsRandomly();
          cards.setTitle("Display Three Cards Randomly");
          cards.setSize(300,200);
          cards.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
          cards.setVisible(true);
     }
}

