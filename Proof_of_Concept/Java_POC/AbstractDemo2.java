package keywordpoc;

//Abstract class
abstract class Shape {
 abstract void area(); // abstract method
}

//Subclass 1
class Circle extends Shape {
 double radius;
 Circle(double radius) {
     this.radius = radius;
 }

 @Override
 void area() {
     System.out.println("Area of circle = " + (3.14 * radius * radius));
 }
}

//Subclass 2
class Rectangle extends Shape {
 double length, width;
 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 void area() {
     System.out.println("Area of rectangle = " + (length * width));
 }
}

public class AbstractDemo2 {
 public static void main(String[] args) {
     // Polymorphic references
     Shape s1 = new Circle(5);
     Shape s2 = new Rectangle(4, 6);

     s1.area(); // Calls Circle's area
     s2.area(); // Calls Rectangle's area
 }
}

