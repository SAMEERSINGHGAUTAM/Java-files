import java.util.*;

public class Question1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    double a = sc.nextDouble();
    System.out.println("Enter the second number");
    double b = sc.nextDouble();
    System.out.println("Enter the third number");
    double c = sc.nextDouble();
     float Average = (float)((a+b+c)/3) ;
     System.out.println("Average is: "+Average);
  }
}