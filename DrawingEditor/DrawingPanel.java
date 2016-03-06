import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Random;

public class DrawingPanel extends JPanel
{
    //instance variables 
    private ArrayList<Shape> shapes;
    private Shape activeShape; 
    private Color activeColor; 
    private int activeShapeI = -1;
    private Point2D.Double pressedPoint;
    
    //constructor for DrawingPanel 
    public DrawingPanel()
    {
        //asigns default color
        this.activeColor=Color.BLUE;
        //asignes shapes to a new ArrayList
        this.shapes= new ArrayList<Shape>();
        //creates a new JColorChooser object
        JColorChooser colorChooser = new JColorChooser();
        //creates a new MouseListener object 
        MouseListener listener = new MousePressListener();
        //adds MouseListener to drawing panel 
        addMouseListener(listener);
        //creates new MouseMotionListener object
        MouseMotionListener motionListener = new MouseMoveListener();
        //adds MouseMotionListener to drawing pane; 
        addMouseMotionListener(motionListener);
       

    }
    
    
    public Dimension getPreferredSize()
    {
        //gets PreferredSize of canvas
        return new Dimension(600, 600);
   
    }
    
  
    public Color getColor()          
    {
        //gets current color
        return this.activeColor;
    }
    
    
    public void pickColor()
    { 
        //creates new Color object and assigns it to JColorChooser
        Color c=JColorChooser.showDialog(this,"Choose a Color",this.activeColor);  
        this.activeColor= c; 
    }
    

    public void addCircle()
    {
        //adds new Circle to the ArrayList while also setting random sizes to the shape
        Random random = new Random();    
        this.shapes.add( new Circle(new Point2D.Double(random.nextInt(100),random.nextInt(100)), random.nextInt(100), this.getColor()));
    }
    
 
    public void addSquare()
    {
        //adds new Square to the ArrayList while also setting random sizes to the shape
        Random random = new Random();    
        this.shapes.add(new Square(new Point2D.Double(random.nextInt(100),random.nextInt(100)), random.nextInt(90), this.getColor()));

    } 
    
    public void paintComponent(Graphics g)        
    {
        super.paintComponent(g);
        //goes through the ArrayList of shapes and draws the shape 
        for(int i = 0; i < this.shapes.size(); i++)
        {
            if(i != activeShapeI)
            {
                this.shapes.get(i).draw(g, true);
            }
                
        }
        //checks to see if the shape is selected if not then it will only show the border of the shape 
        if(activeShapeI >= 0)
        {
            this.shapes.get(activeShapeI).draw(g, false);
        }
    }
    class MousePressListener implements MouseListener
    {
      
        public void mousePressed(MouseEvent event)
        {
            activeShapeI = -1;
            //assigns pressedPoint to the mouse's current location 
            pressedPoint = new Point2D.Double(event.getX(), event.getY());
            //goes throught the ArrayList and check to see if the mouse is inside the shape, then sets i to the current location
            for(int i = 0; i < shapes.size(); i++)
            {
                if(shapes.get(i).isInside(pressedPoint) == true)
                {
                    activeShapeI = i;
                }
            }

        }
        public void mouseClicked(MouseEvent event)
        {
            activeShapeI = -1;
            //assigns pressedPoint to the mouse's current location 
            Point2D.Double point = new Point2D.Double(event.getX(), event.getY());
            //goes throught the ArrayList and check to see if the mouse is inside the shape, then sets i to the current location
            
            for(int i = 0; i < shapes.size(); i++)
            {
                if(shapes.get(i).isInside(point) == true)
                {
                    activeShapeI = i;
                }
            }
            //repaints canvas if the mouse if clicked
            repaint();
        }
         public void mouseEntered(MouseEvent event)
        {

        }
      
        public void mouseExited(MouseEvent event)
        {

        }

        public void mouseReleased(MouseEvent event)
        {

        }        
  
        
    }
    class MouseMoveListener implements MouseMotionListener
    {
 
        public void mouseDragged(MouseEvent event)
        {
            //moves the shape that is selected
            if(activeShapeI >= 0)
            {
                shapes.get(activeShapeI).move(event.getX()-pressedPoint.getX(), event.getY()-pressedPoint.getY());
                pressedPoint = new Point2D.Double(event.getX(), event.getY());
                repaint();
            }
        }
 
        public void mouseMoved(MouseEvent event)
        {

        }
    }

    

}
