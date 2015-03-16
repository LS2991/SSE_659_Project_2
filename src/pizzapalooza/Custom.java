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
public class Custom {
    
    static Scanner scan = new Scanner(System.in);
    static String type = "";
    static String s, t, order = "";
    static int num, time;
    static double price;
    
    public static String custPizza(){
        pizzaType();
        time = CookTime.time(t, 1);
        price = PriceCalc.price(t, 1);
        order = t +" Topping Pizza with "+type +"\n";
        return order;
    }
    
    public static void pizzaType() {
        System.out.print("Type of pizza 1 topping or 3 toppings"
                + "(ONE / THREE ): ");
        t = scan.nextLine().toUpperCase();
        switch (t) {
            case "ONE":
                type = oneTop();
                break;
            case "THREE":
                type = threeTop();
                break;
            default:
                System.out.println("Pizza type unavailable. Please reenter type.");
                pizzaType();
                break;
        }
    }
    
    public static String oneTop(){
        System.out.print("\nTopping Choice "
                + "(E = ExtraChesse, P = Pepperoni, S = Sausage,\n"
                + "GP = Green Pepper, T = Tomato, O = Olivies, M = Mushroom, SP = Spinach): ");
        s = scan.nextLine().toUpperCase();
        switch (s) {
            case "E":
                type = "ExtraCheese";
                break;
            case "P":
                type = "Pepperoni";
                break;
            case "S":
                type = "Sausage";
                break;
            case "GP":
                type = "Green Pepper";
                break;
            case "T":
                type = "Tomato";
                break;
            case "O":
                type = "Olivies";
                break;
            case "M":
                type = "Mushroom";
                break;
            case "SP":
                type = "Spinach";
                break;
            default:
                System.out.println("Pizza type unavailable. Please reenter type.");
                oneTop();
                break;
        }
        return type;
    }
    
    public static String threeTop(){
        return oneTop() +" "+ oneTop() +" "+ oneTop();
    }
}
