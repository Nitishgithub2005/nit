package Polymorphisim;

class Animal {
    String s1 = "Test";
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Dog {

   void makeSound() {
        System.out.println(super.s1);
       System.out.println("Meow"+s1);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal d1 = new Dog();
//        Animal animal2 = new Cat();
//        animal1.makeSound(); // Output: Woof!
//        animal2.makeSound(); // Output: Meow!
        Cat c1 = new Cat();
        d1.makeSound();
        c1.makeSound();
    }
}
