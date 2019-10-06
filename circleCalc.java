//darshil patel
//csc 162


import javax.swing.JOptionPane;
class circleCalc
{
public static void main(String[] args)
{
double radius;
double area;
double circumference;

int dialogType = JOptionPane.PLAIN_MESSAGE;

String input = JOptionPane.showInputDialog(null, "Enter the  radius ", "Circle Area Input", dialogType);

radius = Double.parseDouble(input);
area = Math.PI * Math.pow(radius, 2);
circumference=2*Math.PI*radius;

String message = "Area of  the Circle is : " + area+" " +"Circumference of the Circle is: "+ circumference;
String title = "Area of the circle and Circumference is : ";
JOptionPane.showMessageDialog(null, message,
title, dialogType);
}
}