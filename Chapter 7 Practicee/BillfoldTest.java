
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BillfoldTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class BillfoldTest
     */
    public BillfoldTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        
    }
    
    
    @Test
    /**
     *
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void testBillfold()
    {
        IDCard new1= new IDCard("Natalie","17998"); 
        DriverLicense new2= new DriverLicense("Maddie","12345");
        Billfold new3= new Billfold(); 
        new3.addCard(new1); 
        new3.addCard(new2); 
        assertEquals("Card holder: Natalie ID Number: 17998 | Card holder: Maddie Expiration Year: 12345",new3.formatCard() );
        
    }


}
