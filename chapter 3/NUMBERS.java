import java.util.Random;
public class NUMBERS{
public static void main(String[] args){

Random generator = new Random();

int num1, num2, num3, num4; 
 num1 = generator.nextInt(9) + 1;
 num2 = generator.nextInt(7) + 1;
 num3 = generator.nextInt(6) + 1;
 num4 = generator.nextInt(4) + 1;

System.out.println("" + num2 + num2 + num2 + "-" + num3 + num4 + num4 + "-" + num1 + num1 + num1 + num1);
}
}