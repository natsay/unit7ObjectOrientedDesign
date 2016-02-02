public class Billfold extends Card 
{
    private Card card1;
    private Card card2; 
    public void addCard(Card name) 
    {
        if(card1 == null) 
        {
            if (card2 == null )
            {
                card2 = new Card();
            }
            card1= new Card(); 
        }

    }
    
    public String formatCard()
    {
        String returnstring = "";
        if (card1 != null)
        {
            returnstring += card1.format();
        }
        if (card2 != null)
        {
            returnstring += " | " + card2.format();
        }

        return returnstring;
    }    

}
