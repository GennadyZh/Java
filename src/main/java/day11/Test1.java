package main.java.day11;

public class Test1 {
    public static void main(String[] args) {
        Werehouse werehouse = new Werehouse();
        Picker picker = new Picker();
        Courier courier = new Courier();
        werehouse.setBalance(999998);
        werehouse.setCountOrder(1499);
        courier.doWork();
        courier.bonus();
        picker.doWork();
        picker.bonus();
        picker.doWork();
        System.out.println("wh balance = " + Werehouse.balance);
        System.out.println("wh orders = " + Werehouse.countOrder);
        System.out.println("picker zp = " + picker.salary);
        System.out.println("cour1 zp = " + courier.salary);
        System.out.println("заказов у picker - " + werehouse.getCountOrder());
        Werehouse werehouse2 = new Werehouse();
        werehouse2.setCountOrder(0);
        Picker picker2 = new Picker();
        Courier courier2 = new Courier();
        courier2.doWork();
        courier2.bonus();
        picker2.bonus();
        while (picker2.doWork() == 10)
            picker2.doWork();

        System.out.println("зп второго курьера - " + picker2.salary);
    }
}