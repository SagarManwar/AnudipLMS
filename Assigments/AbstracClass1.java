package Assigments;

//Abstract class Shape
abstract class Shape {
 // Abstract method to calculate area
 public abstract double calculateArea();
}

//Subclass Circle
class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Subclass Rectangle
class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public double calculateArea() {
     return length * width;
 }
}

public class AbstracClass1 {
 public static void main(String[] args) {
     // Create an object of the Circle class
     Circle circle = new Circle(5.0);

     // Calculate and print the area of the circle
     System.out.println("Area of Circle: " + circle.calculateArea());

     // Create an object of the Rectangle class
     Rectangle rectangle = new Rectangle(4.0, 6.0);

     // Calculate and print the area of the rectangle
     System.out.println("Area of Rectangle: " + rectangle.calculateArea());
 }
}
