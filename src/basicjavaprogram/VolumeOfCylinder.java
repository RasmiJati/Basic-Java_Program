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
public class VolumeOfCylinder {

    public static float volume;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int radius = sc.nextInt();

        System.out.println("Enter the height : ");
        int height = sc.nextInt();

        int p = 22 / 7;

        calculation(radius, height, p);
        show();
    }

    public static void calculation(int radius, int height, int p) {
        int r = radius;
        int h = height;
        int pi = p;

        volume = pi * r * r * h;
    }

    public static void show() {
        System.out.println("Volume of Cylinder is " + volume);
    }
}
