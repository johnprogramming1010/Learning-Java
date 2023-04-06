import java.util.Scanner;
import java.text.DecimalFormat;
public class radius{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);

int r;
double volume, surfaceArea;

System.out.println("Enter the radius");
r = scan.nextInt();

volume = ((4 * Math.PI * Math.pow(r, 3) / (3)));
surfaceArea = (4 * Math.PI * Math.pow(r, 2));

DecimalFormat fmt = new DecimalFormat("0.####");

System.out.println("The volume is: " + fmt.format(volume));
System.out.println("The Surface area is: " + fmt.format(surfaceArea));
}
}