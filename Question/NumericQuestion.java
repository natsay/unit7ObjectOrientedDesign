public class NumericQuestion extends Question 
{
    //extend is used to know how the class is inherit or class Question(subclass)
    private double answer; 
    //overloading; smae name different parameters 
    public void setAnswer(double correctResponse) 
    {
        this.answer= correctResponse; 
    }  
    //overidding 
    //exact same method name same parameters but differnt implemnation 
    public boolean checkAnswer(String response) 
    {
        //turniig string into double
        double responseAsDouble= Double.parseDouble(response);
        return Math.abs(responseAsDouble-answer)<=0.01; 
    }    

      
}    

