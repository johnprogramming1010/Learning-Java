import java.util.Scanner;
public class speed
{
   public static void main(String[] args){
   {
   int speed, distance;
   double time;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("input your speed");
      speed = scan.nextInt();
      
      System.out.println("Input the distance");
      distance = scan.nextInt();
      
      time = distance / speed;
      System.out.println("Total time:" + time);
      }
      }
      }
      