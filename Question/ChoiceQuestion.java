
public class ChoiceQuestion extends Question 
{
    private int numberofChoices; 
    public ChoiceQuestion()
    {
        //super as method call parent classes contrucotr 
        super(); 
        numberofChoices=0; 
        
    }
    
    public void addChoice(String choice,boolean correct) 
    {
        numberofChoices++; 
        // for example "1) the text of choice" 
        this.addText("\n" +numberofChoices+ " )" +choice); 
        if(correct) 
        {
            String choiceString= ""+ numberofChoices; 
            this.setAnswer(choiceString);
        }    
    }    
}
