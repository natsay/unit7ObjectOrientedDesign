
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
    public boolean equals(Object other)
    {
        if(this.getClass()==other.getClass())
        {
            CallingCard otherCallingCard= (CallingCard) other; 
            boolean isEqual= super.equals(other); 
            return isEqual&& PIN.equals(otherCallingCard.CallingCard); 
            return isEqual&& CardNumber.equals(otherCallingCard.CallingCard);
        }    
    }    
    
    public String format() 
    {
        return super.format() + "Card Number: " + CardNumber + "Pin: " + PIN;
    }    


}
