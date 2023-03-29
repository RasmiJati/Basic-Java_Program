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
public class DeclareAndDisplayArrayWhileInitializing {
    public static void main(String[] args) {
        int arr[] = new int[5]; //let size of array is 5
        //adding value to array
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 9;
        arr[3] = 65;
        arr[4] = 2;
        
        System.out.println("second element  : " + arr[1]);
    }
}
