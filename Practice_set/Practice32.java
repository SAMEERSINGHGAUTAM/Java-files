// Conditional statements (else-if)
import java.util.*;
public class Practice32 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int A = sc.nextInt();
    System.out.println("Enter the second number:");
    int B = sc.nextInt();
    System.out.println("Enter the third number:");
    int C = sc.nextInt();

    if( A>B && A>C ) {
      System.out.println(A+" is greatest");
    } else if( B>C ) {
      System.out.println(B+" is largest");
    } else {
      System.out.println(C+" is largest");
    }
  }
}