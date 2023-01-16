package org.example;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(-2);
        System.out.println("выводим значение из мейн метода " + person1.getName());
        System.out.println("выводим значение из мейн метода " + person1.getAge());

    }
}
class Person{
    private String name;
    private int age;
    public void setName (String username){
        if (username.isEmpty()){
            System.out.println("ты ввел пустое имя");
        } else {
        name = username;
        }
    }

    public String getName (){
        return name;
    }

    public void setAge (int userAge){
        if (userAge<0){
            System.out.println("возраст должен быть положительным");
        } else {
        age = userAge;
        }
    }
    public int getAge (){
        return age;
    }

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
            }
    void speak(){
        for (int i = 0; i < 2; i++){
            System.out.println("меня зовут " + name + ", мне " + age + " лет");
        }

        }

    }