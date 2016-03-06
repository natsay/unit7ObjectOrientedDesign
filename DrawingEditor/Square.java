import java.awt.*;
import java.awt.geom.*;


public class Square extends Shape
{
    private Point2D.Double center;
    private double radius;
    private Color color;

   
    public Square(Point2D.Double center, double radius, Color color)
    {
        //calls constructor of the parent class
        super(center, radius, color);
    }

    boolean isInside(Point2D.Double point)
    {
        //checks to see if mouse is inside the shape 
        return Math.abs(super.getCenter().getY()-point.getY())<=super.getRadius()&&Math.abs(super.getCenter().getX()-point.getX())<=super.getRadius();

    }

    void draw(Graphics g2, boolean filled)
    {
        //fills in shape
        g2.setColor(super.getColor());
        if(filled)        
        {
            g2.fillRect((int)super.getCenter().getX()-(int)super.getRadius(),(int)super.getCenter().getY()-(int)super.getRadius(),(int)super.getRadius()*2, (int)super.getRadius()*2);
        }
        else
        {
            g2.drawRect((int)super.getCenter().getX()-(int)super.getRadius(),(int)super.getCenter().getY()-(int)super.getRadius(),(int)super.getRadius()*2, (int)super.getRadius()*2);
        }
    }

}
