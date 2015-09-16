/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Isaias
 */
public class Rocket extends Thread{
    private double x1, y1;//Posicion original
    private double x2=-1, y2=-1;//Posicion final
    private double m;//Pendiente m=1.0 * (y2-y1)/(x2-x1);//pendiente
    private UniverseJPanel panel;
    private BufferedImage imagen;
    private long TIME;
    
    public Rocket(UniverseJPanel panel, Point start){
        try {
            this.imagen = ImageIO.read(new File("./Imagenes/Rocket.png"));
        } catch (IOException ex) {
            Logger.getLogger(Rocket.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.panel = panel;
        x1 = start.x;
        y1 = start.y;
        
    }
    public void paint(Graphics g){
        /*AffineTransform at = new AffineTransform();
        if(x2 > 0){
            Graphics2D g2d = (Graphics2D)g;
            //las transformaciones se hacen en reversa
            at.translate(x1, x2);
            at.rotate(x1-x2, y1-y2);
            at.scale(0.4, 0.4);
            at.translate(-imagen.getWidth()/2, -imagen.getHeight()/2);

            g2d.drawImage(imagen,at,null);
        }else if (x2 <0){*/
        g.drawImage(imagen.getScaledInstance(30, 30, BufferedImage.SCALE_SMOOTH), (int)(x1+15), (int)(y1+15), panel);
        
    }
    public boolean move(){
        if(x1 > x2){
            x1 = x2;
            y1 = y2;
        }else if (x1 < x2){
            x1 = x1 + 1;
            y1 = y1 + m;
        }
        return x1 != x2;
    }
    public void setEndPoint(Point End){
        x2 = End.x;
        y2 = End.y;
        m = (y2-y1)/(x2-x1);
    }
    public void setTIME(long time){
        TIME = time*10;
    }
    @Override
    public void run() {
        panel.setPaintCommand("Rocket");
        if(TIME != 0){
            while(move()){
                try {
                    panel.repaint();
                    System.out.println("x1 = " + x1);
                    System.out.println("y1 = " + y1);
                    sleep(TIME);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Rocket.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            while(move()){
                System.out.println("321");
                panel.repaint();
            }
        }
        panel.setPaintCommand("normal");
    }
    
}
