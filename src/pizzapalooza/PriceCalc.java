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
public class PriceCalc {
    
    static double price = 0;
    
    public static double price(String type, int num) {
        switch (type) {
            case "C":
            case "P":
            case "S":
                price = price + (num * 4.99);
                break;
            case "ML":
                price = price + (num * 5.99);
                break;
            case "ONE":
                price = price + (num * 7.99);
                break;
            case "THREE":
                price = price + (num * 7.99);
                break;
            default:
                break;
        }
        return price;
    }
    
    public static double getPrice(){
        return price;
    }
}
