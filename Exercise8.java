/*
Darshil Patel
CSC161-65
Dr. Betty Anne Jacoby
Exercise_8a Pentagon
*/
import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length from the center to a vertex: ");
		double r = input.nextDouble();
		double s = (2 * r) * Math.sin(Math.PI / 5); // Length of a side
		double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
		System.out.printf("The area of the pentagon is %5.2f\n", area);
	}
}