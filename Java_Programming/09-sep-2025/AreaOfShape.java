class Triangle
{
    double base, height;
   
    Triangle(double a, double b)
    {
            this.base= a;
            this.height= b;
    }
  
    void setbase(double a)
    {
           this.base= a;
    }
    void setheight(double b)
    {
             this.height= b;
    }

    double getbase()
    {
            return this.base;
     }
     double getheight()
     {
             return this.height;
     }

     void display()
    {
   
            double c= 0.5 * base * height;
            System.out.println("Area of Triangle is: "+c);
     }

}

class Rectangle
{
      double length, breadth;
 
      void setlength(double length)
      {
             this.length = length;
      }
      void setbreadth(double breadth)
      {
             this.breadth= breadth;
      }

      double getlength()
      {
           return this.length;
      }

      double getbreadth()
      {
           return this.breadth;
      }

      Rectangle(double l, double b)
     {
            this.length = l;
            this.breadth = b;
     }
     void display()
     {
              double d= length *breadth;
              System.out.println("Area of Rectangle is: "+d);

     }
}

class Circle
{
   double radius;
  
   void setradius(double r)
   {
           this.radius= r;
   }
   double getradius()
   {
           return this.radius;
   }
   void display()
   {
           double area = 3.14 * radius * radius;
           System.out.println("Area of Circle is: "+area);
   }

   Circle(double r)
   {
          this.radius= r;
   }

}


class Shape
{
   void area(Triangle t)
   {
          double c= 0.5 * t.getbase() * t.getheight();
   }
   void area(Rectangle r)
   {
            double d= r.getlength() * r.getbreadth();
            System.out.println("Area of Rectangle is: "+d);
   }
   void area(Circle c)
   {
               double d = 3.14 * c.getradius() * c.getradius();
              System.out.println("Area of Circle is: "+d);
   }

}

class AreaOfShape
{
  public static void main(String[] args)
   {
     Shape p1 = new Shape();
     Triangle T1= new Triangle(2.6, 6.6);
     T1.display();

     Rectangle R1 = new Rectangle(2.4, 9.9);
     R1.display();

     Circle C1 = new Circle(5.5);
     C1.display();
   }
}
    

    