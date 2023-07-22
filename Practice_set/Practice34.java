// Conditional Statements (Ternary Operator)

import java.util.*;

public class Practice34 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your marks:");
    int marks = sc.nextInt();

    String status = (marks >= 33) ? "PASS" : "FAIL" ;
    System.out.println(status);
  }
}