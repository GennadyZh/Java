package org.example.Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        animal1.sleep();
        person1.seyHello();
        animal1.showInfo();
        person1.showInfo();
        Info info1 = new Animal(1);
        Info info2 = new Person("adsda");
        info1.showInfo();
        info2.showInfo();
        outputInfo(animal1);
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
