import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VehicleSummary {

   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int count=0;
      
       System.out.print("Enter the name of the file: ");
       String fileName=s.nextLine();
      
      
      
       String model[]=new String[100];
       double miles[]=new double[100];
       double fuel[]=new double[100];
      
       Scanner inFile=null;
       try {
           inFile=new Scanner(new File(fileName));
           while(inFile.hasNext()) {
              
              
               String line[]=inFile.nextLine().toLowerCase().split(" ");
               String name=line[0]+" "+line[1];
               int index=-1;
               for(int i=0;i<count;i++) {
                   if(model[i].equals(name)) {
                       index=i;
                       break;
                   }
               }
               if(index!=-1) {
                   miles[index]=miles[index]+Double.parseDouble(line[2]);
                   fuel[index]=fuel[index]+Double.parseDouble(line[3]);
               }else {
                   model[count]=name;
                   miles[count]=Double.parseDouble(line[2]);
                   fuel[count]=Double.parseDouble(line[3]);
                   count++;
               }
              
           }
       } catch (FileNotFoundException e) {
           System.out.println("Unable to find the file in current directory.Please check file name and path");
       }
       System.out.print("Enter the model name to find: ");
       String modelName=s.nextLine();
       int i;
       for(i=0;i<count;i++) {
           if(model[i].equalsIgnoreCase(modelName)) {
               System.out.println("Model        : "+modelName);
               System.out.println("Total Miles : "+miles[i]);
               System.out.println("Total Gallons: "+fuel[i]);
               System.out.println("MPG          : "+miles[i]/fuel[i]);
               break;
           }
       }
       if(i==count)
           System.out.println("Model is not found!!!!!!!!!!!!!!!!!!!");
   }

}