import java.util.*;
public class GeometricObject implements Comparable{
	int radius, breadth,length;
    String shapeformat;
    double area;
    public GeometricObject(int radius, int b, int l, String shape){
		super();
        this.radius = radius;
        this.breadth = b;
        this.length = l;
        this.shapeformat = shape;
        if(radius > 0){
			area = Math.PI * radius * radius;
        }
        else{
			area = breadth * length;
        }
    }
    public static void max(GeometricObject object1, GeometricObject object2){
		if( object1.compareTo(object2) > 0){
			System.out.println(object1.shapeformat + " is larger than " + object2.shapeformat);
		}
		else if( object1.compareTo(object2) < 0){
			System.out.println(object2.shapeformat + " is larger than " + object1.shapeformat);
        }
        else{
            System.out.println(object1.shapeformat + " is equal to " + object1.shapeformat);
        }
    }
    @Override
    public int compareTo(Object requiredObject) {
		if(this.area > ((GeometricObject)requiredObject).area){
            return 1;
        }
        else if(this.area < ((GeometricObject)requiredObject).area){
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]) {
        GeometricObject firstCircle = new GeometricObject(15, 23,6, "circle 1");
        GeometricObject secondCircle = new GeometricObject(8, -1, 2, "circle 2");
        GeometricObject firstRectangle = new GeometricObject(10, 20, 15, "rectangle 1");
        GeometricObject secondRectangle = new GeometricObject(20, 15, 30, "rectangle 2");
        GeometricObject.max(firstCircle, secondCircle);
        GeometricObject.max(firstRectangle, secondRectangle);
    }
}