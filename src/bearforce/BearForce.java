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
    static final String[] responses = {"Dont Interview - Not MU Student",
    								   "Dont Interview - Not Undergrad student",
    								   "Dont Interview - Not Full-time student",
    								   "Dont Interview - minimum GPA is not met",
    								   "Interview for only BearForce"};
    
    static final String[] questions = {"Mercer Student: ", "Undergrad: ", "Full-time", "GPA > 3.0: ", "AV Experience: "};
    								   
    
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
        
        boolean[] answers = questionnaire();
        
        for(int x = 0; x < responses.length; x++) {
        	if(!answers[x]) {
        		System.out.print(responses[x]);
        		break;
        	}
        	if(x == responses.length - 1) {
        		System.out.println("Interview for Bearforce and AV");
        	}
        }
                    
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
    
    public static boolean[] questionnaire() {
    	boolean[] answers = new boolean[5];
    	
    	for(int x = 0; x < questions.length; x++) {
    		System.out.println(questions[x]);
    		answers[x] = input();
    	}
    	
		return answers;
    }
    
}
