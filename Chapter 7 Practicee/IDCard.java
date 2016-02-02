public class IDCard extends Card
{
    private String idNumber; 

    public IDCard(String name, String id)
    {
        super(name);
        idNumber = id;
    }

    public String format() 
    {
        return super.format()+" ID Number: " +idNumber; 
    }
}
