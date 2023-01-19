package day6;

public class Airplane {
    public static void main(String[] args) {
        Airplane mig = new Airplane("Mikoyan",1990,220,100);
        mig.setYear(13);
        mig.setLength(123);
        mig.getFuel(30);
        Airplane.info();
        System.out.println(Airplane.fillUp(5));
    }


    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public static String producer;
    public static int year;
    public static int length;
    public static int weight;
    public static int fuel;

    public void setYear(int year){
        this.year = year;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getFuel(int fuel){
        return fuel;
    }
    public static void info(){
        System.out.println("Изготовитель: " + producer + ", " + "год выпуска: " + year + ", " +"длина " + length + ", " + "кол-во топлива в баке: " + fuel);
    }
    public static int fillUp(int howManyFuel){
        return (fuel - howManyFuel);
    }

}
