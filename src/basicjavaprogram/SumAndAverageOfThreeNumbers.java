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
public class SumAndAverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        takeNumbers(num1, num2, num3);
    }

    public static void takeNumbers(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        float avg = sum / 3;  // float return value before decimal point
        System.out.println("Sum : " + sum + " and average : " + avg);
    }
}
