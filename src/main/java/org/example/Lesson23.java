package org.example;

public class Lesson23 {
    public static void main(String[] args) {
        System.out.printf("%fThis is a string, %s %d\n",11.3, "nice!", 123);

        System.out.printf("String %10d \n", 5); //%d либо %s - на это мест овстанет переменная типа digit или стринг
        System.out.printf("String %10d\n", 123456);// %10d означает тчо число будет шириной в 10 символов
        System.out.printf("String %-10d\n", 123456789);//минус - числа теперь идут слева, а не справа
        System.out.printf("String %10d\n", 123456789);
        System.out.printf("String %.2f\n", 4.73984579834);
    }
}
