/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;


class Nodo {

    private int value;
    private Nodo next;

    public Nodo() {
        this.next = null;
    }
    
    public Nodo(int value) {
        this.value = value;
    }
    
    public Nodo(int value, Nodo next) {
        this.value = value;
        this.next = next;
    }
    
    public Nodo getNext(){
        return next;
    }
    
    public void setNext(Nodo nuevo){
        next=nuevo;
    }
    
    public int getValue(){
        return value;
    }
}
