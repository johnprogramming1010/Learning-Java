import java.util.Scanner;
public class FtoC
{

   public static void main(String[] args){
   {
   final int Base = 32;
   final double factor = 5/9;
   double farenheight, celsius;
  
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Enter the farenheight");
   farenheight = scan.nextInt();
   
   celsius = (farenheight - 32) * 5/9;
   
   System.out.println("Celsius is:" + celsius);
   }
   }
   
}
   
   
   