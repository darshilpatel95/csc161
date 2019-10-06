//Darshil
//CSC162
//07/26/19

import java.util.Scanner;
public class sumOfDigit
{
   public static void main(String[] args)
   {
       int num;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter integer:");
       num=input.nextInt();
       System.out.println(sumOfDigits(num));

   }
   private static int sumOfDigits(int num)
   {
       int sum = 0;
while (num > 0)
{
sum = sum + num % 10;
num = num / 10;
}
       return sum;
   }

}