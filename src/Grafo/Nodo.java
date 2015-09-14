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
public class Nodo {
    private Arista[] aristas;
    private String identidad;
    private int aristaCount;
            
    public Nodo(int maxAdyacentes, String identidad){
        aristaCount = 0;
        aristas = new Arista[maxAdyacentes];
        this.identidad = identidad;
    }
    public void addAdyacencia(Nodo adyacente, int peso){
        /*if(!(addControl < adyacentes.length)){
            throw new Exception("No hay mas nodos para hacer adyacencia");
        }*/
        for(int i = 0; i < aristaCount; i++){
            if(aristas[i].getAdyacente().identidad.equals(adyacente.identidad)){
                try {
                    throw new Exception("Nodo ya agregado o cambiar la identidad");
                } catch (Exception ex) {
                    Logger.getLogger(Nodo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        aristas[aristaCount++] =  new Arista(adyacente,peso);
    }
    
    public void setIdentidad(String identidad){
        this.identidad = identidad;
    }

    public String getIdentidad() {
        return identidad;
    }

    public int getAristaCount() {
        return aristaCount;
    }

    public Arista[] getAristas() {
        return aristas;
    }

    public void setAristas(Arista[] aristas) {
        this.aristas = aristas;
    }
    @Override
    public String toString(){
        return identidad;
    }
}
