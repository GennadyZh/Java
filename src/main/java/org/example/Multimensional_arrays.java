package org.example;
// многомерные массивы
import java.util.Arrays;

public class Multimensional_arrays {
    public static void main(String[] args) {
        int [] numbers = new int[4];//одномерный массив
        int [][] matrice = {{1,2,3},{4,3},{7,8,9}}; //двумерный массив

        for(int i = 0; i < matrice.length; i++){
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println(Arrays.toString(numbers));
        }
    }
}
