import java.util.Scanner;

public class Test{
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       double a, b, c;
       System.out.print("Enter the sides of the triangle: ");
       a = in.nextDouble();
       b = in.nextDouble();
       c = in.nextDouble();
       Triangle obj = new Triangle(a, b, c);
       System.out.print("Enter the color: ");
       obj.setColor(in.next());
       System.out.println("Enter 1 if triangle is filled: ");
       int temp = in.nextInt();
       if(temp == 1) obj.setFilled(true);
       else obj.setFilled(false);
       System.out.println(obj);
   }
}