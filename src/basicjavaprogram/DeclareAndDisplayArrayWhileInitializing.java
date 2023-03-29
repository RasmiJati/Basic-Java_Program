/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprogram;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class DeclareAndDisplayArrayWhileInitializing {

    public static void main(String[] args) {
        int arr[] = new int[5]; //let size of array is 5
//        using loop in array
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=0;i<5;i++){
            System.out.println("Provide value for "+ i + "th element for array");
            arr[i] = sc.nextInt();
            System.out.println("Value of array : " + arr[i]);
        }

        //adding value to array
//        now taking input from user
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Provide value for lst element for array : ");
//        arr[0] = sc.nextInt();
//        System.out.println("Provide value for 2nd element for array : ");
//        arr[1] = sc.nextInt();
//        System.out.println("Provide value for 3rd element for array : ");
//        arr[2] = sc.nextInt();
//        System.out.println("Provide value for 4th element for array : ");
//        arr[3] = sc.nextInt();
//        System.out.println("Provide value for 5th element for array : ");
//        arr[4] = sc.nextInt();
//
//        System.out.println("second element  : " + arr[1]);
    }
}
