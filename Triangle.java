public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    public Triangle() {
        this(1, 1, 1);
    }
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side2;
    }
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public String toString() {
        return (" Triangle: Side 1 = " + side1 + " Side 2 = " + side2 + " Side 3 = " + side3);
    }
}
import java.util.*;
public class TestTriangle  {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides of the Triangle");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("Enter the color of the Triangle");
        String color = input.next();
        System.out.println("Is the Triangle filled? Reply with 'True' or 'False' ");
        boolean filled = Boolean.parseBoolean(input.next());
        Triangle triangle = new Triangle(color, filled, side1, side2, side3);
        System.out.println("The Triangle Sides are \n side 1: "+ triangle.getSide1() + "\n Side 2: " + triangle.getSide2() + "\n Side 3: " + triangle.getSide3());
        System.out.println("The Triangle's Area is " + triangle.getArea());
        System.out.println("The Triangle's Perimeter is " + triangle.getPerimeter());
        System.out.println("The Triangle's Color is " + triangle.getColor());
        System.out.println("Is the Triangle filled? " + triangle.isFilled());
    }
}