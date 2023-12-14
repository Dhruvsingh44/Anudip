class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        // Create objects of each class
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Demonstrate method overriding
        animal.makeSound(); // The animal makes a sound.
        dog.makeSound();    // The dog barks.
        cat.makeSound();    // The cat meows.
    }
}
