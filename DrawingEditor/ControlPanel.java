import javax.swing.JPanel; 
import javax.swing.JButton; 
import javax.swing.JLabel;
import java.awt.Color; 
import javax.swing.JColorChooser;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
public class ControlPanel extends JPanel 
{
    private JPanel currentColor; 
    private JButton color;
    private JButton circle;
    private JButton square; 
    private DrawingPanel draw; 


    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvas)
    {
        this.currentColor= new JPanel(); 
        this.color= new JButton("Pick Color"); 
        this.draw=canvas; 

        this.circle= new JButton("Add Circle"); 
        this.square= new JButton("Add Square"); 

        color.addActionListener(new ButtonListener()); 
   
        Color background = canvas.getColor();
        this.currentColor.setBackground(background);
        
        
        this.add(this.color); 
        this.add(this.currentColor);
        this.add(this.circle); 
        this.add(this.square); 
        

        
    }
    public class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
             Color c = JColorChooser.showDialog(null, "Choose a Color",Color.WHITE);
             if (c != null)
             {
               
                 currentColor.setBackground(c);
                 
                 
             }    
             
        }
    }     
}




