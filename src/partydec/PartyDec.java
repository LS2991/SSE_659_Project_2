/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package partydec;

/**
 *
 * @author Edwin
 */
public class PartyDec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Room r = new Room(60, 50);
        Table c = new CirTable();

        DecTable dec = new DecTable();
        dec.setDec("white candles", 4);
        dec.setDec("witch hat center piece", 1);
        dec.setDec("pumpkins", 2);
        dec.setDec("glasses", 8);
        dec.setDec("plates", 8);
        dec.setDec("ghost napkins", 8);
        dec.setDec("forks", 8);
        dec.setDec("knifes", 8);
        dec.setDec("halloween confetti", 20);
        dec.setDec("hanging bats", 2);
        
        r.calcTable(c);
        r.addTable(dec);
        
        r.pDim();
        r.pDis();
        System.out.println("");
        r.getTables(0).getDec().pDec();
        System.out.println("");
        r.getTables(4).getDec().pDec();
    }
    
}
