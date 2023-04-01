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

/*
Create a class named car with number variable model, price and color the add
a method named show to display value of these variable. Then create another
class named car_demo and instantiate three objects of car and then display 
their records
 */
public class Car {

    String model;
    int price;
    String color;

    public void show() {
        System.out.println("Model : " + model + " \n Price : " + price + " \n color " + color);
    }
}
