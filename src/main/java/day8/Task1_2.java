package day8;

public class Task1_2 {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 20000; i++){
            x = i;
            StringBuilder ad = new StringBuilder(" ");
            ad.append(x);
            System.out.println(ad.toString());
        }
    }
}
