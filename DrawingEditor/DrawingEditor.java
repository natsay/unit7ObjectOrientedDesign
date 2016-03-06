import java.awt.*;
import javax.swing.*;

public class DrawingEditor extends JFrame
{
    //instance variables
    private static final int FRAME_WIDTH = 600;
    // width for frame
    private static final int FRAME_HEIGHT = 600;
    // height for frame
    
    private DrawingPanel canvas;
    //drawing panel instance variable
    private ControlPanel controls;
    //control panel instance variable 
    private static DrawingEditor edit;
    //drawing panel instance variable 
    
    
    //constuctor for DrawingEditor
    public DrawingEditor()
    {
        this.setTitle("Drawing Editor");
        //sets title of frame
        //assigns canvas to a new DrawingPanel 
        this.canvas=new DrawingPanel();   
        //asigns controls to a new ControlPanel
        this.controls = new ControlPanel(this.canvas);
        //sets layout of frame
        this.setLayout(new BorderLayout());
        //adds canvas to the center of the frame
        this.add(canvas, BorderLayout.CENTER);
        //adds controls to the south side of the frame
        this.add(controls, BorderLayout.SOUTH);

        //sets size of frame      
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        //closes window 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //sets frame to be visible
        this.setVisible(true);
    }
    
    
    public static void main(String[] args)
    {
        //asigns edit to a new DrawingEditor 
        edit = new DrawingEditor();
    }
    
    
}
