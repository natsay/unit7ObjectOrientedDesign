import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Person implements Comparable<Person>
{
    private String name;
    public Person(String name)
    {
        this.name = name;
    }
// 
//     public static void main(String[] args)
//     {
//         ArrayList<Person> list = new ArrayList<Person>();
//         Scanner input = new Scanner(System.in);
//         for(int i = 0; i < 10; i++)
//         {
//             System.out.println("Input name: ");
//             list.add(new Person(input.next()));
//         }
//         System.out.println(list); 
//         Collections.sort(list); 
//         System.out.println(list);
//     }

    public String getName()
    {
        return name;
    }

    public String toString() 
    {
        return "Name: "+this.name;
    }    

    public int compareTo(Person otherPerson)
    {
//     String myName=this.name; 
//     String otherName= other.name; 
//     return myName.compartTo(otherName); 
        if (this.name.compareTo(otherPerson.name) < 0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}