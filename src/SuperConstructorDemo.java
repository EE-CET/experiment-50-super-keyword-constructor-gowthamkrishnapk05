class Person {
    // TODO: Create a constructor Person()
    // Print "Person class"
    Person()
    {
        System.out.println("Person class");
    }
}

class Student extends Person {
    // TODO: Create a constructor Student()
    // Call super() first (this is implicit, but explicit is good practice)
    // Print "Student class"
    
    Student()
    {
        super();
        System.out.println("Student class");
    }
}

public class SuperConstructorDemo {
    public static void main(String[] args) {
        // TODO: Create an object of Student class
        // Creating the object will automatically invoke constructors
        Person p = new Person();
        Student s = new Student();
    }
}
