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
public class foreachlooptosearcharray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean n = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be found :");
        int num = sc.nextInt();
        for (int i : arr) {
            if (i == num) {
                n = true;
            }
        }
        if (n) {
            System.out.println("Required number " + num + " is found ");
        } else {
            System.out.println(num + " not found in array");
        }

    }
}
