/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partydec;

import java.util.Map;

/**
 *
 * @author Edwin
 */
public class CirTable implements Table {

    private int dim;
    private DecTable decor;

    public CirTable() {
        this.dim = 60;
    }

    @Override
    public String toString(){
        return "Circular Tables";
    }
    
    @Override
    public void pDim() {
        System.out.println("Circular Table with a diameter of " + getD() + '"' + " wide");
    }

    @Override
    public void pSpace() {
        System.out.println("CirTable space - " + getSD() + "' wide");
    }

    @Override
    public double getSpace() {
        return Math.PI * getSD() / 2 * getSD() / 2;
    }

    @Override
    public int getChair() {
        return 10;
    }

    public int getD() {
        return dim;
    }

    public int getSD() {
        return getD() / 12 + 5;
    }
    
    @Override
    public void setDec(DecTable dec) {
        this.decor = dec;
    }

    @Override
    public DecTable getDec() {
        return decor;
    }

}
