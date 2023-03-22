package main.java.day11;

public class Picker implements Worker {
    int salary = 80;

    public int getSalary(){
        return salary;

    }
    public int doWork(){
        Werehouse.countOrder++;
        return 0;
    }
    public int bonus(){
        if (Werehouse.countOrder / 1500 == 1){
            salary = salary * 3;
        }
        return 0;
    }

}
