/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameclass;

import java.util.EventListener;

/**
 *
 * @author Edwin
 */
public interface TextListener extends EventListener {

    public void detailEventOccurred(TextEvent event);
}
