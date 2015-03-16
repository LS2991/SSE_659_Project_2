/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameclass;

import java.util.EventObject;

/**
 *
 * @author Edwin
 */
public class TextEvent extends EventObject {

    private String text;

    public TextEvent(Object source, String text) {
        super(source);
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
