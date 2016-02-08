public class IDCard extends Card
{
    private String idNumber; 
    

    public IDCard(String name, String id)
    {
        super(name);
        idNumber = id;
    }
    //in equal method ALWAYS HAS TO HAVE SAME SIGNATURE 
    public boolean equals(Object other)     
    {
        //check if this object and the other object are both instnaces of the same class
        if(this.getClass() ==other.getClass())
        {
            //since both objects are instances of IDCard, it is okay to cast other to an IDCard
            IDCard otherIDCard=(IDCard) other;
            boolean isEqual= super.equals(other); 
            return isEqual && idNumber.equals(otherIDCard.idNumber);
        }    
        return false; 
    }    


    public String format() 
    {
        return super.format()+" ID Number: " +idNumber; 
    }
}
