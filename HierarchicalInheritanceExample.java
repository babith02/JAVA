// Parent class (base class)
class Animal {
    void eat() {
        System.out.println("The animal eats food.");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        // Create objects of child classes
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Call methods from the parent class
        dog.eat();
        cat.eat();

        // Call methods specific to each child class
        dog.bark();
        cat.meow();
    }
}
