// Conditional Statements - (Odd or Even)
import java.util.*;

public class Practice29 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int A = sc.nextInt();

    if(A%2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}
