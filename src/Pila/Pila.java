/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

public class Pila {

    private Nodo head;
    private int size;

    public Pila() {
        this.head = null;
        size = 0;
    }

    public Pila(Nodo head) {
        this.head = head;
        size = 1;
    }

    public void push(int value) {
        if (head == null) {
            head = new Nodo(value);
        } else {
            Nodo temp = head;
            head = new Nodo(value);
            head.setNext(temp);
        }
        size++;
    }

    public int pop() throws Exception {
        int retorno;
        if (head == null) {
            throw new Exception("Pila vacía");
        } else if (head.getNext() == null) {
            retorno = head.getValue();
            head=null;
        } else {
            retorno = head.getValue();
            Nodo temp = head.getNext();
            head = temp;
        }
        size--;
        return retorno;
    }
    public int peek() throws Exception{
        if(head != null)
            return head.getValue();
        throw new Exception("Pila vacía");
    }
    public int getSize(){
        return size;
    }
}
