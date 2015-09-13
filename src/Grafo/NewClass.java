/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Isaias
 */
public class NewClass extends JFrame{
    public static void main(String[] args) {
        TDAGrafo grafo = new TDAGrafo(10);
        try {
            grafo.addNodo("A");
            grafo.addNodo("B");
            grafo.addNodo("C");
            grafo.addNodo("D");
            grafo.addNodo("D");
            grafo.addNodo("D");
            grafo.addNodo("D");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        grafo.addArista(0, 1, 2);
        grafo.addArista(1, 2, 1);
        grafo.addArista(2, 0, 1);
        grafo.addArista(1, 3, 0);
        grafo.addArista(2, 3, 1);
        grafo.addArista(3, 0, 1);
        System.out.println(grafo.toString());
    }
}
