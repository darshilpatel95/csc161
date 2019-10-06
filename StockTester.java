import java.text.DecimalFormat;
public class StockTester
{
   public static void main(String[] args)
   {
      
       DecimalFormat formatter=new DecimalFormat("0.00");
   
       Stock stock=new Stock("ORCL", "Oracle Corporation");
      
   
       stock.setPreviousPrice(34.50);
              
    
       stock.setCurrentPrice(34.35);
           
    
       System.out.println(stock.toString());
       System.out.print("Change Percentage of Previous and current Stock : ");
       System.out.print(formatter.format(stock.getChangePercent()));
              
   }
  
}