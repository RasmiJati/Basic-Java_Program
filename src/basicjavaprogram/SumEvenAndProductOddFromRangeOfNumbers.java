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
//program to display sum of even numbers 
//and product of odd numbers from 15 to 200
public class SumEvenAndProductOddFromRangeOfNumbers {

    public static void main(String[] args) {
//        start = 15;
//        end = 200 ;
        int sum = 0;
        int product = 1;
        for (int i = 15; i <= 200; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even numbers : " + sum);

        for (int j = 15; j <= 200; j++) {
            if (j % 2 != 0) {
                product *= j;
            }
        }
        System.out.println("Product of odd numbers : " + product);

    }
}
