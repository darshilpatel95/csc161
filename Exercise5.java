/*
Darshil Patel
CSC161-65
Dr. Betty Anne Jacoby
Exercise5a Max Numb
*/

import java.util.Scanner;
public class Exercise5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		int max = input.nextInt();
		int count = 1;
		int number = 0 ;
		while (number > 0) {
			number = input.nextInt();
			if (number > max) {
				max = number;
				count = 1;
			}
			if (number == max)
				count++;
		}
		System.out.println("The largest number is " + max);
		System.out.println(
			"The occurrence count of the largest number is " + count);
	}
}