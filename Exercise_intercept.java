// Darshil Patel
// CSC 162
import java.util.Scanner;
public class Exercise_intercept
{
    static final int X = 0;
    static final int Y = 1;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] points = new double[4][2];
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length; j++)
                points[i][j] = input.nextDouble();
        double[] point = getIntersectingPoint(points);
        if (point == null)
        {
            System.out.println("The two lines are parallel");
        }
        else
        {
            System.out.println("x = " + point[0] + " and y = " + point[1]);
        }
    }
    public static double[] getIntersectingPoint(double[][] points)
    {
        double a = points[0][Y] - points[1][Y];   // y1 - y2
        double b = -(points[0][X] - points[1][X]); // -(x1 - x2)
        double c = points[2][Y] - points[3][Y]; // y3 - y4
        double d = -(points[2][X] - points[3][X]); // -(x3 - x4)
        // (y1 - y2) * x1 - (x1 - x2) * y1
        double e = (points[0][Y] - points[1][Y]) * points[0][X] - (points[0][X] - points[1][X]) * points[0][Y];
        // (y3 - y4) * x3 - (x3 - x4) * y3
        double f = (points[2][Y] - points[3][Y]) * points[2][X] - (points[2][X] - points[3][X]) * points[2][Y];
        double ab_Minus_bc = a * d - b * c;
        if (ab_Minus_bc == 0) return null;
        double[] point = new double[2];
        point[X] = (e * d - b * f) / ab_Minus_bc;
        point[Y] = (a * f - e * c) / ab_Minus_bc;
        return point;
    }
}