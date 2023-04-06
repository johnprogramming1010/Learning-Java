import java.util.Scanner;
public class ReverseNumbers{
public static void main(String[] args){

int number, lastDigit, reverse = 0;

Scanner scan = new Scanner(System.in);

System.out.println("Enter a positive number to be reversed.");
number = scan.nextInt();

do{
   lastDigit = number % 10;
   reverse = (reverse * 10) + lastDigit;
   number = number / 10;
  }
  while (number > 0);
  
  System.out.println("That number reversed is: " + reverse + ".");
  System.out.println(lastDigit);
  }
  }
  
   