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
public class AreaOfSquare {

    static float area;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length = sc.nextInt();
        squareAreaCalculation(length);
        show();
    }

//    here we write static because only static methods or variables can be accessed in static method
//    here inorder to be accessed by main method i.e. static all other methods are made static
//   method for calculation of area
    public static void squareAreaCalculation(int length) {
        int l = length;
        area = l * l;  //area calculation

    }

//    to show or display the area 
    public static void show() {
        System.out.println("Area of square : " + area);
    }
}
