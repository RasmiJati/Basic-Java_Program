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
public class Student_Demo {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        String name;
        float height, weight;
        name = s1.name = "rasmi";
        height = s1.height = (float) 5.0;
        weight = s1.weight = 50;
        System.out.println("Value of 1st object of Student is : " + name + " " + height + " " + weight);
        
        
        name = s2.name = "rasi";
        height = s2.height = (float) 4.0;
        weight = s2.weight = 55;
        System.out.println("Value of 2nd object of Student is : " + name + " " + height + " " + weight);

    }
}
