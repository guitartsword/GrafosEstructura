/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEnlazada;

/**
 *
 * @author guitartsword
 */
public class ListaEnlazada {
    private Nodo cabeza;
    private int size = 0;
    public ListaEnlazada() {
        cabeza = null;
    }
    public void insert(int value, int pos){
        if(pos == 0 && cabeza == null){
            cabeza = new Nodo(value);
        }else if(pos == 0){
            Nodo newCabeza = new Nodo(value, new Nodo(cabeza));
            cabeza = newCabeza;
        }else if(pos == 1){
            Nodo newNodo = new Nodo(value, cabeza.next());
            cabeza.setNext(newNodo);
        }
        Nodo next = cabeza;
        int lugar = 0;
        while(next.next() != null){
            lugar++;
            next = next.next();
            if(lugar == pos-1){
                Nodo newNodo = new Nodo(value, next.next());
                next.setNext(newNodo);
            }
        }
        /*
            next = new Nodo(next.next());
            System.out.println(next.getValue() + ", ");
        */
    }
    public void add(int value){
        int pos = size;
        if(pos == 0 && cabeza == null){
            cabeza = new Nodo(value);
        }else if(pos == 0){
            Nodo newCabeza = new Nodo(value, new Nodo(cabeza));
            cabeza = newCabeza;
        }else if(pos == 1){
            Nodo newNodo = new Nodo(value, cabeza.next());
            cabeza.setNext(newNodo);
        }
        Nodo next = cabeza;
        int lugar = 0;
        while(next.next() != null){
            lugar++;
            next = next.next();
            if(lugar == pos-1){
                Nodo newNodo = new Nodo(value, next.next());
                next.setNext(newNodo);
            }
        }
    }
    public void print(){
        System.out.println(cabeza.getValue() +", ");
        Nodo next = cabeza;
        while(next.next() != null){
            next = next.next();
            System.out.println(next.getValue() + ", ");
        }
    }
    public void delete(int pos){
        if(pos == 0){
            cabeza.setNext(cabeza.next());
        }else if(pos == 1){
            //Nodo newNodo = new Nodo(value, cabeza.next());
            //cabeza.setNext(newNodo);
        }
        Nodo next = cabeza;
        int lugar = 0;
        while(next.next() != null){
            lugar++;
            next = next.next();
            if(lugar == pos-1){
                //Nodo newNodo = new Nodo(value, next.next());
                //next.setNext(newNodo);
            }
        }
    }
    public int getSize(){
        return size;
    }
}