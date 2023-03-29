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
public class DisplayValueOfArrayOfGivenSize {
    public static void main(String[] args) {
        // let array size is 5
        int[] arr = {1,2,3,9,5};
        for(int i = 0 ; i<5 ;i++)
            System.out.println("Value of the array are : " + arr[i]);
    }
}
