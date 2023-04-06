import java.util.Scanner;
public class XY{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);

int x1, x2, y1, y2;
double xPow, yPow, xyDis;

System.out.println("Enter the value of x1");
x1 = scan.nextInt();

System.out.println("Enter the value of x2");
x2 = scan.nextInt();

System.out.println("Enter the value of Y1");
y1 = scan.nextInt();

System.out.println("Enter the value of Y2");
y2 = scan.nextInt();


xPow = Math.pow((x2 - x1), 2);
yPow = Math.pow((y2 - y1), 2);
xyDis = Math.sqrt((xPow + yPow));

System.out.println("The distance between the two points: " + xyDis);
}
}