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
public class PrimeOrNot {

    public static int count = 0;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        calculation(num);
    }

    public static void calculation(int num) {
        n = num;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            showIfPrime();
        } else {
            showIfNotPrime();
        }
    }

    public static void showIfPrime() {
        System.out.println(n + " is a Prime Number");
    }

    public static void showIfNotPrime() {
        System.out.println(n + " is not a Prime Number");

    }
}
