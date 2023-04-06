public class StringMutation{

public static void main(String[] args){
{
   String phrase = "Change is inevitable";
   String Mutation1, Mutation2, Mutation3, Mutation4;
   
   System.out.println("Origional String: \"" + phrase + "\"");
   System.out.println("Length of String: \"" + phrase.length() + "\"");
   
   Mutation1 = phrase.concat(", except from vending machines.");
   Mutation2 = Mutation1.toUpperCase();
   Mutation3 = Mutation2.replace('E', 'X');
   Mutation4 = Mutation3.substring(3, 30);
   
   System.out.println("Mutation #1: " + Mutation1);
   System.out.println("Mutation #2: " + Mutation2);
   System.out.println("Mutation #3: " + Mutation3);
   System.out.println("Mutation #4: " + Mutation4);
   
   System.out.println("Length of Mutation #4: " + Mutation4.length());
   }
   }
}
   