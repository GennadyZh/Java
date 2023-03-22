package main.java.others;

import java.util.Scanner;

public class Zp {
    int month;
    int payPerYear;
    int salary;
    public String schetMonth() {
        Scanner mn = new Scanner(System.in);
        System.out.println("Введите кол-во отработанных месяцев:");
        int month = mn.nextInt();
        if (month < 4) {
            System.out.println("Отработал меньше 4-х месяцев - премию не получишь");
        } else if (month > 12) {
            System.out.println("Куда полез, месяцев 12");
        } else return null;

        Scanner pay = new Scanner(System.in);
        System.out.println("Введите деньгу заработтанную за весь год:");
        int payPerYear = pay.nextInt();
        if (payPerYear < 0) {
            System.out.println("Зп не может быть отрицательной");
        }

        double bonus;
        bonus = payPerYear / month;
        System.out.println("13-я зп = " + bonus);
        return null;
    }
    public void schetPay(){
        Scanner pay = new Scanner(System.in);
        System.out.println("Введите деньгу заработтанную за весь год:");
        int payPerYear = pay.nextInt();
        if (payPerYear < 0) {
            System.out.println("Зп не может быть отрицательной");
        }
    }

   /* public void setMonth(Scanner month) {
        this.month = month;
        if (month < 4) {
            System.out.println("Отработал меньше 4-х месяцев - премию не получишь");
        } else if (month > 12) {
            System.out.println("Куда полез, месяцев 12");
        }
    }

    public void bonus() {

    }*/
}

