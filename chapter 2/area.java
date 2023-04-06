import java.util.Scanner;
public class area{
   public static void main(String[] args){
   {

int squareside, area, perimeter;
 
   Scanner scan = new Scanner(System.in);
   
   System.out.println("length of square side:");
   squareside = scan.nextInt();
   
   area = squareside * squareside;
   
   perimeter = squareside * 4;
   
   System.out.println("the area of the square is " + area + ". The perimeter of the square is " + perimeter+".");
   }
   }
}