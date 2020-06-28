/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package su.strannik;

import java.util.EventObject;

/**
 *
 * @author Alex
 */
class GraphData extends EventObject{
    private int x, y;

    public GraphData(int x, int y, Object o) {
        super(o);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
