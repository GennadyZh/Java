package day6;

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
