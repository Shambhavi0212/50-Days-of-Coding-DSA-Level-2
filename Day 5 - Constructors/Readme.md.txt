Day 5/30 :

A constructor in Java is a special method that runs automatically when an object is created. Its main purpose is to initialize (assign initial values to) the object’s attributes.

Key points about constructors:

1.The constructor’s name must match the class name exactly.
2.A constructor does not have a return type (not even void).
3.The constructor is automatically called when you create an object using new.
4.There are two types:
     a.Default constructor (no parameters)
     b.Parameterized constructor (accepts parameters)

Example 1: Default constructor :
public class Main {
  int x;

  // Default constructor
  public Main() {
    x=15; 
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Calls the constructor
    System.out.println(myObj.x); // Outputs: 15
  }
}

In this example, the constructor sets x to 15 automatically when we create the object.

Example 2: Constructor with one parameter
public class Main {
  int x;

  // Constructor with a parameter
  public Main(int y) {
    x=y; // Initializing x with y..
  }

  public static void main(String[] args) {
    Main myObj = new Main(100); // Pass 100 to constructor
    System.out.println(myObj.x); // Outputs: 100
  }
}
we pass a value to the constructor when creating the object. The constructor uses that value to set x

Example 3: Constructor with multiple parameters :
public class Main {
  int modelYear;
  String modelName;

  // Constructor with two parameters
  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Main myCar = new Main(2020, "Tesla");
    System.out.println(myCar.modelYear + " " + myCar.modelName); // Outputs: 2020 Tesla
  }
}the constructor initializes both modelYear and modelName using the values provided during object creation.

Important notes
1.If you do not write a constructor, Java automatically provides a default constructor that does nothing except create the object.
2.If you define any constructor (even one), Java does not provide the default constructor anymore.
3.Constructors can be overloaded, meaning you can have multiple constructors with different parameter lists.
Difference between constructor and method
Feature	              Constructor	                    Method
Name	              Same as class name	            Any valid method name
Return type	        None	                            Must have a return type (can be void)
When called	      Automatically when object
                         is created	                    Manually when you call it
Purpose	               Initialize object attributes	    Perform specific actions or operations






