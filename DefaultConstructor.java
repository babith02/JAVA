class Default_constructor {
    String name;
    int age;

    public Default_constructor() {
        name = "John Doe";  // Default name
        age = 30;          // Default age
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Default_constructor person = new Default_constructor();
        person.displayInfo();
    }
}
