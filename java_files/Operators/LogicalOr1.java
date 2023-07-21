import java.util.*;

public class LogicalOr1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number less than 20 :");
    int A = sc.nextInt();
    System.out.println("Enter another number greater than 15:");
    int B = sc.nextInt();
    System.out.println("A is less than 20 or B is greater than 15: "+ ((A<20) || (B>15)));
    System.out.println("false || true: "+ ((A>20) || (B>15)));
    System.out.println("true || false: "+ ((A<20) || (B<15)));
    System.out.println("true || true: "+ ((A>20) || (B>15)));
    System.out.println("false || false: "+ ((A>20) || (B<15)));
  }
}