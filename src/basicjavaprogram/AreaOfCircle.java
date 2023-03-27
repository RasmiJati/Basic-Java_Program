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
public class AreaOfCircle {

    public static void main(String[] args) {
//        area of circle = pi* r*r
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int radius = sc.nextInt();
        //        float pi = (float) 3.14;  // 22/7
        float pi = 22/7;
        float area = pi * radius * radius;
        System.out.println("Area of circle is : " + area);
    }
}
