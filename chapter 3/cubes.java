import java.util.Scanner;
public class cubes{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);
 int a, b;
 double SumA, SumB;
 
 System.out.println("enter the value of the first sum");
 a = scan.nextInt();
 
 System.out.println("enter the value of the second sum");
 b = scan.nextInt();
 
 SumA = Math.pow(a, 3);
 SumB = Math.pow(b, 3);
 
 System.out.println("The value of a is: " + SumA);
 System.out.println("The value of b is: " + SumB);
 }
 }