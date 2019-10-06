import java.util.Scanner;

public class gCD {

   public static int gcd(int a,int b){
       if(a==0)
           return b;
       else{
           return gcd(b%a,a);
       }
   }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter First Num:");
       int a=sc.nextInt();
       System.out.print("Enter Second Num :");
       int b=sc.nextInt();
       int gcd=gcd(a,b);
       System.out.print(" The GCD of "+ a +" and "+ b +" is:" + gcd );
   }

}