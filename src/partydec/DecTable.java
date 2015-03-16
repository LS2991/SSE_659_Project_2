/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package partydec;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Edwin
 */
public class DecTable {
    
    private Map decor;
    
    public DecTable(){
        this.decor = new HashMap();
    }
    
    public void setDec(String item, int num){
        decor.put(item, num);
    }
    
    public Map getDec(){
        return decor;
    }
    
    public void pDec() {
        for (Object key : getDec().keySet()) {
            System.out.println(getDec().get(key) + " " + key);
        }
    }
}
