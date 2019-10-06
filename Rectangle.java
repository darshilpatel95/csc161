
 class Rectangle {
 
    private double width = 1;
    private double height = 1;
 
    public Rectangle() {
        
    }
    
    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }
    
    public double getArea() {
        return width * height;
    }
    
    public double getPerimeter() {
        return 2 * (width + height);
    }
    
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        System.out.println("The area of a 4.0 x 40.0 Rectangle is " + rectangle1.getArea());
        System.out.println("The perimeter of a 4.0 x 40.0 Rectangle is " + rectangle1.getPerimeter());
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println("The area of a 3.5 x 35.9 Rectangle is " + rectangle2.getArea());
        System.out.println("The perimeter of a 3.5 x 35.9 Rectangle is " + rectangle2.getPerimeter());
    }
}