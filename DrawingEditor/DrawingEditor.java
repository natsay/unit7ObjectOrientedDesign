import javax.swing.JFrame; 
import java.awt.BorderLayout; 
public class DrawingEditor extends JFrame 
{
    private static final int FRAME_WIDTH=600;
    private static final int FRAME_HEIGHT=600; 

    private DrawingPanel canvas; 
    private ControlPanel controls; 

    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        this.canvas= new DrawingPanel();
        this.controls= new ControlPanel(canvas); 

        this.setTitle("Drawing Editor");

        this.add(controls,BorderLayout.SOUTH);
        this.add(canvas); 

        this.setSize(FRAME_WIDTH,FRAME_HEIGHT); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setVisible(true);

    }

    public static void main(String[] args) 
    {

        DrawingEditor edit = new DrawingEditor(); 
    }    

}
