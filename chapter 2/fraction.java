import java.util.Scanner;
public class fraction{
public static void main(String[] args){
   {
   Scanner scan = new Scanner(System.in);
   
   double numerator, denominator;
   double decimal;
   
   System.out.println("Enter the numerator");
   numerator = scan.nextInt();
   
   System.out.println("Enter the denominator");
   denominator = scan.nextInt();   
   
   decimal = numerator / denominator;
   
   System.out.println("The decimal is: " + decimal);
   
   }
   }
}