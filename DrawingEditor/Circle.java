import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.lang.Math;


public class Circle extends Shape
{

    public Circle(Point2D.Double center, double radius, Color color)
    {
        //calls consturcotr of parent class
        super(center, radius, color);
    }
   
    boolean isInside(Point2D.Double point)
    {
       //checks to see if the mouse is inside the shape
        return Math.sqrt(Math.pow((point.getX() - super.getCenter().getX()), 2) + Math.pow((point.getY() - super.getCenter().getY()), 2))<=super.getRadius();
       
    }
    
    void draw(Graphics g2, boolean filled)
    {
        //fills shape
        g2.setColor(super.getColor());
        if(filled)        
        {
            g2.fillOval((int)super.getCenter().getX()-(int)super.getRadius(),(int)super.getCenter().getY()-(int)super.getRadius(),(int)super.getRadius()*2, (int)super.getRadius()*2);
        }
        else
        {
            g2.drawOval((int)super.getCenter().getX()-(int)super.getRadius(),(int)super.getCenter().getY()-(int)super.getRadius(),(int)super.getRadius()*2, (int)super.getRadius()*2);
        }
    }
}
