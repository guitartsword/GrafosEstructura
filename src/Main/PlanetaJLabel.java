/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Grafo.Nodo;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Isaias
 */
public class PlanetaJLabel extends JLabel{
    private Nodo planeta;
    private ArrayList<Line> aristas = new ArrayList();

    public Nodo getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Nodo planeta) {
        this.planeta = planeta;
    }
    public void addLine(int x1,int y1 ,int x2,int y2){
        aristas.add(new Line(x1,y1,x2,y2));
    }
    public Line getArista(int index){
        return aristas.get(index);
    }
    public int aristaSize(){
        return aristas.size();
    }
    public void removeLine(Line remove){
        for(Line line: aristas){
            if(line.equals(remove)){
                aristas.remove(line);
            }
        }
    }
    public void clearLines(){
        aristas.clear();
    }
}
