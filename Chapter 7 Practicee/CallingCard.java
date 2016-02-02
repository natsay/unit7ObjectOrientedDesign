
public class CallingCard extends Card 
{
    private String PIN; 
    private String CardNumber; 
    public CallingCard(String n,String pin,String Cardnumber )
    {
        super(n); 
        PIN= pin;
        CardNumber= Cardnumber;
        
    }
    
    public String format() 
    {
        return super.format() + "Card Number: " + CardNumber + "Pin: " + PIN;
    }    


}
