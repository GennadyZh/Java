package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[100];
        Random random = new Random();
        for(int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);
        System.out.println(Arrays.toString(array));

        int max = 0;
        for (int i: array){
            if (max < i)
                max = i;
            }
        System.out.println("максимальное: " + max);

        int min = 10000;
        for (int i: array){
            if (min > i)
                min = i;
        }
        System.out.println("мин: " + min);

        int ten = 0;
        for (int i: array) {
            if (i % 10 == 0)
            ten++;
        }
        System.out.println("оканчивающихся на 0: " + ten);

        int tenten = 0;
        for (int i : array) {
            if (i % 10 == 0)
                tenten = tenten + i;
        }
        System.out.println(tenten);

    }
}
