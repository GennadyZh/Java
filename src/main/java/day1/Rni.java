package day1;

import java.util.Random;

public class Rni {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 2;
        int max = 5;
        int diff = max - min;
        int grade = random.nextInt(min, max + 1);

        System.out.println(grade);
    }


}
