/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package su.strannik;

import java.util.EventListener;

/**
 *
 * @author Alex
 */
public interface IGraphListener extends EventListener {
    public void coordinates(GraphData obj);
}
