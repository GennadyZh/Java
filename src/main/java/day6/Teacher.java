package day6;

import java.util.Random;

public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate (String nameSdt){
        Random random = new Random();
                int min = 2;
                int max = 5;
                int diff = max - min;
                int grade = random.nextInt(diff + 1) + min;
                String i = null;
                if (grade == 5){
                    i = "отлично";
                } else if (grade == 4) {
                    i = "хорошо";
                } else if (grade == 3){
                    i = "удовлетворительно";
                } else if (grade == 2) {
                    i = "плохо";
                }
        System.out.println("Преподаватель " + name + " оценил студента " + nameSdt + " по предмету " + subject + " на оценку: " + i);
    }
}
