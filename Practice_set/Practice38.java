
// Conditional Statements (Practice Question-1)
import java.util.*;

public class Practice38 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int a = sc.nextInt();

    String type = (a >= 0) ? "Positive" : "Negative" ;
    System.out.println(type);
  }
}