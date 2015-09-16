/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brenda
 */
public class debug {
    public static void main(String[] args) {
        try {
            Pila pila= new Pila();
            System.out.println("SIZE = "+pila.getSize());
            //System.out.println("PEEK = "+pila.peek());
            //System.out.println("POP = "+pila.pop());
            pila.push(5);
            System.out.println("SIZE = "+pila.getSize());
            pila.push(4);
            System.out.println("SIZE = "+pila.getSize());
            pila.push(3);
            System.out.println("SIZE = "+pila.getSize());
            pila.push(2);
            System.out.println("SIZE = "+pila.getSize());
            pila.push(1);
            System.out.println("SIZE = "+pila.getSize());
            System.out.println("POP = "+pila.pop());
            System.out.println("SIZE = "+pila.getSize());
            System.out.println("POP = "+pila.pop());
            System.out.println("SIZE = "+pila.getSize());
            System.out.println("POP = "+pila.pop());
            System.out.println("SIZE = "+pila.getSize());
            System.out.println("POP = "+pila.pop());
            System.out.println("SIZE = "+pila.getSize());
            System.out.println("POP = "+pila.pop());
            System.out.println("SIZE = "+pila.getSize());
        } catch (Exception ex) {
            Logger.getLogger(debug.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
