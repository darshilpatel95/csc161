public class fanClass; {
   static final int SLOW = 1; // static final attributes with constant alues
   static final int MEDIUM = 2;
   static final int FAST = 3;

   //Attributes of Fan Class
   private int speed=SLOW;
   private boolean isFanOn=false;
   private double radius=5;
   String color="blue";

   //Constructor which stores default values
   public Fan(){
   speed = 0;
   isFanOn = false;
   radius = 0.0;
   color = "";
   }

   // toString method used to return String data of Fan
   public String toString(){
       String onOrOff;
       if(isFanOn())
       onOrOff="on";
       else
       onOrOff="off";

   if(isFanOn){ // Checking Whether Fan is on/off
   return "A "+this.getRadius()+" inch "+this.getColor()+" fan at a speed of "+this.getSpeed();
   }else{
   return "A "+this.radius+" inch "+this.getColor()+" fan; fan is "+onOrOff;
   }
   }
   //Setters and Getters
   public int getSpeed() {
   return speed;
   }
   public void setSpeed(int speed) {
   this.speed = speed;
   }
   public boolean isFanOn() {

   return isFanOn;
   }
   public void setFanOn(boolean isFanOn) {
   this.isFanOn = isFanOn;
   }
   public double getRadius() {
   return radius;
   }
   public void setRadius(double radius) {
   this.radius = radius;
   }
   public String getColor() {
   return color;
   }
   public void setColor(String color) {
   this.color = color;
   }

   public static void main(String[] args) {
   Fan fan1 = new Fan(); //Creating Fan object1
   fan1.setSpeed(Fan.FAST);
   fan1.setRadius(10);
   fan1.setColor("Yellow");
   fan1.setFanOn(true);

   System.out.println(fan1.toString());

   Fan fan2 = new Fan(); //Creating Fan object2
   fan2.setSpeed(Fan.MEDIUM);
   fan2.setRadius(5);
   fan2.setColor("Blue");
   fan2.setFanOn(false);

   System.out.println(fan2.toString());
   }
   }