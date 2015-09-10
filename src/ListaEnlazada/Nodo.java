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
class Nodo {
    private int value;
    private Nodo next;

    public Nodo(Nodo nodo){
       value = nodo.value;
       next = nodo.next;
    }
    public Nodo(int value, Nodo next) {
        this.value = value;
        this.next = next;
    }

    public Nodo(int value) {
        this.value = value;
        next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo next() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
}
