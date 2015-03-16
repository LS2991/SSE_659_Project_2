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
public class CookTime {

    static int time = 0;

    public static int time(String type, int num) {
        switch (type) {
            case "C":
                time = time + (num * 3);
                break;
            case "P":
            case "S":
                time = time + (num * 5);
                break;
            case "ML":
                time = time + (num * 7);
                break;
            case "ONE":
                time = time + (num * 10);
                break;
            case "THREE":
                time = time + (num * 10);
                break;
            default:
                break;
        }
        return time;
    }
    
    public static int getTime(){
        return time;
    }
}
