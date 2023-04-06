import java.util.Scanner;
import java.text.DecimalFormat;
public class Length{
public static void main(String[] args){

int s, a, b, c;
double area;

Scanner scan = new Scanner(System.in);

System.out.println("Enter the value for s");
s = scan.nextInt();

System.out.println("Enter the value for a");
a = scan.nextInt();

System.out.println("Enter the vale for b");
b = scan.nextInt();

System.out.println("Enter the value for c");
c = scan.nextInt();

area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));

DecimalFormat fmt = new DecimalFormat("0.###");

System.out.println("The area is: " + fmt.format(area));
}
}

