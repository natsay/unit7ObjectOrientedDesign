import java.awt.Graphics; 
import java.awt.Graphics2D; 
import javax.swing.JComponent; 
import java.awt.Polygon;
import java.awt.geom.Line2D; 
import java.awt.Ellipse2D; 

public class TriangleComponent
{
    private Ellipse dot1; 
    private Ellipse dot2; 
    private Ellipse dot3; 
    private int count; 
    
    private Polygon triangle; 
    public TriangleComponent(int p1,int p2, int p3)
    {
        point1=p1; 
        point2=p2; 
        point3=p3; 
    }
    
    public void drawDot(int x, int y) 
    {
        this.dot1= new Elipse(x,y,5,5) 
        repaint(); 
        
    }    
    
    public void drawDot2(int x, int y) 
    {
        this.dot2= new Elipse(x,y,5,5) 
        repaint(); 
        
    }    
    
    public void drawDot3(int x, int y) 
    {
        this.dot3= new Elipse(x,y,5,5) 
        repaint(); 
        
    }    
    
    
    
    public void drawTriangle(int x,int y) 
    {
        
    }
    
    public void paintComponent(Graphics g) 
    {
        Graphics 2D g2=(Graphics2D) g; 
        g2.draw(dot1); 
        g2.draw(dot2); 
        g2.draw(dot3); 

    }

}
