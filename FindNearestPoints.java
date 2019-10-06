// Darshil Patel
//CSC 162

public class FindNearestPoints
{
  public static void main(String[] args)
  {
    double[][] points = {{-1,0, 3}, {-1,-1, -1}, {4,1, 1},
      {2, 0.5,9}, {3.5,2, -1}, {3,1.5, 3}, {-1.5,4, 2}, {5.5,4, -0.5}};
    int p1 = 0, p2 = 1;
    double shortestDistances = distance(points[p1][0], points[p1][1],
      points[p2][0], points[p2][1]);
    for (int i = 0; i < points.length; i++)
    {
      for (int j = i + 1; j < points.length; j++)
      {
        double distance = distance(points[i][0], points[i][1],
          points[j][0], points[j][1]);
        if (shortestDistances > distance)
        {
          p1 = i;
          p2 = j;
          shortestDistances = distance;
        }
      }
    }
    System.out.println("The closest two point are"+"("+points[p1][0]+","+points[p1][1]+","+points[p1][2]+")"+"and"+"("+points[p2][0]+","+points[p2][1]+","+points[p2][2]+")");
  }
  public static double distance(
      double x1, double y1, double x2, double y2)
      {
    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
  }
}