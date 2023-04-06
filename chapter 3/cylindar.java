import java.util.Random;
public class cylindar{
public static void main(String[] args){

int r, h;
double volume, surfaceArea;

Random generator = new Random();

r = generator.nextInt(20) + 1;
h = generator.nextInt(20) + 1;

volume = Math.PI * Math.pow(r, 2) * h;
surfaceArea = 2 * Math.PI * r * h;

System.out.println("The volume is: " + volume);
System.out.println("The surface area is: " + surfaceArea);
}
}