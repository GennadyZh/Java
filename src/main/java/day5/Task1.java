package day5;

public class Task1 {
    public static void main(String[] args) {
        Car vw = new Car();
        vw.setModel("Scirocco");
        vw.setColor("Candy white");
        vw.setAge(2013);
        System.out.println("Volkswagen " + vw.getModel() + ", color - " + vw.getColor() + ", year of issue - " + vw.getAge());
    }
}

class Car{
    private int age;
    private String color;
    private String model;

    public void setAge (int ageOut){
        age = ageOut;
    }
    public int getAge(){
        return age;
    }

    public void setColor (String colorAuto){
        color = colorAuto;
    }
    public String getColor(){
        return color;
    }

    public void setModel (String modelAuto){
        model = modelAuto;
    }
    public String getModel(){
        return model;
    }

}
