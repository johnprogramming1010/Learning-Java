import java.util.Scanner;
public class GradeReport{
public static void main(String[] args){

int grade, category;
Scanner scan = new Scanner(System.in);

System.out.println("Enter a Numerical grade from (0 to 100.");
grade = scan.nextInt();

category = grade / 10;

System.out.println("That grade is: ");

switch (category){
   case 10:
      System.out.println("A perfect score well-done.");
      break;
   case 9:
      System.out.println("A good score good job.");
      break;
   case 8:
      System.out.println("above average nice job.");
      break;
   case 7:
      System.out.println("average");
      break;
   case 6:
      System.out.println("lower than average. You need to see the professor.");
      break;
   default:
      System.out.println("horrible");
      }
      }
      }