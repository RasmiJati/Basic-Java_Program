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
public class DisplayOddFromArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Privode 10 elements for the array : ");
        int arr[] = new int[10];
        int i ;
        for( i = 0 ; i< 10 ; i++ ){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 != 0){
                System.out.println("Odd numbers in array are : " + arr[i]);
            }
        }
    }
}
