/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package players;

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
                try {
//turn1.setScore();
                    turn1.Turn1(1);
                    turn1.Turn2(2);
                    scoreT1 = turn1.currentScore();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                };
            }
        });
        Thread team2 = new Thread(new Runnable() {
            public void run() {
                try {
//turn2.setScore();
                    turn2.Turn1(3);
                    turn2.Turn2(4);
                    scoreT2 = turn2.currentScore();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread team3 = new Thread(new Runnable() {
            public void run() {

                try {
//turn3.setScore();
                    turn3.Turn1(5);
                    turn3.Turn2(6);
                    scoreT3 = turn3.currentScore();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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
            EndGameT1();
        } else if (scoreT2 >= 15) {
            EndGameT2();
        } else if (scoreT3 >= 15) {
            EndGameT3();
        } else {
            t++;
            System.out.println("Round " + t + "\n...");
            Play();
        }
    }

    public static void EndGameT1() {

        System.out.println("Team 1 Wins with score of " + scoreT1);
    }

    public static void EndGameT2() {
        System.out.println("Team 2 Wins with score of " + scoreT2);
    }

    public static void EndGameT3() {
        System.out.println("Team 3 Wins with score of " + scoreT3);
    }
}
