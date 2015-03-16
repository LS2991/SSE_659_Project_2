/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzapalooza;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class Order {

    static Scanner scan = new Scanner(System.in);
    static String s, order = "";

    public Order() {
        typeOrder();
    }

    public static void typeOrder() {
        System.out.print("Order Hot-n-Ready or Custom Pizza (H / C): ");
        s = scan.nextLine();
        if (s.equalsIgnoreCase("H")) {
            order = order + HotReady.hotReady();
        } else if (s.equalsIgnoreCase("C")) {
            order = order + Custom.custPizza();
        } else {
            System.out.println("Order Unknown. Please enter H / C");
            typeOrder();
        }
        comOrder();
    }

    public static void comOrder() {
        System.out.println("Current Order: ");
        System.out.println(order);
        System.out.print("Will that complete the order (Y/N): ");
        s = scan.nextLine();
        if (s.equalsIgnoreCase("N")) {
            System.out.println("");
            typeOrder();
        } else if (s.equalsIgnoreCase("Y")) {
            System.out.println("");
        } else {
            System.out.println("Please enter Y / N");
            comOrder();
        }
    }

    @Override
    public String toString() {
        return "You Ordered:\n" + order + "\nYour order will be ready in " + CookTime.getTime() + " minutes."
                + "\nTotal Price is $" + PriceCalc.getPrice();
    }

}
