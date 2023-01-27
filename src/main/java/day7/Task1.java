package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("mik",1999,500,1000);
        Airplane su = new Airplane("sukhoy",2001,500,600);
        Airplane.compareAirplanes(su, boeing);
    }
}
