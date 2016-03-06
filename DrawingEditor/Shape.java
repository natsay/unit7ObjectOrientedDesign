import java.awt.*;
import java.awt.geom.*;


public abstract class Shape
{
    //instance variables
    private Point2D.Double center;
    private double radius;
    private Color color;

    //constructor Shape
    public Shape(Point2D.Double center, double radius, Color color)
    {
     
        this.center = center;    
        this.radius = radius;    
        this.color = color;
    }  
    
    Point2D.Double getCenter()
    {
        //returns center point
        return this.center;
    }
    
    
    double getRadius()
    {
        //returns radius
        return this.radius;
    }
    
    void move(double x, double y)
    {
        //moves the shape to a new location 
        this.center.setLocation(this.center.getX() + x, this.center.getY() + y);       
    }

    void setRadius(double r)
    {
        //sets new radius
        this.radius = r;
    }

    boolean isInside(Point2D.Double point)
    {
        return false;
    }

    void draw(Graphics g2, boolean filled)
    {
        
    }

    Color getColor()
    {
        //returns color
        return this.color;
    }
}
