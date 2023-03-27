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
public class AreaOfCurvedSurface {

    public static float area;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int radius = sc.nextInt();
        int p = 22 / 7;

        calculation(radius, p);
        show();

    }

    public static void calculation(int radius, int p) {
        int r = radius;
        int pi = p;
        area = 2 * pi * r * r;
    }

    public static void show() {
        System.out.println("Area of Curved Surface is " + area);
    }
}
