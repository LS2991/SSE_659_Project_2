/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package players;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Edwin
 */
public class Turnbase {

    private int score = 0;
    private Lock lock = new ReentrantLock();
    final Roll takeTurn = new Roll();

    public int currentScore() {
        return score;
    }

    public void Turn1(int player) throws InterruptedException {
        lock.lock();
        try {
            score += takeTurn.RollTurn(player);
        } finally {
            lock.unlock();
        }
    }

    public void Turn2(int player) throws InterruptedException {
//Thread.sleep(1000);
        lock.lock();
        try {
            score += takeTurn.RollTurn(player);
        } finally {
            lock.unlock();
        }
    }
}
