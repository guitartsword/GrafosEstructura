/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Grafo.Nodo;
import javax.swing.JLabel;

/**
 *
 * @author Isaias
 */
public class PlanetaJLabel extends JLabel{
    private Nodo planeta;

    public Nodo getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Nodo planeta) {
        this.planeta = planeta;
    }
    
}
