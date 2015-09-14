/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isaias
 */
public class Nodo {
    private ArrayList<Arista> aristas = new ArrayList();
    private String identidad;
            
    public Nodo(String identidad){
        this.identidad = identidad;
    }
    public boolean addAdyacencia(Nodo adyacente, int peso){
        /*if(!(addControl < adyacentes.length)){
        throw new Exception("No hay mas nodos para hacer adyacencia");
        }*/
        for (Arista arista : aristas) {
            if (arista.getAdyacente().identidad.equals(adyacente.identidad)) {
                try {
                    throw new Exception("Nodo ya agregado, cambiar la identidad");
                } catch (Exception ex) {
                    return false;
                }
            }
        }
        aristas.add(new Arista(adyacente,peso));
        return true;
    }
    
    public void setIdentidad(String identidad){
        this.identidad = identidad;
    }

    public String getIdentidad() {
        return identidad;
    }

    public int getAristaCount() {
        return aristas.size();
    }

    public Arista getArista(int index) {
        return aristas.get(index);
    }
    
    @Override
    public String toString(){
        return identidad;
    }

    public void removeAdyacencia(int index) {
        aristas.remove(index);
    }
}
