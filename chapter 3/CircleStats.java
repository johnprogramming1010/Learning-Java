import java.util.Scanner;
import java.text.DecimalFormat;
public class CircleStats{

public static void main(String[] args){
{
   Scanner scan = new Scanner(System.in);
   
   int radius;
   double area, circumference;
   
   System.out.println("Enter the circle's radius ");
   radius = scan.nextInt();
   
   
   area = Math.PI * Math.pow(radius, 2);
   circumference = 2 * Math.PI * radius;
  
   DecimalFormat fmt = new DecimalFormat("0.##");
   
   System.out.println("The area of the circle: " + fmt.format(area));
   System.out.println("The circumference of the circle: " + fmt.format(circumference));
   }
   }
}  