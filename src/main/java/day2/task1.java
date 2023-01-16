package day2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите этаж");
            int a = scanner.nextInt();
            if (a >= 1 && a <= 4) {
                System.out.println("малоэтажный дом");
            } if (a >= 5 && a <= 8) {
                System.out.println("среднеэтажный дом");
            } if (a >= 9) {
            System.out.println("многоэтажный дом");
            } if (a < 0 ) {
            System.out.println("Ошибка ввода");
            }
    }
}
