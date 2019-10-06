import java.util.Scanner;
public class Exercise_08
{
public static void main(String[] args)
{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        System.out.println("Enter values into the matrix below: ");
        int[][] m = new int[rows][columns];

        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++) m[i][j] = input.nextInt();
        System.out.println(isConsecutiveFour(m));
    }
    public static boolean isConsecutiveFour(int[][] values)
    {
        for (int i = 0; i < values.length; i++)
        {
            int current = values[i][0];
            int consecutiveCount = 0;

            for (int j = 0; j < values[i].length; j++)
            {

                if (values[i][j] == current)
                {
                    consecutiveCount++;
                    if (consecutiveCount == 4)
                    return true;
                }
                else
                {
                    current = values[i][j];
                    consecutiveCount = 1;
                }
            }
        }
        for (int j = 0; j < values[0].length; j++)
        {
            int consecutiveCount = 0;
            int current = values[0][j];

            for (int i = 0; i < values.length; i++)
            {

                if (values[i][j] == current)
                {
                    consecutiveCount++;
                    if (consecutiveCount == 4)
                    return true;
                }
                else
                {
                    current = values[i][j];
                    consecutiveCount = 1;
                }
            }
        }
        for (int i = values.length - 1; i > 0; i--)
        {
            int y = i;
            int x = 0;
            int consecutive = 0;
            int current = values[y][x];

            while (y >= 0)
            {
                System.out.println("y = " + y + " x = " + x);
                if (values[y][x] == current)
                {
                    consecutive++;
                    if (consecutive == 4)
                    return true;
                }
                else
                {
                    consecutive = 1;
                    current = values[y][x];
                }
                x++;
                y--;
            }
        }
        for (int j = 0; j < values[0].length; j++)
        {
            int y = values.length - 1;
            int x = j;
            int consecutive = 0;
            int current = values[y][x];

            while (x < values[0].length && y >= 0)
            {
                System.out.println("y = " + y + " x = " + x);
                if (values[y][x] == current)
                {
                    consecutive++;
                    if (consecutive == 4)
                    return true;
                }
                else
                {
                    consecutive = 1;
                    current = values[y][x];
                }
                x++;
                y--;
            }
        }
        for (int j = values[0].length - 1; j > 0; j--)
        {

            int x = j;
            int y = values.length - 1;
            int current = values[y][x];
            int consecutiveCount = 0;

            while (x >= 0 && y >= 0)
            {

                if (values[y][x] == current)
                {
                    consecutiveCount++;
                    if (consecutiveCount == 4)
                    return true;
                }
                else
                {
                    consecutiveCount = 1;
                    current = values[y][x];
                }

                x--;
                y--;
            }
        }
        for (int row = 1 ; row < values.length; row++)
        {
            int x = values[0].length - 1;
            int y = row;
            int consecutive = 0;
            int current = values[y][x];

            while (y >= 0)
            {
                System.out.println("y = " + y + " x = " + x);
                if (values[y][x] == current)
                {
                    consecutive++;
                    if (consecutive == 4)
                    return true;
                }
                else
                {
                    consecutive = 1;
                    current = values[y][x];
                }
                x--;
                y--;
            }
        }
        return false;
    }
}



/* we jabe to make a program that will see if we have 4 eqaul number going in different directions, this is similar to the board game
that uses little circular disc. we wll have to build a table using arrays to makr this happen, we have to then use for loops to test out
if the contiion is true ot not
*/

