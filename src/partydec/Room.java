/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package partydec;

import java.util.ArrayList;

/**
 *
 * @author Edwin
 */
public class Room {
    
    private int length, width, num;
    private Table table;
    private ArrayList<Table> tables = new ArrayList();
    
    public Room(int length, int width){
        this.length = length;
        this.width = width;
    }
    
    public void calcTable(Table table){
        this.table = table;
        this.num = (int)(getA()/table.getSpace());
    }
    
    public int getL(){
        return length;
    }
    
    public int getW(){
        return width;
    }
    
    public int getA(){
        return getL()*getW();
    }
    
    public Table getTable(){
        return table;
    }
    
    public int getTNum(){
        return num;
    }
    
    public Table getTables(int num){
        System.out.println("Table "+(num+1));
        return tables.get(num);
    }
    
    public void pDim() {
        System.out.println("Room dimensions are " + getL() + "' X " + getW() + '"');
    }
  
    public void pDis(){
        System.out.println("Room has "+getTNum()+" "+getTable()
                +" with "+getTable().getChair()+" chairs each.");
    }
    
    public void addTable(DecTable dec){
        getTable().setDec(dec);
        for(int i =0; i<getTNum(); i++)
            tables.add(table);
    }
}
