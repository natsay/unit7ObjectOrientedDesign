public class DriverLicense extends Card
{
    private String expireYear;
    
    public DriverLicense(String name, String Expyr)
    {
       super(name);
       Expyr= expireYear;
    }
    
    public String format() 
    {
        return super.format()+" Expiration Year: "+ expireYear; 
    }    
   
}
