/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprogram;

/**
 *
 * @author admin
 */
public class Array2D {

    public static void main(String[] args) {
        int a[][] = new int[4][5]; // array of 4[i] by 5[j]
        int i, j;
        int k = 1;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                a[i][j] = k;
                k++;
            }
            for (i = 0; i < 4; i++) {
                for (j = 0; j < 5; j++) {
                    System.out.println(a[i][j] + " ");
                }
            }
        }

    }
}
