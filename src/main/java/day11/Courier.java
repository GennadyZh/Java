package main.java.day11;

public class Courier implements Worker {
    int salary = 100;

    public int getSalary(){
        return salary;
    }

    public int doWork(){
        Werehouse.balance = Werehouse.balance+1000;

        return 0;
    }
    public int bonus(){
        if (Werehouse.balance > 999999){
            salary = salary * 2;
        }
        return 0;
    }

}
