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
public class PerimeterOfRectangle {

    public static float perimeter;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        int length = sc.nextInt();
        System.out.println("Enter breadth : ");
        int breadth = sc.nextInt();

        Calculation(length, breadth);
        show();
    }

    public static void Calculation(int length, int breadth) {
        int l = length;
        int b = breadth;
        perimeter = 2 * (l + b);
    }

    public static void show() {
        System.out.println("Perimeter of rectangle is " + perimeter);
    }
}
