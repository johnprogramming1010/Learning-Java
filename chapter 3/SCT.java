import java.util.Random;
public class SCT{

public static void main(String[] args){

Random generator = new Random();

int Integer;
double sine, cosine, tangent;

Integer = generator.nextInt(40) + 20;

sine = Math.sin(Integer);
cosine = Math.cos(Integer);
tangent = Math.tan(Integer);

System.out.println("The sine is: " + sine + ". The cosine is: " + cosine + ". The tangent is: " + tangent + ".");
}
}