package main.java.org.example;

public class Break_Continue {
    public static void main (String[] args) {
        int i = 0;
        while (true) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("мы вышли из цикла");
    }
}
