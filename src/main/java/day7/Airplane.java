package day7;

public class Airplane {
    public static void main(String[] args) {
        Airplane mig = new Airplane("Mikoyan", 1990, 220, 100);
        mig.setYear(13);
        mig.setLength(123);
        mig.fillUp(33);
        mig.setFuel(3000);
        mig.fillUp(33);
        mig.info();

    }


    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    private String producer;
    private int year;

    public int getLength() {
        return length;
    }

    private int length;
    private int weight;
    private int fuel;

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel(int fuel) {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", " + "год выпуска: " + year + ", " + "длина " + length
                + ", " + "кол-во топлива в баке: " + fuel);
    }

    public void fillUp(int howManyFuel) {
        fuel += howManyFuel;
    }

    public static void compareAirplanes (Airplane su, Airplane boeing){
        if (su.getLength() > boeing.getLength()){
            System.out.println("первый длиннее");
        } else if (su.getLength() < boeing.getLength()) {
            System.out.println("второй длинее");
        } else {
            System.out.println("одинаковые");
        }
    }

}
