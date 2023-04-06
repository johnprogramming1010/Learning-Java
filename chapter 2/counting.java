import java.util.Scanner;
public class counting{
   public static void main(String[] args){
   {
   int quarters, dimes, nickles, pennies;
   double dollars, cents;
   
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the amount of quarters");
   quarters = scan.nextInt();
   
   System.out.println("Enter the amount of dimes");
   dimes = scan.nextInt();
   
   System.out.println("Enter the amount of nickles");
   nickles = scan.nextInt();
   
   System.out.println("Enter the amount of pennies");
   pennies = scan.nextInt();
   
   cents = quarters * 0.25 + dimes * 0.10 + nickles * 0.05 + pennies * 0.01;
   
   System.out.println("Total cents:" + cents);
   }
   }
}
   