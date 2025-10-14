package bin.JavaProject;

class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    // Method overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OverRideInJava
 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // parent class object
        Animal myDog = new Dog();       // parent reference, child object

        myAnimal.sound();  // Calls Animal's method
        myDog.sound();     // Calls Dog's overridden method
    }
}
