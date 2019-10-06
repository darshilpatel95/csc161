import java.util.*;
public class GeometricObjectOne implements Comparable{

     //Declare radius , breadth,length as type of integer

    int radius, breadth,length;

    String shapeformat;



    double area;

   //Implement parameterized constructor

    public GeometricObjectOne(int radius, int b, int l, String shape) {

        super();

        this.radius = radius;

        this.breadth = b;

        this.length = l;

        this.shapeformat = shape;

        //check radius is greater than 0

        if(radius > 0)

        {

        //calculate the area of circle

            area = Math.PI * radius * radius;

        }

        else

        {

        //calculate the rectangle ares

            area = breadth * length;

        }

    }

    //Implementation of max method

    public static void max(GeometricObject object1, GeometricObject object2)

    {

    //check whether object1.compareTo(object2) is

    //greater than 0 or not

        if( object1.compareTo(object2) > 0)

        {

        //Display statement

            System.out.println(object1.shapeformat + " is larger than " + object2.shapeformat);

        }

        //check whether object1.compareTo(object2) is

    //less than 0 or not

        else if( object1.compareTo(object2) < 0)

        {

        //Display statement

            System.out.println(object2.shapeformat + " is larger than " + object1.shapeformat);

        }

        else

        {

        //Display statement

            System.out.println(object1.shapeformat + " is equal to " + object1.shapeformat);

        }

    }



    @Override

    //Implementation of compareTo method

    public int compareTo(Object requiredObject) {

    //check whether this.area is greater than the

    //(GeometricObject)requiredObject).area or not

        if(this.area > ((GeometricObject)requiredObject).area)

        {

            return 1;

        }

        //check whether this.area is less than the

    //(GeometricObject)requiredObject).area or not

        else if(this.area < ((GeometricObject)requiredObject).area)

        {

            return -1;

        }

        else

        {

            return 0;

        }

    }

    //Implementation of main method

    public static void main(String args[]) {

    //Create an object for circle1

        GeometricObject firstCircle = new GeometricObject(15, 23,6, "circle 1");



    //Create an object for circle2

        GeometricObject secondCircle = new GeometricObject(8, -1, 2, "circle 2");



    //Create an object for rectangle1

        GeometricObject firstRectangle = new GeometricObject(10, 20, 15, "rectangle 1");



    //Create an object for rectangle2

        GeometricObject secondRectangle = new GeometricObject(20, 15, 30, "rectangle 2");



        //call max method

        GeometricObject.max(firstCircle, secondCircle);



        //call max method

        GeometricObject.max(firstRectangle, secondRectangle);

    }

}