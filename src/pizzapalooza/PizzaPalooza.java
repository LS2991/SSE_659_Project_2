/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzapalooza;

/**
 *
 * @author Edwin
 */
public class PizzaPalooza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("App Started");
        System.out.println("Welcome to Pizza Palooza. "
                + "Begin ordering your pizza.\n");

        Order order = new Order();
        System.out.println("Order has been Submitted!");
        System.out.println(order);
    }
}
