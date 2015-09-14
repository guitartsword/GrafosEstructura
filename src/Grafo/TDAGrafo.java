/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import java.util.ArrayList;

/**
 *
 * @author guitartsword
 */

public class TDAGrafo {
    private ArrayList<Nodo> listaNodos;
    public TDAGrafo(){
        listaNodos = new ArrayList();
        
    }
    
    public boolean addArista(int Node1, int Node2, int Peso){
        if(Node1 == Node2 || Peso < 0){
            return false;
        }
        try{
        listaNodos.get(Node1).addAdyacencia(listaNodos.get(Node2), Peso);
        }catch(Exception e){
            System.out.println(e.getMessage() + "\nCAUSA: " + e.getCause());
            return false;
        }
        return true;
    }
    public void addArista(String node1ID, String node2ID, int peso) throws Exception{
        if(node1ID.contentEquals(node2ID)){
            throw new Exception("No se puede asignar adyacencia al mismo nodo");
        }
        int Node1 = -1, Node2 = -1;
        for(int i = 0; i < listaNodos.size(); i++){
            if(listaNodos.get(i).getIdentidad().equals(node1ID)){
                Node1 = i;
            }
            if(listaNodos.get(i).getIdentidad().equals(node2ID)){
                Node2 = i;
            }
        }
        if(Node1 == -1 || Node2 == -1){
            throw new Exception("Uno de los nodos no existe");
        }
        listaNodos.get(Node1).addAdyacencia(listaNodos.get(Node2), peso);
    }
    public void addNodo(String identidad) throws Exception{
        for(int i = 0; i < listaNodos.size(); i++){
            if(identidad.equals(listaNodos.get(i).getIdentidad()))
                throw new Exception("No se puede repetir nombre del nodo");
        }
        listaNodos.add(new Nodo(identidad));
    }
    public void removeNodo(String identidad){
        for(int i = 0; i < listaNodos.size(); i++){
            for(int j = 0; j < listaNodos.get(i).getAristaCount(); j++){
                if(listaNodos.get(i).getArista(j).getAdyacente().getIdentidad().equals(identidad)){
                    listaNodos.get(i).removeAdyacencia(j);
                }
            }
        }
        for(int i = 0; i < listaNodos.size(); i++){
            if(identidad.equals(listaNodos.get(i).getIdentidad())){
                listaNodos.remove(i);
                break;
            }
        }            
    }
    public Nodo getNodo(int index){
        return listaNodos.get(index);
    }
    public int getNodosSize(){
        return listaNodos.size();
    }
    @Override
    public String toString(){
        String retStr = "";
        for(int i = 0; i < listaNodos.size() - 1; i++){
            retStr += listaNodos.get(i).getIdentidad() +":";
        }
        retStr += listaNodos.get(listaNodos.size()-1).getIdentidad()+"\n";
        for (int i = 0; i < listaNodos.size(); i++) {
            int aristas = listaNodos.get(i).getAristaCount();
            for(int j = 0; j < aristas; j++){
                retStr += listaNodos.get(i).getIdentidad() + " -" + listaNodos.get(i).getArista(j).getPeso() + "-> " 
                        + listaNodos.get(i).getArista(j).getAdyacente().getIdentidad() + "\n";
            }
        }
        return retStr;
    }
}
