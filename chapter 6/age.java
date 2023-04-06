import java.util.Scanner;
public class age{
public static void main(String[] args){

final int Minor = 21;
Scanner scan = new Scanner(System.in);

System.out.println("Enter your age");
int age = scan.nextInt();

System.out.println("Your age: " + age);

if (age < Minor)
   System.out.println("Enjoy your youth");
if (age > Minor)  
System.out.println("Age is just a concept");
  }
}