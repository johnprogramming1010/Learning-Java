import java.util.Scanner;
public class THISBEHARD{
public static void main(String[] args)
{
   {
   int totalseconds;
   double hours, minutes, seconds, a, b;
 
   
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Input the total seconds");
   totalseconds = scan.nextInt();
   
   hours = totalseconds/3600;
   
   a = totalseconds%3600;
   
   minutes = (a/60);
   
   b = totalseconds%60;
   
   seconds = (totalseconds/3600) - hours - minutes;
   System.out.println("Total amount of seconds in hours:" + hours + " minutes:"+ minutes + " seconds: " + b);
   }
   }
}