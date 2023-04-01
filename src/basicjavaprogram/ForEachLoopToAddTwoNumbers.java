/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprogram;

/**
 *
 * @author admin
 */
public class ForEachLoopToAddTwoNumbers {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        System.out.println("Array : ");
        for (int i : arr) {
            System.out.print(i + " \t");

        }
        System.out.println("\n");
        for (int i : arr) {
            sum += sum + i;
            System.out.println(" Sum of iteration " + i + " : " + sum);
        }
    }
}
