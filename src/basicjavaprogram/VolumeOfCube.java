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
public class VolumeOfCube {

    public static float volume;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length = sc.nextInt();
        calculation(length);
        show();
    }

    public static void calculation(int length) {
        int l = length;
        volume = l * l * l;
    }
    
    public static void show(){
        System.out.println("Volume of cube : " + volume);
    }
}
