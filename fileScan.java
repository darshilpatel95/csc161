import java.io.*;
import java.util.Scanner;
 public class fileScan
 {
 	public static void main(String[]args) throws IOException;
 	{
 	// same thing as File temp = new File ("info.txt");
 	Scanner file = new Scanner(new File("info.txt"));

 	System.out.println(file.nextLine());
 	// reads line as string
 	while (file.hasNext())
 	// has next is boolean value which will read informaton as long as it has info
 	{

	}


 }
}