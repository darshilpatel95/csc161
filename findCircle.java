//Darshil
//csc162

import java.util.Scanner;

public class findCircle {
public static void main(String args[]) {
Scanner scan = new Scanner(System.in);

System.out.println("Enter the radius of the circle ");
double radius = scan.nextDouble();

double area = (3.14)*(radius)*(radius);
double cfer = (2)*(3.14)*(radius);

System.out.println(" The Radius is "+radius+" and Area is "+area);
System.out.println(" The Circumferece is "+radius+" and Area is "+cfer);
}
}

