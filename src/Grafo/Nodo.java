/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import ListaEnlazada.ListaEnlazada;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isaias
 */
class Nodo {
    
    private Nodo[] adyacentes;
    private int[] pesos;
    private String identidad;
    private int arrayControl;
            
    public Nodo(int maxAdyacentes, String identidad){
        arrayControl = 0;
        adyacentes = new Nodo[maxAdyacentes];
        pesos = new int[maxAdyacentes];
        this.identidad = identidad;
    }
    public void addAdyacencia(Nodo adyacente, int peso){
        /*if(!(addControl < adyacentes.length)){
            throw new Exception("No hay mas nodos para hacer adyacencia");
        }*/
        for(int i = 0; i < arrayControl; i++){
            if(adyacentes[i].identidad.equals(adyacente.identidad)){
                try {
                    throw new Exception("Nodo ya agregado o cambiar la identidad");
                } catch (Exception ex) {
                    Logger.getLogger(Nodo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        adyacentes[arrayControl] = adyacente;
        pesos[arrayControl++] = peso;
    }
    
    public void setIdentidad(String identidad){
        this.identidad = identidad;
    }

    public Nodo[] getAdyacentes() {
        return adyacentes;
    }

    public int[] getPesos() {
        return pesos;
    }

    public String getIdentidad() {
        return identidad;
    }

    public int getArrayControl() {
        return arrayControl;
    }
    
}
