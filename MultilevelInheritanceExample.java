// Grandparent class
class Animal {
    void eat() {
        System.out.println("The animal eats food.");
    }
}

// Parent class (inherits from Animal)
class Mammal extends Animal {
    void sleep() {
        System.out.println("The mammal sleeps.");
    }
}

// Child class (inherits from Mammal)
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        // Create an object of the child class Dog
        Dog dog = new Dog();

        // Call methods from the parent and grandparent classes
        dog.eat();   // Inherited from Animal
        dog.sleep(); // Inherited from Mammal

        // Call method specific to the Dog class
        dog.bark();
    }
}
