package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа в консоль");

        while (true) {
            double a = scanner.nextDouble(); // если nextDouble обьявить перед циклом, то цикл будет бегать бесконечно
            double b = scanner.nextDouble();
            System.out.println(a / b);
            if (b == 0)
                break;

        }
    }
}

