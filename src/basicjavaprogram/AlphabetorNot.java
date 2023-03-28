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
public class AlphabetorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char c = sc.next().charAt(0);
        chequeAlphabet(Character.toUpperCase(c));
    }
    
    public static void chequeAlphabet(char c){
        char ch = c;
        if(ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' ||ch == 'E' || ch == 'F' ||ch == 'G' || ch == 'H' ||ch == 'I' || ch == 'J' ||ch == 'K' || ch == 'L' ||ch == 'M' || ch == 'N' ||ch == 'O' || ch == 'P' ||ch == 'Q' || ch == 'R' ||ch == 'S' || ch == 'T' ||ch == 'U' || ch == 'V' ||ch == 'W' || ch == 'X' ||ch == 'Y' || ch == 'Z'){
            System.out.println(ch +" is an alphabet");
        }
        else{
            System.out.println(ch + " is not alphabet");
        }
    }
}
