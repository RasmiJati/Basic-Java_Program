package basicjavaprogram;


/**
 *
 * @author admin
 */

/*
Create a class named box with instances variables height, weight and depth then add
a non-return type method named display to display value of volume of box. Then create another
class named box_demo and instantiate two objects of box and then display 
volume of both.
 */
public class Box {
    float height,weight,depth;
    
    public void display(){
        System.out.println("Volume of box : " + height*weight*depth);
    }
}
