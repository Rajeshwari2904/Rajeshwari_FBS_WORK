package keywordpoc;

//Abstract class
abstract class Animal {             // Abstract method (no body)
 
  abstract void sound();

  
   void eat() {                         // Regular method
     System.out.println("Animals eat food.");
   }
}

//Concrete subclass
class Dog extends Animal {
 // Must override abstract method
 @Override
 void sound() {
     System.out.println("Dog barks!");
 }
}

public class AbstractDemo {
 public static void main(String[] args) {
     // Animal a = new Animal(); // ❌ Cannot instantiate abstract class

     Dog d = new Dog();
     d.eat();   // inherited concrete method
     d.sound(); // implemented abstract method
 }
}
