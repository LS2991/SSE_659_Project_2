/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameclass;

import javax.swing.SwingUtilities;

/**
 *
 * @author Edwin
 */
public class MembershipApp {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MemberRoot();
            }
        });
    }
}