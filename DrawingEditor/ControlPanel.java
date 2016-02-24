import javax.swing.JPanel; 
import javax.swing.JButton; 
public class ControlPanel extends JPanel 
{
    private JPanel currentColor; 
    private JButton color;
    private JButton circle;
    private JButton square; 
    
   
    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel()
    {
        this.currentColor= new JPanel(); 
        this.color= new JButton("Pick Color"); 

        this.circle= new JButton("Add Circle"); 
        this.square= new JButton("Add Square"); 
        
        this.add(this.color); 
        this.add(this.circle); 
        this.add(this.square); 
        
       
        
    }

  

}
