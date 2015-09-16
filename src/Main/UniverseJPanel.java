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
import java.awt.Point;
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
    private Rocket rocket;
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image planetaImage = new ImageIcon("./Imagenes/Universo.png").getImage();
        g.drawImage(planetaImage, 0, 0, getWidth(),getHeight(), this);
        for(PlanetaJLabel planeta: planetas){
            for(int i = 0; i < planeta.aristaSize(); i++){
                planeta.getArista(i).paint(g,planeta.getPlaneta().getArista(i).getPeso());
            }
        }
        if(rocket != null)
            rocket.paint(g);
    }
    public void addPlaneta(PlanetaJLabel nuevo){
        planetas.add(nuevo);
        add(nuevo);
    }
    public void remove(PlanetaJLabel comp) {
        for(int i = 0; i < planetas.size(); i++){
            if(comp.getPlaneta().getIdentidad().equals(planetas.get(i).getPlaneta().getIdentidad())){
                planetas.remove(i);
            }
        }
        super.remove(comp);
    }
    public Rocket addRocket(Point Start){
        rocket = new Rocket(this, Start);
        return rocket;
    }
    @Override
    public void removeAll(){
        super.removeAll();
        planetas.clear();
    }
    
}
