/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Isaias
 */
class UniverseJPanel extends JPanel {

    public UniverseJPanel() {
        
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image planetaImage = new ImageIcon("./Imagenes/Universo.png").getImage();
        g.drawImage(planetaImage, 0, 0, getWidth(), getHeight(), this);
    }
    
}
