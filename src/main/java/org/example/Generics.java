package org.example;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        //////////////// Java 5 /////////////////////
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = (String) animals.get(2);

        /////////////// Generics ///////////////////
        List<String> animal2 = new ArrayList<String>();
        animal2.add("cat");
        animal2.add("dog");
        animal2.add("frog");
        String animals2 = animal2.get(2);

        /////////////// Java 7 /////////////////////
        List<String> animals3 = new ArrayList<>();
    }
}
