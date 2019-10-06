
public class Stock
{
  

   private String symbol;
   private String name;
   private double previousClosingPrice;
   private double currentPrice;
  

   public Stock(String symbol,String name)
   {
       this.symbol=symbol;
       this.name=name;
   }
 
   public void setCurrentPrice(double currentPrice)
   {
       this.currentPrice=currentPrice;
   }
  
   public void setPreviousPrice(double previousClosingPrice)
   {
       this.previousClosingPrice=previousClosingPrice;
   }

   public double getCurrentPrice()
   {
       return currentPrice;
   }
  
   public double getPreviousPrice()
   {
       return previousClosingPrice;
   }
  
   public double getChangePercent()
   {
       return ((getPreviousPrice()-getCurrentPrice())/getCurrentPrice())*100;
   }
  
   @Override
   public String toString() {
       return "Stock Symbol : "+symbol+"\nStock Name : "+name;
   }
  
  
}
