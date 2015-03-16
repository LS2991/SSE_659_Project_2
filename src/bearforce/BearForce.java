/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bearforce;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class BearForce {

    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        for (;;) {
            System.out.print("Enter operation code "
                    + "(new applicant = i, quit = q) : ");

            switch (in.nextLine()) {
                case "i": insert();
                    break;
                case "q": System.out.println("Thank you, Have a Good Day");
                    return;
                default: System.out.println("Wrong input\n");
            }
            System.out.println("");
        }
    }
    
    public static void insert(){

        System.out.println("BearForce Application");
        
        System.out.print("Mercer Student: ");
        if(input()){
            System.out.print("Undergrad: ");
            if(input()){
                System.out.print("Full-time: ");
                if(input()){
                    System.out.print("GPA > 3.0: ");
                    if(input()){
                        System.out.print("AV Experience: ");
                        if(input())
                            System.out.println("Interview for BearForce & AV Tech");
                        else
                            System.out.println("Interview for only BearForce");
                    }
                    else
                        System.out.println("Dont Interview - minimum GPA is not met");
                }
                else
                    System.out.println("Dont Interview - Not Full-time student");
            }
            else
                System.out.println("Dont Interview - Not Undergrad student");
        }
        else
            System.out.println("Dont Interview - Not MU Student");
        in.nextLine();
    }
    
    public static Boolean input(){
        boolean var = false;
        while(in.hasNext()){
            if(in.hasNextBoolean()){
                var = in.nextBoolean();break;
            }
            else{
                System.out.print("Invalid input Please enter (true|false): ");
                in.next();
            }
        }
        return var;
    }
    
}
