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
public interface Table {
    
    void pDim();
    void pSpace();
    double getSpace();
    int getChair();
    void setDec(DecTable dec);
    DecTable getDec();
    
}
