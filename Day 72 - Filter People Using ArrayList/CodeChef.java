/*
------------------------------------------------------------
🧩 Practice Question
------------------------------------------------------------

Write a program to do the following:

1. Create an ArrayList to store objects representing people.
2. Each person object should have a name (String) and an age (int).
3. Add 3 people to the ArrayList.
4. Print out the names of all people in the ArrayList who are over the age of 25.

------------------------------------------------------------
*/

// Update the '_' to solve the problem
import java.util.*;
class Person {
    String name;
    int age;

    public Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class CodeChef {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 20)); 
        people.add(new Person("Charlie", 40));
    
        System.out.println("People over the age of 25:");
        for (Person person : people) {
            
            if (person.getAge() > 25) {
                System.out.println(person.getName());
            }
        }
    }
}