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
public class SumOfTwoIntergers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second integer : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of two integer is " + sum);

    }
}
