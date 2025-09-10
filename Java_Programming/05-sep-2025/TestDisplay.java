class Distance
{
  int feet;
  float inches;
  
  void setfeet(int f)
  {
    this.feet= f;
  }
  void setinches(float inches)
  {
    this.inches;
  }
  int getfeet()
  {
    return this.feet;
  }
  float getinches()
  {
     return this.inches;
  }
   void display()
  {
    System.out.println("Feet--> "+ this.feet);
    System.out.println("inches--> "+ this.inches);
  }

}

class TestDistance
{
  public static void main(String[] args)
  {
   Distance d = new Distance();
   d.setfeet(5);
   d.setinches(6.8);
   d.display();
  }
}


