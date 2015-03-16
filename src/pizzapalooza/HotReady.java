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
public class HotReady {

    static Scanner scan = new Scanner(System.in);
    static String type = "";
    static String s, t, order = "";
    static int num, time;
    static double price;

    public static String hotReady() {
        pizzaType();
        pizzaNum();
        order = num + " " + type + " Pizzas\n";
        time = CookTime.time(t, num);
        price = PriceCalc.price(t, num);
        return order;
    }

    public static void pizzaType() {
        System.out.print("Type of pizza "
                + "(C = Chesse, P = Pepperoni, S = Sausage, ML = Meat Lover): ");
        t = scan.nextLine().toUpperCase();
        switch (t) {
            case "C":
                type = "Cheese";
                break;
            case "P":
                type = "Pepperoni";
                break;
            case "S":
                type = "Sausage";
                break;
            case "ML":
                type = "Meat Lover";
                break;
            default:
                System.out.println("Pizza type unavailable. Please reenter type.");
                pizzaType();
                break;
        }
    }

    public static void pizzaNum() {
        System.out.print("How many " + type + " Pizzas: ");
        num = scan.nextInt();
        s = scan.nextLine();
    }
}
