package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Zoom {
    public static void main(String[] args) {
        String [] array = {"Андрей", "Сережа Гиндия", "Алина", "Сережа Ильиных", "Александр I", "Александр II","Александр III", "Гена","Слава","Катя","Паша","Вова",};
        Random random = new Random();
        for (int i = 0; i < array.length - 1; i++){
            int index = random.nextInt(i + 1, array.length);
            String temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
