// One parent Multiple Childrens
class Shape {
    void draw() {
        System.out.println("Drawing shape...");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of circle = πr²");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of rectangle = l × b");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.draw();
        c.area();

        r.draw();
        r.area();
    }
}
