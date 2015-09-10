/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

/**
 *
 * @author guitartsword
 */

public class TDAGrafo {
    private Nodo[] listaNodos;
    private int nodeControl;
    public TDAGrafo(int maxAdyacencias){
        listaNodos = new Nodo[maxAdyacencias];
        nodeControl = 0;
    }
    
    public boolean addArista(int Node1, int Node2, int Peso){
        if(Node1 == Node2){
            return false;
        }
        if(listaNodos[Node1] == null  || listaNodos[Node2] == null){
            return false;
        }
        if(!(Node1 < nodeControl) || !(Node2 < nodeControl)){
            return false;
        }
        listaNodos[Node1].addAdyacencia(listaNodos[Node2], Peso);
        return true;
    }
    public void addArista(char Node1, char Node2, int peso) throws Exception{
        Node1 = (char)(Character.toUpperCase(Node1) - 65);
        Node2 = (char)(Character.toUpperCase(Node2) - 65);
        if(Node1 == Node2){
            throw new Exception("No se puede asignar adyacencia al mismo nodo");
        }
        if(Node1 > nodeControl || Node2 > nodeControl){
            throw new Exception("Uno de los nodos no existe");
        }
        listaNodos[Node1].addAdyacencia(listaNodos[Node2], peso);
    }
    public void addNodo(String identidad) throws Exception{
        if(nodeControl >= listaNodos.length){
            throw new Exception("Limite de nodos alcanzados");
        }
        for(int i = 0; i < nodeControl; i++){
            if(identidad.equals(listaNodos[i].getIdentidad()))
                throw new Exception("No se puede repetir nombre del nodo");
        }
        listaNodos[nodeControl++] = new Nodo(listaNodos.length, identidad);
    }
    @Override
    public String toString(){
        String retStr = "Vertices: " + nodeControl + "\n\n";
        for(int i = 0; i < nodeControl; i++){
            retStr += listaNodos[i].getIdentidad();
            int aristas = listaNodos[i].getArrayControl();
            for(int j = 0; j < aristas; j++){
                retStr += " -" + listaNodos[i].getPesos()[j] + "-> " + listaNodos[i].getAdyacentes()[j].getIdentidad();
            }
            retStr += "\n";
        }
        return retStr;
    }
}
