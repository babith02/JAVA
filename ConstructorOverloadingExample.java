class Student {
    String name;
    int age;
    
    // Constructor with no parameters (default constructor)
    public Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one parameter (name)
    public Student(String studentName) {
        name = studentName;
        age = 0; // Default age
    }

    // Constructor with two parameters (name and age)
    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        Student student1 = new Student();                    // Default constructor
        Student student2 = new Student("Alice");             // Constructor with name
        Student student3 = new Student("Bob", 21);           // Constructor with name and age

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}
