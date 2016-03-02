import java.awt.Graphics; 
import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener; 
import java.awt.Color;
import javax.swing.JPanel;
import java.util.ArrayList; 
import javax.swing.JColorChooser;
public class DrawingPanel extends JPanel 
{
    private ArrayList<Shape> shape; 
    private Shape active; 
    private JPanel panel; 
    private Color activeColor;
    public DrawingPanel()
    {
        this.setBackground(Color.WHITE); 
    }  
    public Color getColor()
    {
        return activeColor;
    }
    public void pickColor() 
    {
         activeColor = JColorChooser.showDialog(this, "Choose a Color",Color.WHITE);
    }
//     public void addCircle() 
//     {
//         Circle circle= new Circle(x,50,y,50); 
//         repaint(); 
//     }
//     public void addSquare() 
//     {
//         Sqaure square= new Square(x,50,y,50); 
//         repaint();  
//     }     

    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
    }

}
