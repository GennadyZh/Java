package org.example;

public class Static {
    public static void main(String[] args) {
        Humantwo h1 = new Humantwo("Bob", 20);
        Humantwo h2 = new Humantwo("Tom", 40);
        Humantwo.description = "Nice";
        h1.getAllFields();
        h2.getAllFields();
        Humantwo.description = "Bad";
        h1.getAllFields();
        h2.getAllFields();
    }

}

class Humantwo {
    private String name;
    private int age;
    public static String description;

    public Humantwo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName (String name) {this.name = name;}
    public void setAge (int age) {this.age = age;}

    public static void getDescription(){
        System.out.println(description);
    }
    public void getAllFields(){
        System.out.println(name+","+age+","+description);
    }
}

