import java.util.Random;

/** Die class simulates a six-sided die.
*/

public class Die
{
   private int sides;
   private int value;

   /**The constructor performs an initial
       roll of the die. The number of sides
       for the die is passed as an argument.
       @param numSides The number of sides for the die.
    */

   public Die(int numSides)
   {
      sides = numSides;
      roll();
   }
   public void roll()
   {
      // Create a Random object.
      Random rand = new Random();
      // Get a random value for the die.
      value = rand.nextInt(sides) + 1;
   }

   /**The getSides method returns the
       number of sides for the die.
       @return The number of sides for the die.
    */

   public int getSides()
   {
      return sides;
   }

   /**The getValue method returns the
       value of the die.
       @return The value of the die.
    */

   public int getValue()
   {
      return value;
   }
}
public class DiceGame
{
   public static void main(String[]args)
   {
       // Named constants
       final int NUM_SIDES=6;// The number of sides on the die

       // Variables
       int compValue=0;// To hold the computer's dice value
       int userValue=0;// To hold the user's dice value
       int compGames=0;// To hold the number of games won by the computer
       int userGames=0;// To hold the number of games won by the user
       int tiedGames=0;// To hold the number of tied games
       // Create a Die object for the computer.

       //Add codes here to create a computerDie
       Die computerDie = new Die(NUM_SIDES);

       // Create a Die object for the user.
       //Add codes here to create a userDie
       Die userDie = new Die(NUM_SIDES);

       // Play ten rounds of the dice game.
       for(int round=1; round<=10; round++)
       {

       // Get the computer's die value. (use computer object you just created)
       //Add codes here
           compValue = computerDie.getValue();
       // Get the user's die value.(use user object you just created)
       //Add codes here
           userValue = userDie.getValue();

       // Determine the winner of this round.
       if(compValue!=userValue)
       {
       if(compValue>userValue)
       // The computer wins this round.
       compGames++;
       else
       // The user wins this round.
       userGames++;
       }
       else
       // This round has ended in a tie.
       tiedGames++;
       }
       // Display the results.
       //Add codes here to display the results

       System.out.println("Computer...." + compGames);
       System.out.println("User........" + userGames);
       System.out.println("Ties........" + tiedGames);


       // Determine the grand winner.
       //Add code here to determine and display the grand winner
       if(compValue > userValue)
           System.out.println("The Computer is the grand winner");
       else if(compValue > userValue)
           System.out.println("The User is the grand winner");
       else if(compValue == userValue)
           System.out.println("Nobody is the grand winner");
   }
}