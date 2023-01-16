package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike harley = new Motorbike(12,"harley","blue");
        System.out.println(harley.getModel() + "\n" + harley.getColor() + "\n" + harley.getAge());

    }
}

class Motorbike {
        public Motorbike(int age, String model, String color) {
            this.age = age;
            this.model = model;
            this.color = color;
        }

        private int age;
        private String model;
        private String color;

        public String getModel() {
            return model;
        }
        public int getAge(){
            return age;
        }
        public String getColor(){
            return color;
        }
    }
