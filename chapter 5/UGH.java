import java.util.Scanner;
public class UGH{
public static void main(String[] args){

String input;

Scanner scan = new Scanner(System.in);
input = scan.nextLine();

System.out.println("Output :");
 
for(int i = 0 ; i < input.length(); i++){
   System.out.println(input.charAt(i));
}
}
}