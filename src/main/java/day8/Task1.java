package day8;

import javax.sound.midi.Soundbank;

public class Task1 {
    public static void main(String[] args) {

        String numbers = "";
        long before = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++)
           numbers += i + " ";
        long after = System.currentTimeMillis();
        System.out.println(numbers);
        System.out.println("время стринг " + (after - before));




        StringBuilder ad = new StringBuilder("");
        before = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            ad.append(i).append(" ");
        }
        System.out.print(ad);
        after = System.currentTimeMillis();
        System.out.println("время стрингбилдер " + (after - before));
    }
}
