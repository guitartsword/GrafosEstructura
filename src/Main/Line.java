/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Objects;

/**
 *
 * @author Isaias
 */
public class Line {
    private int x1,x2,y1,y2;
    private Color color = Color.yellow;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public void paint(Graphics g){
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.x1;
        hash = 47 * hash + this.x2;
        hash = 47 * hash + this.y1;
        hash = 47 * hash + this.y2;
        hash = 47 * hash + Objects.hashCode(this.color);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Line other = (Line) obj;
        if (this.x1 > other.x1 - 5 && this.x1 < other.x1 + 5) {
            return false;
        }
        if (this.x2 > other.x2 -5 && this.x2 < other.x2 + 5) {
            return false;
        }
        if (this.y1 > other.y1 -5 && this.y1 < other.y1 + 5) {
            return false;
        }
        if (this.y2 > other.y2 -5 && this.y2 < other.y2 + 5) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }
    
}
