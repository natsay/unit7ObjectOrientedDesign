import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ControlPanel extends JPanel
{
    //instance variables for button,panel and a DrawingPanel
    private JPanel currentColor;
    private JButton color;
    private JButton circle;
    private JButton square;
    private DrawingPanel draw;

    public ControlPanel(DrawingPanel canvas)
    {                
        //instance variable draw has been assigned to canvas
        this.draw = canvas;
        //adds new Button 
        this.color = new JButton("Add Color");
        //assigns a listener with the button
        this.color.addActionListener(new ColorButton ());
        //adds button to the JPanel 
        this.add(this.color);
        //asigns currentColor to a new JPanel 
        this.currentColor = new JPanel();
        //adds currentColor to JPanel 
        this.add(this.currentColor);
        //sets background to default color 
        currentColor.setBackground(draw.getColor());
        //adds a new Button
        this.circle = new JButton("Add Circle");
        //asigns a listener to the button
        this.circle.addActionListener(new CircleButton());
        //adds button to the panel
        this.add(this.circle);
        //adds new button 
        this.square = new JButton("Add Square");
        //asigns this button to a listener
        this.square.addActionListener(new SquareButton());
        //adds button to the panel 
        this.add(this.square);
        
        

    }
    public class ColorButton implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {        
            
            draw.pickColor();
            currentColor.setBackground(draw.getColor());
        }
    }
    

    public class CircleButton implements ActionListener
    {
        
        public void actionPerformed(ActionEvent e)
        {

            draw.addCircle();
            draw.repaint();
        }
    }
    

    public class SquareButton implements ActionListener
    {
     
        public void actionPerformed(ActionEvent e)
        {
            draw.addSquare();
            draw.repaint();
        }
    }


}    
