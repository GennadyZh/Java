package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(1993, "honda", "blue");
        Car car = new Car();
        car.setColor("green");
        car.setModel("TT");
        car.setAge(2013);
        System.out.println(car.yearDifference(2010));
        System.out.println(motorbike.yearDifference(2020));
    }
}
