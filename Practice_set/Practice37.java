// Conditional Statements (Switch) - Calculator

import java.util.*;

public class Practice37 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number a: ");
    int a = sc.nextInt();
    System.out.println("Enter the number b: ");
    int b = sc.nextInt();

    System.out.println("Enter the operator for the operation : ");
    char c = sc.next().trim().charAt(0);
    

    switch(c) {
      case '+' : System.out.println("Add = "+ (a+b));
                  break;
      case '-' : System.out.println("Subtract = "+ (a-b));
                  break;
      case '*' : System.out.println("Multiply = "+ (a*b));
                  break;
      case '/' : System.out.println("Division = "+ (a/b));
                  break;
      case '%' : System.out.println("Remainder = "+ (a%b));
                  break;
      default  : System.out.println("Not a valid character");
    }
  }
}