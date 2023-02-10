package org.example.polimorph;

public class Polimorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        Cat cat = new Cat();
        test(animal);
        test(cat);
        test(dog);
    }

    public static void test(Animal animal){
        animal.eat();
    }
}
