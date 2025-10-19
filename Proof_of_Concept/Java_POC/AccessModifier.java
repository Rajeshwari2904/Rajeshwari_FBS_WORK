package p1;


class Person {
    
    private String name;          // accessible only within this class

    int age;                    // default → accessible within the same package
  
    protected String city;      // protected → accessible within same package & subclasses

    public String country;       // public → accessible from anywhere

    
    public Person(String name, int age, String city, String country) {    // constructor
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    private void displayPrivateInfo() {
        System.out.println("Private method accessed within the class!");
    }

    
    public void showDetails() {         // public method calling private one
        displayPrivateInfo();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Person p = new Person("Aadi", 22, "Pune", "India");

        p.showDetails();        // Accessing public method

         // System.out.println(p.name);   //  private: not accessible
        System.out.println("Age: " + p.age);        // default access
        System.out.println("City: " + p.city);      //  protected access (same package)
        System.out.println("Country: " + p.country); //  public access
    }
}
