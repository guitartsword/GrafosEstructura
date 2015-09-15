/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

/**
 *
 * @author Isaias
 */
public class Arista implements Comparable{
    private Nodo adyacente;
    private int peso;

    public Arista(Nodo adyacente, int peso) {
        this.adyacente = adyacente;
        this.peso = peso;
    }

    public Nodo getAdyacente() {
        return adyacente;
    }

    public int getPeso() {
        return peso;
    }

    public void setAdyacente(Nodo adyacente) {
        this.adyacente = adyacente;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "-" + peso + "->" + " " + adyacente.getIdentidad();
    }

    @Override
    public int compareTo(Object o) {
        return peso - ((Arista)o).peso;
    }
    
}
