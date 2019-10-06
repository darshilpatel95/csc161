import java.util.Scanner;

public class StockTest {
  
   public static void main(String [] argv){
      
       Scanner input = new Scanner(System.in);
      
       System.out.println("Please input the stock symbol: ");
       String symbol = input.nextLine();
      
       System.out.println("Please input the stock name: ");
       String name = input.nextLine();
      
       Stock stock = new Stock(symbol, name);
      
       // set the previous price
       System.out.println("Please set the previous price: ");
       stock.setPreviousPrice(input.nextDouble());
      
       // set the current price
       System.out.println("Please set the current price: ");
       stock.setCurrentPrice(input.nextDouble());
      
       System.out.println("Price Change percetage of stock is :" + stock.getChangePercent() +"% ");
   }
}

