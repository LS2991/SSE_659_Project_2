/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Players;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class Players {

    final static Turnbase turn1 = new Turnbase();
    final static Turnbase turn2 = new Turnbase();
    final static Turnbase turn3 = new Turnbase();
    static int scoreT1 = 0;
    static int scoreT2 = 0;
    static int scoreT3 = 0;
    static int t = 1;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Begin Play...\n");
        System.out.println("Round " + t + "\n...");
        Play();
    }

    public static void Play() throws InterruptedException {
        Thread team1 = new Thread(new Runnable() {
            public void run() {
                scoreT1 = roll(turn1, 1);
            }
        });
        Thread team2 = new Thread(new Runnable() {
        	 public void run() {
                 scoreT2 = roll(turn2, 2);
             }
        });
        Thread team3 = new Thread(new Runnable() {
        	 public void run() {
                 scoreT3 = roll(turn3, 3);
             }   
        });
        
        team1.start();
        team2.start();
        team3.start();
        team1.join();
        team2.join();
        team3.join();
        System.out.println("\nTeam 1 total = " + scoreT1);
        System.out.println("Team 2 total = " + scoreT2);
        System.out.println("Team 3 total = " + scoreT3);
        CheckWin();
    }

    public static void CheckWin() throws InterruptedException {
        System.out.println("Press the return key!");
        new Scanner(System.in).nextLine();
        if (scoreT1 >= 15) {
            EndGame(1, scoreT1);
        } else if (scoreT2 >= 15) {
            EndGame(2, scoreT2);
        } else if (scoreT3 >= 15) {
            EndGame(3, scoreT3);
        } else {
            t++;
            System.out.println("Round " + t + "\n...");
            Play();
        }
    }
    
    public static int roll(Turnbase team, int teamNumber) {
    	try {
    		if(teamNumber != 0) {
    			team.Turn(teamNumber * 2 - 1);
    			team.Turn(teamNumber * 2);
    		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  	
    	return team.currentScore();
    	
    }

    public static String EndGame(int teamNumber, int score) {

        System.out.println("Team " + teamNumber + " Wins with score of " + score);
        return ("Team " + teamNumber + " Wins with score of " + score);
        
    }
 }
