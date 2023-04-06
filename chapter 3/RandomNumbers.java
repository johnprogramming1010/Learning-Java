import java.util.Random;
public class RandomNumbers{

public static void main(String[] args){
{
   Random Generator = new Random();
   int num1;
   float num2;
   
   num1 = Generator.nextInt();
   System.out.println("A random Integar: " + num1);
   
   num1 = Generator.nextInt(10);
   System.out.println("Integar from 0 to 9: " + num1);
   
   num1 = Generator.nextInt(10) + 1;
   System.out.println("Interger from 1 to 10: " + num1);
   
   num1 = Generator.nextInt(15) + 20;
   System.out.println("Interger from 25 to 34: " + num1);

   num1 = Generator.nextInt(20) - 10;
   System.out.println("Interger from -10 to 9: " + num1);
   
   num2 = Generator.nextFloat();
   System.out.println("Random decimal from 0 to 1: " + num2);
   
   num2 = Generator.nextFloat() * 6;
   System.out.println("Interger from 0 to <6: " + num2);
   }
   }
}