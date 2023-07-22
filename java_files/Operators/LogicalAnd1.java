import java.util.*;

public class LogicalAnd1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number greater than 1:");
    int A = sc.nextInt();
    System.out.println("Enter a number less than 9:");
    int B = sc.nextInt();
    System.out.println((A>1) && (B<9));
  }
}