import java.util.Scanner;
public class pro
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		int count = 0;
		double input=0;
		while (count<100)
		{
			System.out.print("Please enter a number");
		    input = scan.nextDouble();
			count++;

		}
		System.out.println(input);
	}
}