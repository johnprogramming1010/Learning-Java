import java.util.Scanner;
import java.util.Random;
public class Username{
public static void main(String[] args){

   Scanner input = new Scanner(System.in);
   
   String FirstName;
   String LastName;
   String Result;
   int randomNum;
   
   System.out.print("Enter your first name: ");
   FirstName=input.next();
   
   System.out.print("Enter your last name: ");
   LastName=input.next();
   
   System.out.println("Your name is: " + FirstName + " " + LastName);
   
   Random generator = new Random();
   
   randomNum = generator.nextInt(90) + 1;
   
   Result = FirstName.substring(0,1) + LastName.substring(0,5) + randomNum;
   
   System.out.println("Username is : " + Result);
   }
   }
