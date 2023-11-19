// Superclass (base class)
class Animal {
    void eat() {
        System.out.println("The animal eats food.");
    }
}

// Subclass (derived class)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class SimpleInheritanceExample {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog();

        // Call methods from the superclass and subclass
        dog.eat();  // Inherited from Animal
        dog.bark(); // Specific to Dog
    }
}
