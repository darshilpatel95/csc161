
// use type conversion while evaluating average
import java.util.Scanner;
public class newClass{
public static void main(String[] args){
    int pos=0;
    int neg=0;
    int total=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter the total numbers user want to enter");

int  i=sc.nextInt();
int [] num= new int[i];
System.out.println("Please enter number");
for (int j = 0; j < num.length; j++)
{

    num[j] = sc.nextInt();
    if(num[j]>0)
        pos++;
    else
        neg++;
    total=total+num[j];

}
System.out.println(num.length);
double avg =(float)total/(num.length);
System.out.println("positive count="+pos+"negative count="+neg+" average ="+avg);
}
}