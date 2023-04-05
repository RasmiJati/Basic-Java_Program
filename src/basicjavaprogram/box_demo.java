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
public class box_demo {

    public static void main(String[] args) {
        Box b = new Box();
        Box b1 = new Box();
        b.weight = 10;
        b.height = 5;
        b.depth = 15;
        b.display();
        
        b1.weight = 5;
        b1.height = 3 ;
        b1.depth = 2;
        b1.display();
    }
}
