import java.util.Scanner;
public class Quadratic
{
   public static void main(String[] args){
   {
   Scanner scan = new Scanner(System.in);
   
      int a, b, c;
      double discriminant, root1, root2;
      
      System.out.println("Enter the coefficient of x squared: ");
      a = scan.nextInt();
      
      System.out.println("Enter the coefficient of x: ");
      b = scan.nextInt();
      
      System.out.println("Enter the constant: ");
      c = scan.nextInt();
      
      discriminant = Math.pow(b, 2) - (4 * a * c);
      root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
      root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
      
      System.out.println("Value of root 1 is: " + root1);
      System.out.println("Value of root 2 is: " + root2);
      }
      }
}
      