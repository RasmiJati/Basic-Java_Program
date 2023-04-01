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
public class DisplayStringUsingSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String name = sc.next().toLowerCase();
        switch (name) {
            case "one":
                System.out.println("One is entered string");
                break;
            case "two":
                System.out.println("Two is entered string");
                break;

            case "three":
                System.out.println("Three is entered string");
                break;
            default:
                System.out.println(name + " is invalid string");
                System.out.println("Print enter valid string! ");
        }
    }
}
