
class Shape{
	
	int noOfSides;
	String shape;
	
	Shape() {
		super();
		this.noOfSides=0;
		this.shape="not given";
	}
	Shape(int noOfSides, String shape) {
		super();
		this.noOfSides = noOfSides;
		this.shape = shape;
	}
	int getNoOfSides() {
		return noOfSides;
	}
	void setNoOfSides(int noOfSides) {
		this.noOfSides = noOfSides;
	}
	String getShape() {
		return shape;
	}
	void setShape(String shape) {
		this.shape = shape;
	}
	
	void display() {
		System.out.println("No Of Sides: "+this.noOfSides);
		System.out.println("Shape: "+this.shape);
	}
    
	void draw()
	{
		System.out.println("Shape is drawn.");
	}
}

class Rectangle extends Shape
{
	int length;
	int breadth;
	
	Rectangle() {
		super();
		this.length = 8;
		this.breadth= 7;
	}

	Rectangle(int noOfSides, String shape, int length, int breadth) {
		super(noOfSides, shape);
		this.length = length;
		this.breadth = breadth;
	}

	int getLength() {
		return length;
	}

	void setLength(int length) {
		this.length = length;
	}

	int getBreadth() {
		return breadth;
	}

	void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	void display() {
		super.display();
		System.out.println("length: "+ this.length);
		System.out.println("breadth: "+this.breadth);
		
	}
	
	void draw()
	{
		System.out.println("Shape Rectangle is drawn.");
	}
	
}

class Circle extends Shape
{
	int radius;

	Circle() {
		super();
		this.radius= 5;
	}

	Circle(int noOfSides, String shape, int radius) {
		super(noOfSides, shape);
		this.radius = radius;
	}

	int getRadius() {
		return radius;
	}

	void setRadius(int radius) {
		this.radius = radius;
	}
	
	void display() {
		super.display();
		System.out.println("Radius: "+ this.radius);
	}
	
	void draw()
	{
		System.out.println("Shape Circle is drawn.");
	}
	

	
}

class Triangle extends Shape
{
	int base;
	int height;
	
	Triangle(){
		super();
		this.base= 10;
		this.height= 5;
	}
	
	Triangle(int noOfSides, String shape, int base, int height){
		super(noOfSides, shape);
		this.base= base;
		this.height= height;
	}

	int getBase() {
		return base;
	}

	void setBase(int base) {
		this.base = base;
	}

	int getHeight() {
		return height;
	}

	void setHeight(int height) {
		this.height = height;
	}
	
	void display() {
		super.display();
		System.out.println("Base: "+this.base);
		System.out.println("Height: "+ this.height);
	}
	
	void draw()
	{
		System.out.println("Shape Triangle is drawn.");
	}
	
}



class TestShape {

	public static void main(String[] args) {
		
		Shape S1 =new Shape();
		S1.display();
		
		System.out.println();
		
		S1 = new Rectangle(4, "Rectangle", 8, 8);     // Upcasting
		S1.display();
		S1.draw();
		
		System.out.println();
		
		S1= new Triangle(3, "Triangle", 4, 5);      // Upcasting
		S1.display();
		S1.draw();
		
		System.out.println();
		
		S1 = new Circle(0, "Circle", 4);           // Upcasting
		S1.display();
		S1.draw();
	}

}
