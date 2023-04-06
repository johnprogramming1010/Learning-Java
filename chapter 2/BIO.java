import java.util.Scanner;
public class BIO
{
   public static void main(String[] args){
   {
   String name;
   String college;
   String petname;
   int age;
   
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter your name:");
      name = scan.next();
      
      System.out.println("Enter your age:");
      age = scan.nextInt();
      
      System.out.println("Enter your college:");
      college = scan.next();
      
      System.out.println("Enter your petname:");
      petname = scan.next();
      
      System.out.println("Hello, my name is " + name + " and I am\n" + age + 
      ". I'm enjoying my time at " + college + ", though \nI miss my pet " + petname + " very much!");
      }
      }
}
   