public class DriverLicense extends Card
{
    private String expireYear;
    
    public DriverLicense(String name, String expyr)
    {
       super(name);
       expyr= expireYear;
    }
    
    public boolean equals(Object other)
    {
        if(this.getClass()==other.getClass())
        {
            DriverLicense otherDriverLicense= (DriverLicense) other; 
            boolean isEqual= super.equals(other); 
            return isEqual && expireYear.equals(otherDriverLicense.expireYear); 
        }   
        return false; 
    }    
    
    public String format() 
    {
        return super.format()+" Expiration Year: "+ expireYear; 
    }    
   
}
