/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEnlazada;

import java.util.Scanner;

/**
 *
 * @author guitartsword
 */
class main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        char opc = '1';
        Scanner sc;
        int pos;
        int elem;
        while(opc != '9'){
            System.out.println("------MENU------");
            System.out.println("1) Insert");
            System.out.println("2) Delete");
            System.out.println("3) Get");
            System.out.println("4) Find");
            System.out.println("5) Print");
            System.out.println("6) First");
            System.out.println("7) Last");
            System.out.println("8) getSize");
            System.out.println("9) Salir");
            sc = new Scanner(System.in);
            opc = sc.nextLine().charAt(0);
            switch(opc){
                case'1':
                    System.out.println("Posicion: ");
                    sc = new Scanner(System.in);
                    pos = sc.nextInt();
                    System.out.println("Palabra: ");
                    sc = new Scanner(System.in);
                    elem = sc.nextInt();
                    lista.insert(elem, pos);
                    break;
                /*case'2':
                    System.out.println("Posicion: ");
                    sc = new Scanner(System.in);
                    pos = sc.nextInt();
                    lista.delete(pos);
                    break;
                case'3':
                    System.out.println("Posicion: ");
                    sc = new Scanner(System.in);
                    pos = sc.nextInt();
                    System.out.println(lista.get(pos));
                    break;
                case'4':
                    System.out.println("Palabra: ");
                    sc = new Scanner(System.in);
                    elem = sc.nextLine();
                    lista.find(elem);
                    break;
                */
                case'5':
                    lista.print();
                    break;
                /*
                case'6':
                    System.out.println("Primero: " + lista.first());
                    break;
                case'7':
                    System.out.println("Ultimo: " + lista.last());
                    break;
                case'8':
                    System.out.println("Tamaño: " + lista.getSize());
                    break;
                */
            }
        }        
    }
        
}
