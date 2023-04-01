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
public class car_demo {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        c1.model = "abc";
        c1.price = 1000000;
        c1.color = "red";
        c1.show();

        c2.model = "xyz";
        c2.price = 2000000;
        c2.color = "blue";
        c2.show();

        c3.model = "def";
        c3.price = 3000000;
        c3.color = "green";
        c3.show();

    }
}
