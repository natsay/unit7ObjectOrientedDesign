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

    private JLabel sampleText = new JLabel("Label");
    
   
    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel()
    {
        this.currentColor= new JPanel(); 
        this.color= new JButton("Pick Color"); 

        this.circle= new JButton("Add Circle"); 
        this.square= new JButton("Add Square"); 
        
        color.addActionListener(new ButtonListener()); 
       
        this.add(this.color); 
        this.add(this.circle); 
        this.add(this.square); 
        
       
        
    }
    
    public class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
             Color c = JColorChooser.showDialog(null, "Choose a Color", sampleText.getForeground());
             if (c != null)
             {
                 sampleText.setForeground(c);
                 currentColor.setBackground(c);
             }    
             
        }
    }     
}

  

