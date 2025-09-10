class Product
{
  int id, quantity;
  String name;
  double price;
 
  void setid(int id)
  {
    this.id= id;
  }
  void setname(String str)
  {
    this.name= str;
  }
  void setquantity(int q)
  {
     this.quantity= q;
  }
  void setprice(double p)
  {
     this.price= p;
  }
  int getid()
  {
    return this.id;
  }
  String getname()
  {
    return this.name;
  }
  int getquantity()
  {
    return this.quantity;
  }
  double getprice()
  {
     return this.price;
  }
  void display()
  {
    System.out.println("Product Id: "+ this.id);
    System.out.println("Product Name: "+ this.name);
    System.out.println("Product Quantity: "+ this.quantity);
    System.out.println("Product Price: "+ this.price);
   }
}

class TestProduct
{
  public static void main(String[] args)
  {
    Product p = new Product();
    p.setid(1);
    p.setname("Laptop");
    p.setquantity(2);
    p.setprice(55000);
    p.display();
  }
}
   
    






 