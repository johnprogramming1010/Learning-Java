public class TempConverter
{
   public static void main(String[] args){
   {
   final int Base= 32;
   final double Factor= 9/5; 
   
   double FarenheightTemp;
   int CelsiusTemp = 28;
   
   FarenheightTemp = (CelsiusTemp * Factor) + Base;
   
   System.out.println("Celsius: " + CelsiusTemp);
   System.out.println("Farenheight to Celsius: " + FarenheightTemp);
   }
   }
}