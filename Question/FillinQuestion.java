import java.util.Scanner;
public class FillinQuestion extends Question 
{
  //override the setText method to extract the answer from the question text
  //For example: The Inventor of Java was_ James Gosing_" 
  //text:"The inventor of Java was_______" 
  //answer: "James Gosling" 
  public void setText(String questionText) 
  {
      Scanner parser = new Scanner(questionText); 
      parser.useDelimiter("_");
      String question= parser.next(); 
      String answer= parser.next(); 
      question+="______"+ parser.next();
      //use 'super' too call the setText method from the parent class 
      super.setText(question); 
      //we dont have to sepcify anything beofre setAnser byt we could spefic this or super 
      this.setAnswer(answer); 
      
  }    
}
