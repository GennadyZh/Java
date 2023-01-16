package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

import static java.lang.Integer.sum;


public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mass = new int[n];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++)
            mass[i] = random.nextInt(10);
        System.out.println(Arrays.toString(mass));

        System.out.println(mass.length);
        int counter8 = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 8)
                counter8++;
        }
        System.out.println("больше 8 " + counter8);

        int counter1 = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1)
            counter1++;
        }
        System.out.println("равно 1 " + counter1);

        int counterEven = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0)
                counterEven++;
        }
        System.out.println("четных " + counterEven);

        int counterOdd = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 != 0)
                counterOdd++;
        }
        System.out.println("нечетных " + counterOdd);

        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i];
        }
            System.out.println("сумма " + sum);
        }
    }


