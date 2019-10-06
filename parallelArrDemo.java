
import java.io.*;
import java.util.Scanner;

public class parallelArrDemo
{

  public static void main(String[] args) throws IOException
  {

     String[] studentName = new String[10];
     int[] studentID = new int[10];
     double[] studentAvg = new double[10];

     File fn = new File("student.dat");
     Scanner infile = new Scanner(fn);

     fillArrays(infile,studentName,studentID,studentAvg);

     printHeading();
     printLines(studentName,studentID,studentAvg);


     int aStudentID = 10008;
//using find index in println
     System.out.println(studentName[findIndex(studentID,aStudentID)] +
             "has a grade of " + letterGrade(studentAvg[findIndex(studentID,aStudentID)]));

     int foundIndx = findIndex(studentID,aStudentID);
// using a variable in the println
     System.out.println(studentName[foundIndx] +
             "has a grade of " + letterGrade(studentAvg[foundIndx]));




  }

//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

public static int findIndex(int[] sid, int sval)
{ int indx = 0;

    while (sid[indx] != sval) indx++;

    return indx;

}


//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

public static void fillArrays(Scanner input, String[] sname,int[] sid, double[] savg)
{ int indx = 0;

    while (input.hasNext())
    {
	  sname[indx] = getName(input);
	  sid[indx] = input.nextInt();
	  savg[indx] = input.nextDouble();
	  indx++;
    }

}

//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

public static String getName(Scanner infile)
{  String retValue = "";

   retValue = infile.nextLine();
   if(retValue.equals("")) retValue = infile.nextLine();

   return retValue;
}

//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

public static void printLines(String[] sname, int[] sid, double[] savg)
{

   for(int indx = 0; indx < sid.length; indx++)
     System.out.printf("%-20s  %7d     %7.2f   %4s\n\n",sname[indx],sid[indx],savg[indx],letterGrade(savg[indx]));


}

//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

public static void printHeading()
{

    System.out.printf("%-20s  %7s     %7s   %7s\n","Student","Student","Student","Final");
    System.out.printf("%-20s  %7s     %7s   %7s\n","Name","ID     ","Average","Grade");
    System.out.printf("%-20s  %7s     %7s   %7s\n\n","-------","-------","-------","-------");


}

//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

public static char letterGrade(double avgIn)
{  char retValue = 'F';


    if(avgIn >= 90.0)
       retValue = 'A';
    else if(avgIn >= 80.0)
       retValue = 'B';
    else if(avgIn >= 70.0)
       retValue = 'C';
    else if(avgIn >= 60.0)
       retValue = 'D';

    return retValue;

}


}

