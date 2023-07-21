// Conditional Statements (ternary operator)

import java.util.*;

public class Practice33 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();

    String type =((a%2) == 0) ? "Even" : "Odd";

    System.out.println("Number is "+type);
  }
}