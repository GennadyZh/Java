package main.java.others;

import java.util.Scanner;

public class Zp {
    int payPerYear;
    int salary;
    boolean success = false;

    public void schetMonth() {

        do {
            System.out.println("Введите кол-во отработанных месяцев:");
            Scanner mn = new Scanner(System.in);
            int month = mn.nextInt();
            if (month < 4) {
                success = false;
                System.out.println("Отработал меньше 4-х месяцев - премию не получишь" + mn);
            } else if (month > 12) {
                success = false;
                System.out.println("Куда полез, месяцев 12");
            } else success = true;
        }
        while (!success);

        Scanner pay = new Scanner(System.in);
        System.out.println("Введите деньгу заработанную за весь год:");
        System.out.println(123);
        int payPerYear = pay.nextInt();
        if (payPerYear < 0) {
            System.out.println("Зп не может быть отрицательной");
        } else System.out.println("13 зп - " );
    }
}
    /*
    public void pay() {
        Scanner pay = new Scanner(System.in);
        System.out.println("Введите деньгу заработтанную за весь год:");
        int payPerYear = pay.nextInt();
        if (payPerYear < 0) {
            System.out.println("Зп не может быть отрицательной");
        } else System.out.println("123 зп - " + pay.nextInt() / );

    }
}*/
    /*public void schetPay() {
        Scanner pay = new Scanner(System.in);
        System.out.println("Введите деньгу заработтанную за весь год:");
        int payPerYear = pay.nextInt();
        if (payPerYear < 0) {
            System.out.println("Зп не может быть отрицательной");
        }
    }
}*/
   /* public void setMonth(Scanner month) {
        this.month = month;
        if (month < 4) {
            System.out.println("Отработал меньше 4-х месяцев - премию не получишь");
        } else if (month > 12) {
            System.out.println("Куда полез, месяцев 12");
        }
    }

    public void bonus() {

    }
}
*/
