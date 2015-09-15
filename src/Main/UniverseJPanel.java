/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Isaias
 */
class UniverseJPanel extends JPanel {
    private String command="reset";
    private ArrayList<PlanetaJLabel> planetas = new ArrayList();
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image planetaImage = new ImageIcon("./Imagenes/Universo.png").getImage();
        g.drawImage(planetaImage, 0, 0, getWidth(),getHeight(), this);
        for(PlanetaJLabel planeta: planetas){
            System.out.println("recorriendo planeta: " + planeta.getPlaneta().getIdentidad());
            for(int i = 0; i < planeta.aristaSize(); i++){
                System.out.println("recorriendo arista que apunta hacia: " + planeta.getPlaneta().getArista(i));
                planeta.getArista(i).paint(g,planeta.getPlaneta().getArista(i).getPeso());
            }
        }
    }
    public void addPlaneta(PlanetaJLabel nuevo){
        planetas.add(nuevo);
        add(nuevo);
    }
    public void remove(PlanetaJLabel comp) {
        for(int i = 0; i < planetas.size(); i++){
            System.out.println("recorriendo para borrar");
            if(comp.getPlaneta().getIdentidad().equals(planetas.get(i).getPlaneta().getIdentidad())){
                System.out.println("BORRANDO planeta: " + comp.getPlaneta().getIdentidad());
                planetas.remove(i);
            }
        }
        super.remove(comp);
    }
    @Override
    public void removeAll(){
        super.removeAll();
        planetas.clear();
    }
    
}
