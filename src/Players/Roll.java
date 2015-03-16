/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package players;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author Edwin
 */
public class Roll {

    public Integer RollTurn(final int player) {
        int num = 0;
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                int rollNum = random.nextInt(6) + 1;
                int duration = random.nextInt(3500);
                System.out.println("Player " + player + " is Rolling ...");
                if (duration > 3000) {
                    throw new IOException("Turn End - Player " + player + " taking too long for turn.\n");
                }
                try {
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Player " + player + "'s Roll is: " + rollNum);
                return rollNum;
            }
        });
        executor.shutdown();
        try {
            num = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            IOException ex = (IOException) e.getCause();
            System.out.println(ex.getMessage());
        }
        return num;
    }
}
