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
public class DisplayAverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integers : ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd integers : ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd integers : ");
        int num3 = sc.nextInt();
        
        float avg = (num1 + num2 + num3) / 3;
        
        System.out.println("The average of three integers are " + avg);
    }
}
