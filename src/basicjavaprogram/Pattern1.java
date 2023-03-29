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

/* Pattern 1 
1
5 9
13 17 21 
25 29 33 37
 */
public class Pattern1 {

    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        int i, j;
        int k = 1;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                arr[i][j] = k;
                k += 4;  // 5-1=4 , 9-5 = 4 , 13-9 = 4 , 17-13 = 4 ,.....
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.println(arr[i][j] + " ");
                System.out.println();
            }
        }
    }
}
