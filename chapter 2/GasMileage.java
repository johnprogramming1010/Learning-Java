import java.util.Scanner;
public class GasMileage
{
   public static void main(String[] args){
   {
   int miles;
   double gallons, mpg;
   
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Enter the amount of miles:");
   miles = scan.nextInt();
   
   System.out.println("Enter the amount of gasoline used");
   gallons = scan.nextDouble();
   
   mpg = miles / gallons;
   
   System.out.println("Your mpg is " + mpg);
   }
   }
}