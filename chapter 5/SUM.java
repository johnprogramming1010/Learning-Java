import java.util.Scanner;
public class SUM{
public static void main(String[] args){

int value, num, sum = 0;

Scanner scan = new Scanner(System.in);

System.out.println("Enter a value.");
value = scan.nextInt();

if (value < 2)
      System.out.println("Enter a value greater than or equal to 2.");
   else
      if (value >= 2) {
         for (int i = 2; i <= value; i += 2) {
                sum += i;
      
      System.out.println(sum);
      }
      }
      }
      }