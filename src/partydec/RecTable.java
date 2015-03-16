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
public class RecTable implements Table {

    private int length, width;
    private DecTable decor;

    public RecTable() {
        this.length = 72;
        this.width = 30;
    }
    
    @Override
    public String toString(){
        return "Rectangle Tables";
    }

    @Override
    public void pDim() {
        System.out.println("Rectangle Table with dimensions of " + getL() + "' X " + getW() + '"');
    }

    @Override
    public void pSpace() {
        System.out.println("RecTable space - " + getSL() + "' X " + getSW() + "'");
    }

    @Override
    public double getSpace() {
        return getSL() * getSW();
    }

    @Override
    public int getChair() {
        return 8;
    }

    public int getL() {
        return length / 12;
    }

    public int getSL() {
        return getL() + 5;
    }

    public int getW() {
        return width;
    }

    public int getSW() {
        return getW() / 12 + 5;
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
